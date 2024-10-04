package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();

       WebElement checkBox1= driver.findElement(By.xpath(
               "//span[contains(text(),'Basic')]"));
       checkBox1.click();



    }
}
