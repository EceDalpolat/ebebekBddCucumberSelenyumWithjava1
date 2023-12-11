package StepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.test.context.TestContext;
import utility.BrowserDriver;

import java.time.Duration;
import java.util.List;

import static pages.HomePage.*;
import static utility.BrowserDriver.driver;

public class BasePage {
    private BrowserDriver browserDriver;
    private WebDriver driver;

    @Given("Kullanıcı e-bebek sitesini açabilmeli")
    public void kullanici_e_bebek_sitesini_acabilmeli() throws InterruptedException {
        Thread.sleep(2000);
        this.browserDriver = new BrowserDriver();
        this.driver = browserDriver.getDriver("chrome");
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

    }
    @When("Çıkan reklamlar ve çerezler kapatılmalı")
    public void kullanici_reklam_ve_cerezleri_kapatmali() throws InterruptedException {
        Thread.sleep(20000);
        List<WebElement> reklamElementleri = driver.findElements(By.className("ins-close-button"));
        for (WebElement reklam : reklamElementleri) {
            reklam.click();
        }
    }

        @And("Kullanıcı  arama çubuğuna  tıklayabilmeli")
        public void kullanici_arama_cubuguna_tiklayabilmeli() throws InterruptedException {
            clickSearchBox();


        }
        @And("Kullanıcı arama çubuğuna {string} yazabilmeli")
        public void kullanıcıAramaÇubuğunaUrunAdıYazabilmeli( String urunAdı) {

            WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#txtSearchBox")));
            searchBox.sendKeys(urunAdı);
        }
        @And("Kullanıcı ilk çıkan ürüne tıklayabilmeli")
        public void kullanici_ilk_cikan_ürüne_tiklayabilmeli() throws InterruptedException {
            clickProduct();
        }
    @And("Kullanıcı sepete ekle butonuna tıklayabilmeli")
    public void kullanıcıSepeteEkleButonunaTıklayabilmeli() {
        clickAddProductCart();
    }


        @And("Kullanıcı sepeti göster butonuna tıklayabilmeli")
        public void sepeteTikla() throws InterruptedException {
            clickViewCart();


        }



        @Then("Kullanıcı sepette ürünü görmeli")
        public void sepetiIncele() throws InterruptedException {
            productControl();


        }



}

