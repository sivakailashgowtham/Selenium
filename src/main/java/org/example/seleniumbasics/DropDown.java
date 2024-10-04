package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDown {
    /*
    select by index
              value
              id

     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
        driver.manage().window().maximize();
        WebElement dropDown1= driver.findElement(By.className("ui-selectonemenu"));
        Select select=new Select(dropDown1);

         select.selectByIndex(3);
         Thread.sleep(2000);
         select.selectByVisibleText("Cypress");

        List<WebElement> List=select.getOptions();
         int count=List.size();

         System.out.println("total count is " + count);

         dropDown1.sendKeys("Playwright");


    }
}
