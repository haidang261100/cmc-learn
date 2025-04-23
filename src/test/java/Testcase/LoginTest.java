package Testcase;

import Common.BaseTest;
import Page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testValidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"), "Không điều hướng đến trang inventory!");
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void testInvalidLoginWrongPass() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "wrongPass");
        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface: Username and password do not match any user in this service"));
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void testInvalidLoginWrongUser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user123", "secret_sauce");
        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface: Username and password do not match any user in this service"));
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void testInvalidLoginWithNull() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");
        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface: Username is required"));
        Thread.sleep(2000);
    }
}
