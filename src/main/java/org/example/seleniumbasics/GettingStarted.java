package org.example.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingStarted {

    /*
    Aim:Automation  ---WebApplication

    Programming Language---Java
    Automation framework---Selenium
    IDE---------IntelliJ





     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //gecko driver for firefox
        //driver i am going to use and its location
        WebDriver driver = new ChromeDriver();
        //it will launch a chrome browser
        //firefox driver for firefox
        driver.get("https://fitpeo.com/");
        driver.quit();
        //close the browser

    }
}
