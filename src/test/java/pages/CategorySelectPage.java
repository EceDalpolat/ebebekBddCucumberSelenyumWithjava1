package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.driver;

public class CategorySelectPage {

    public static By CategoryId=By.id("lnkEbebekCategoryNavNode");
     public static By altCategoryXpath=By.xpath("//span[.='Bebek Giyim']");
     //cssselector=#lnkBabyClothingNavNode > span
     public static By selectClik=By.xpath("//div[@class='d-none d-lg-flex my-order__sorting-type']/a[.='Akıllı Sıralama']");

     public static By enCoksatanClik=By.cssSelector(".sorting-list > a:nth-of-type(2)");
     //cssselecetor=.sorting-list > a:nth-of-type(2)
    //xpath=//a[.='En Çok Satanlar']

     public static By addBtnCssSeelector=By.id("addToCartBtn");

     public static By yasSecButonu=By.xpath("//label[.='6 Ay']");
    public static By cartViewId=By.id("btnShowCart");
     public static  By arttirmaId=By.id("btnPlus");
     //cssselector=eb-cart-item-list > div:nth-of-type(1) button:nth-of-type(2) > i:nth-of-type(1)

     public static By messageXpath=By.xpath("//span[contains(.,'Bu ürünün izin verilen satış adedi sınırına ulaştınız. Bu sebeple sepetinize bu')]");
     public static void clickCategory() throws InterruptedException {

        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated((CategoryId)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBox);
        searchBox.click();

    }

    public static void clickAtCategory(){
        WebElement clickAltC = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable((altCategoryXpath)));
        clickAltC.click();

    }

    public static void clickSelect() throws InterruptedException {

        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated((selectClik)));
        searchBox.click();

    }

    public static void clickEncokSatan() throws InterruptedException {

        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated((enCoksatanClik)));
        searchBox.click();

    }

    public static void clickBtnAdd() throws InterruptedException {

        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated((addBtnCssSeelector)));
        searchBox.click();

    }

    public static void yasSecButonu(){
        WebElement yasSec = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated((yasSecButonu)));
        yasSec.click();
    }

    public static void clickBtnAdd2() throws InterruptedException {

        WebElement buton = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".add"))));
        buton.click();

    }
    public static void clickViewCart()  {
        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated((cartViewId)));
        searchBox.click();

    }

    public static void clickArttirmaBtn() throws InterruptedException {

        for (int i = 0; i < 10; i++) {  // Örnek olarak 5 defa arttırma işlemi
            Thread.sleep(1000);
            driver.findElement(arttirmaId).click();
        }
    }

    public static void getMesage(){
        String actualText=driver.findElement(messageXpath).getText();


        String expectedText = "Bu ürünün izin verilen satış adedi sınırına ulaştınız. Bu sebeple sepetinize bu üründen daha fazla ekleyemezsiniz.";
        Assert.assertEquals(actualText, expectedText, "Metin eşleşiyor");

    }
}
