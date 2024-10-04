package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
    /*

    point class to get x y co ordinates



     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");
        driver.manage().window().maximize();

       WebElement sizeOFButton= driver.findElement(By.id("j_idt88:j_idt94"));
       Point point= sizeOFButton.getLocation();
       int Xvalue= point.getX();
       int Yvalue= point.getY();
       System.out.println(Xvalue + " " +   Yvalue);

       WebElement colourButton=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
      String colour= colourButton.getCssValue("background-color");

      System.out.println("color name is " + colour);

      WebElement buttonSize=driver.findElement(By.id("j_idt88:j_idt98"));
      int height=buttonSize.getSize().getHeight();
     int width= buttonSize.getSize().getWidth();

     System.out.println("height is " + height + "width is " + width);

    }
}
