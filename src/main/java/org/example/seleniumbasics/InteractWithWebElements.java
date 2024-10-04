package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithWebElements {

    /*
    way to find web elements
    Id,name,className,Xpath,css selector

    linktext for selecting links

    if we have two links with same name it will interact with first web element

    Partial link text for



     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fitpeo.com/");
        driver.manage().window().maximize();

        //linktext
        driver.findElement(By.linkText("Medical Kit")).click();
       // driver.findElement(By.xpath("//div[contains(text(),\"Home\")]")).click();
        Thread.sleep(2000);
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("window.scroll(0,450)","");
       // driver.findElement(By.xpath("//button[contains(text(),'Contact Us')]")).click();

    }

}
