package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pom.HomePagePOM;
import org.example.pom.revenueCalculatorPOM;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FitPeo {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://fitpeo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
        File file=new File("D://sample1.img");
        FileHandler.copy(sourceFile,file);


        PageFactory.initElements(driver, HomePagePOM.class);
        PageFactory.initElements(driver, revenueCalculatorPOM.class);
        HomePagePOM.RevenueCalculator.click();
        Thread.sleep(2000);

        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("window.scroll(0,450)","");

        Actions actions = new Actions(driver);
        actions.click(revenueCalculatorPOM.textField).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys("560").perform();

       revenueCalculatorPOM.checkBox.click();


        //executor.executeScript("window.scroll(0,-450)","");
        String text=revenueCalculatorPOM.text.getText();
        System.out.println(text);
        String expectedText="$31920";
        Assert.assertEquals("same Amount",text,expectedText);


    }
}