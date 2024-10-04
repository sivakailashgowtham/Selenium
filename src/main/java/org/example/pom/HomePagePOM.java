package org.example.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(xpath = "//div[contains(text(),'Revenue Calculator')]")
    public static WebElement RevenueCalculator;
}
