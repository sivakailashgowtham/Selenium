package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml");

      WebElement from= driver.findElement(By.id("form:drag_content"));

      WebElement to=driver.findElement(By.id("form:drop_header"));

        Actions actions=new Actions(driver);

        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();

    }
}
