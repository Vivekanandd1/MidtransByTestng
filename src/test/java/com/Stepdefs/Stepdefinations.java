package com.Stepdefs;

import com.PageObject.HomPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stepdefinations {
    WebDriver driver;
    HomPageObject homPageObject;
    String Url = "https://demo.midtrans.com/";


    @Given("User open browser")
    public void user_open_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Url);

        homPageObject = new HomPageObject(driver);
    }
    @Given("User navigated to home page url")
    public void user_navigated_to_home_page_url() {
        driver.get(Url);
    }
    @When("User clicked on BUYNOW button")
    public void user_clicked_on_button() {
        homPageObject.setBuyBtn();
    }
    @Then("User filled up Checkout form")
    public void user_filled_up_checkout_form() {
        homPageObject.checkout();
    }
    @Then("User completed Transaction process")
    public void user_completed_transaction_process() {
      homPageObject.transaction();
      homPageObject.teardown();
    }
}
