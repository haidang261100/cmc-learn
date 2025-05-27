package BT_Buoi8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class InventoryPage {
    // WebDriver instance to interact with the browser
    public WebDriver driver;

    // Constructor to initialize InventoryPage with a WebDriver
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for elements used
    public By item = By.className("inventory_item");
    public By itemName = By.className("inventory_item_name");

    // Retrieves the total number of products listed on the page
    public int getListItem() {
        List<WebElement> products = driver.findElements(item);
        return products.size(); // Return the number of product elements
    }

    public List<WebElement> getProductNames() {
        return driver.findElements(itemName);
    }
}