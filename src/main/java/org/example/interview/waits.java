package org.example.interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {

    /*
    why not to use thread.sleep
            if we ae giving thread.sleep, it will wait for mentioned time if an element
              is interactable within 1sec it still waits for 4 sec
     Selenium waits
      Implicit
      Explicit
      Fluent

      implicit wait
         It will check an element is present in DOM only it won't check an element is visible a
      and ready to use and interact
          We cant define any condition

       Explicit wait
         condition to check and interact
         1)Element to be clickable
         2)Element to be selected

         create an object for web driver wait class

         we can mix implicit and explicit wait together

       Fluent Wait

         tel web driver to wait for condition and frequency to check the condition
         So we are reducing the burden of polling






     */
    public static void main(String[] args){



        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));


        Wait<WebDriver>wait1=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);



    }
}
