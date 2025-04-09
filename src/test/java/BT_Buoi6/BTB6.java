package BT_Buoi6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class BTB6 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    // Test Case 1: Kiểm tra tiêu đề trang chủ
    @Test
    public void testNavigateToSauceDemo_HomepageTitle() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(actualTitle, expectedTitle, "Title không đúng!");
        Thread.sleep(2000);
    }

    // Test Case 2: Kiểm tra URL
    @Test
    public void testNavigateToSauceDemo_URL() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/";
        Assert.assertEquals(actualURL, expectedURL, "URL không đúng!");
//        Thread.sleep(2000);
    }


 // Login
    // Test Case 3: Đăng nhập thành công
    @Test
    public void testLoginWithValid() throws InterruptedException {
        loginWithValid();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"), "Không điều hướng đến trang inventory!");
//        Thread.sleep(2000);
    }

    // Test Case 4: Đăng nhập thất bại
    @Test
    public void testLoginWithInvalidPass() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("user1");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("login-button")).click();


        By Error = By.cssSelector("[data-test='error']");
        Assert.assertTrue(driver.findElement(Error).isDisplayed(), "Không hiển thị thông báo lỗi");
        Assert.assertEquals(driver.findElement(Error).getText(),"Epic sadface: Username and password do not match any user in this service","Mã lỗi hiển thị không trùng khớp");
        Thread.sleep(2000);
    }


    // Test Case 5: Kiểm tra số lượng sản phẩm
    @Test
    public void testProductCount() throws InterruptedException {
        loginWithValid();
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        Assert.assertEquals(products.size(), 6, "Số lượng sản phẩm không đúng!");
        Thread.sleep(2000);
    }

    // Test Case 6: Kiểm tra tên sản phẩm không rỗng
    @Test
    public void testProductNames() throws InterruptedException {
        int n = 1;
        loginWithValid();
        List<WebElement> productNames = driver.findElements(By.className("inventory_item_name"));

        for (WebElement product : productNames) {
            String name = product.getText();
            System.out.println("Product: " + name);
            Assert.assertFalse(name.isEmpty(), "Tên sản phẩm thứ " + n + " bị rỗng!");
            n++;
        }
        Thread.sleep(2000);
    }


    public void loginWithValid() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
