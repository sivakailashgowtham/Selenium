package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
        driver.manage().window().maximize();

       WebElement radiobutton= driver.findElement(By.xpath("//input[@id=\"j_idt87:console1:3\"]"));
       radiobutton.click();


    }
}
