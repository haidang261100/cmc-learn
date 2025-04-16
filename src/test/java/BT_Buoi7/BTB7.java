package BT_Buoi7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class BTB7 {
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




    @Test
    public void testRemoveCheckbox() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertEquals(message.getText(), "It's gone!");
        Thread.sleep(3000);
    }

    @Test
    public void testEnableTextInput() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='text']")));
        Assert.assertTrue(input.isEnabled());
        Thread.sleep(3000);
    }


    @Test
    public void testLoad1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        Assert.assertEquals(helloText.getText(), "Hello World!");
        Thread.sleep(3000);
    }

    @Test
    public void testLoad2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        Assert.assertEquals(helloText.getText(), "Hello World!");
        Thread.sleep(3000);
    }

    @Test
    public void testSelectOption1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 1");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1");
        Thread.sleep(3000);
    }

    @Test
    public void testSelectOption2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 2");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2");
        Thread.sleep(3000);
    }

    @Test
    public void testAllMenu() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");

        Arrays Arrays = null;
        List<String> expectedItems = Arrays.asList("Home", "About", "Contact Us", "Portfolio", "Gallery");
        List<WebElement> menuItems = driver.findElements(By.cssSelector("ul li a"));
        for (WebElement item : menuItems) {
            Assert.assertTrue(expectedItems.contains(item.getText()));
        }
        Thread.sleep(3000);
    }

    @Test
    public void testAlertAccept() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You successfully clicked an alert");
        Thread.sleep(3000);
    }

    @Test
    public void testPromptInput() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("yeah");
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: yeah");
        Thread.sleep(3000);
    }



    @Test
    public void testAddElement() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        Assert.assertTrue(driver.findElement(By.className("added-manually")).isDisplayed());
        Thread.sleep(3000);
    }

    @Test
    public void testDeleteElement() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        WebElement deleteBtn = driver.findElement(By.className("added-manually"));
        deleteBtn.click();

//        Assert.assertFalse(deleteBtn.isDisplayed());
        List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        Assert.assertTrue(deleteButtons.isEmpty());
        Thread.sleep(3000);
    }





}
