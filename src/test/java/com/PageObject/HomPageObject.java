package com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomPageObject {
    private  WebDriver driver;
    private By BuyBtn = By.cssSelector("a.btn.buy");
    private By CheckoutBtn = By.cssSelector("div.cart-checkout");
    private By ContinueBtn = By.cssSelector("a.button-main-content");
    private By CreditCardBtn = By.cssSelector("a.list.with-promo");
    private By CreditcardTextBox = By.name("cardnumber");
    private By ExpiryDateBox = By.cssSelector("input[placeholder='MM / YY']");
    private By CVVBox = By.cssSelector("input[inputmode='numeric']");
    private By PayNowBtn = By.cssSelector("a.button-main-content");
    private By PasswordBox = By.cssSelector("input.form-control.input-xs");
    private By OkBtn = By.cssSelector("button.btn.btn-sm.btn-success");
    private By Frame = By.tagName("iframe");

    private String CreditCardNumber = "4811111111111114";
    private String ExpiryDate = "12/24";
    private String CVV = "123";
    private String Password = "112233";








    public HomPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void setBuyBtn() {
        driver.findElement(BuyBtn).click();
    }

    public void checkout(){
      driver.findElement(CheckoutBtn).click();
        WebElement Frameswitch = driver.findElement(Frame);
       driver.switchTo().frame(Frameswitch);
      driver.findElement(ContinueBtn).click();
    }

    public void transaction(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.findElement(CreditCardBtn).click();
        driver.findElement(CreditcardTextBox).sendKeys(CreditCardNumber);
        driver.findElement(ExpiryDateBox).sendKeys(ExpiryDate);
        driver.findElement(CVVBox).sendKeys(CVV);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowBtn));
        driver.findElement(PayNowBtn).click();
        WebElement Frameswitch = driver.findElement(Frame);
        driver.switchTo().frame(Frameswitch);
        driver.findElement(PasswordBox).sendKeys(Password);
        driver.findElement(OkBtn).click();
    }
    public void teardown(){
        driver.quit();
    }
}
