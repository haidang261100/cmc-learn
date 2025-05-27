package BT_Buoi8;


import org.testng.Assert;
import org.testng.annotations.Test;


public class RunTest extends Base{


    @Test //TC1.1: Check the correction of page title
    public void testTitle() {
        // Assert that the actual title matches the expected one
        Assert.assertEquals("Swag Labs", driver.getTitle());
    }

    @Test //TC1.2: Check the correction of url
    public void testUrl() {
        Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
    }

    @Test //TC2.1: Valid credentials
    public void validLogin() {
        Login loginPage = new Login(driver);
        loginPage.logIn("standard_user", "secret_sauce");
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Test //TC2.2: Invalid credentials
    public void invalidLogin() {
        Login loginPage = new Login(driver);
        loginPage.logIn("abc", "xyz");
        Assert.assertTrue(loginPage.errorNotice());
    }

    @Test //TC3.1: Get product list - check the number of products
    public void getProductList() {
        InventoryPage inventoryPage = new InventoryPage(driver);
        validLogin();
        Assert.assertEquals(6, inventoryPage.getListItem());
    }

    @Test // TC3.2: Get product name - check if each product's name is visible
    public void getProductName() {
        InventoryPage inventoryPage = new InventoryPage(driver);
        validLogin();
        inventoryPage.getProductNames().forEach(p -> Assert.assertTrue(p.isDisplayed()));
    }

    @Test // TC4.1: Checkout with all products successfully
    public void checkoutWithAllProduct() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        validLogin();
        Assert.assertTrue(checkoutPage.allItemCheckout());
    }

    @Test // TC4.2: Checkout with no product added to cart
    public void checkoutWithNoInformation() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        validLogin();
        Assert.assertTrue(checkoutPage.noInfoCheckout());
    }
}