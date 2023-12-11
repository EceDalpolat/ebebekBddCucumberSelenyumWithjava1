package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class HomePage extends BrowserDriver {
    public static By  searcBoxCssSelector=By.cssSelector("#txtSearchBox");
    public static By productClickcssSelector=By.cssSelector(".popular-search > li:nth-of-type(1)");
    public static By  productId=By.id("txtItemQuantity");

    public static By cartId= By.xpath("//button[@class='btn btn-add ng-star-inserted']");
    public static By cartViewId=By.id("btnShowCart");
    public static void clickSearchBox() throws InterruptedException {

      WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated((searcBoxCssSelector)));
        searchBox.click();

    }
    public static void clickProduct() throws InterruptedException {
        WebElement productClick = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated((productClickcssSelector)));
                productClick.click();
    }


    public static void productControl() throws InterruptedException {
        WebElement cart = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated((productId)));

        boolean isProductInCart = cart.isDisplayed();
        assertTrue("Ürün sepette görünüyor.", isProductInCart);

    }



    public static void clickAddProductCart()  {
        WebElement addProduct= new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(cartId));
        addProduct.click();

    }
    public static void clickViewCart()  {
        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated((cartViewId)));
        searchBox.click();

    }

}