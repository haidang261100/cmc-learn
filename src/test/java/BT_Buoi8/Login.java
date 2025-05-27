package BT_Buoi8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
    public WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public By usernameLocator = By.id("user-name");
    public By passwordLocator = By.id("password");
    public By buttonClick = By.id("login-button");
    public By error = By.cssSelector("[data-test='error']");

    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }
    public void enterPassword (String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public void logIn(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        driver.findElement(buttonClick).click();
    }

    public boolean errorNotice() {
        return driver.findElement(error).isDisplayed();
    }
}
