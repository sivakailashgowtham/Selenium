package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
    /*
    if we have id we need to select id first
    next name
    next class
    then only xpath
    Xpath is the location of the element
    Absolute
    relative

    text box is filled with text and then send keys it will append keys with sent value


     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fitpeo.com/");
        driver.manage().window().maximize();//method chaining
       WebElement HomeLink= driver.findElement(By.xpath("//div[contains(text(),\"Home\")]"));
       HomeLink.click();


        Thread.sleep(2000);
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("window.scroll(0,450)","");
       WebElement submitButton= driver.findElement(By.xpath("//button[contains(text(),'Contact Us')]"));
       submitButton.click();

        Thread.sleep(2000);
        WebElement nameBox=driver.findElement(By.id("input-name"));
        nameBox.sendKeys("sivakailash");

        WebElement phoneBox=driver.findElement(By.id("input-phoneNumber"));
                phoneBox.sendKeys("8248495754");

        WebElement mailBox=driver.findElement(By.id("input-email"));
        mailBox.sendKeys("siva@gmail.com");

        Thread.sleep(2000);
        submitButton.click();


    }

}
