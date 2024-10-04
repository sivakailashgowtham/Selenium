package org.example.pom;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WithoutFindBy {

   // public static WebElement j_idt88:j_idt91;
    //


        @Test
        public void testWithoutFindBy() {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.leafground.com/alert.xhtml");
            driver.manage().window().maximize();

            PageFactory.initElements(driver,WithoutFindBy.class);

           //WebElement alert = driver.findElement(By.id("j_idt88:j_idt91"));
            //diver will automatically find the element by order
            //alert.click();

            Alert alert1 = driver.switchTo().alert();
            //alert is an interface
            alert1.accept();
        }

}
