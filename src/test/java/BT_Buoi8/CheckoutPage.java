package BT_Buoi8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public WebDriver driver; // WebDriver instance to interact with browser elements
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public By shoppingCart = By.className("shopping_cart_link");
    public By goToCheckout = By.id("checkout");
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By postalCode = By.id("postal-code");
    public By continueButton = By.id("continue");
    public By finishButton = By.id("finish");
    public By completeCheck = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    public By errorDisplay = By.cssSelector("[data-test=\"error\"]");

    public void checkoutProcess(String firstname, String lastname, String zip) {
        driver.findElement(shoppingCart).click();
        driver.findElement(goToCheckout).click();
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(postalCode).sendKeys(zip);
        driver.findElement(continueButton).click();
    }

    public boolean allItemCheckout() {
        checkoutProcess("a", "b", "c");
        driver.findElement(finishButton).click();
        return driver.findElement(completeCheck).isDisplayed();
    }

    public boolean noInfoCheckout() {
        checkoutProcess("", "", "");
        return driver.findElement(errorDisplay).isDisplayed();
    }

}