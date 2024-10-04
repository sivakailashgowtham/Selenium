package org.example.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class revenueCalculatorPOM {

    @FindBy(xpath = "//input[@id=\":r0:\"]")
    public static WebElement textField;

    @FindBy(xpath = "//p[contains(text(),'CPT-99091')]/..//input[@type='checkbox']")
    public static WebElement checkBox;

    @FindBy(xpath = "//p[contains(text(),'Total Recurring Reimbursement for all Patients Per Month:')]//p")
    public static WebElement text;
}
