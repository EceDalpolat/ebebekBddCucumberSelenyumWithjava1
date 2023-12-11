package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import java.util.List;

import static pages.CategorySelectPage.*;
public class CategorySelect {

    private BrowserDriver browserDriver;
    private WebDriver driver;

    @Given("e-bebek sitesi açılır")
    public void e_bebek_sitesi_açılır() throws InterruptedException {
        Thread.sleep(2000);
        this.browserDriver = new BrowserDriver();
        this.driver = browserDriver.getDriver("chrome");
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

    }
    @When("Çıkan reklamlar ve çerezler kapatır")
    public void çıkanReklamlarVeÇerezlerKapatır() throws InterruptedException {
        Thread.sleep(20000);
        List<WebElement> reklamElementleri = driver.findElements(By.className("ins-close-button"));
        for (WebElement reklam : reklamElementleri) {
            reklam.click();
        }
    }

    @And("Kategoriler sekmesi açılır")
    public void kategorilerSekmesiAçılır() throws InterruptedException {
        clickCategory();
    }
    @And("kategorileren bebek giyim tıklanır")
    public void kategorilere_tıklanır() throws InterruptedException {
       clickAtCategory();
    }

    @And("Akıllı arama selecti açılır")
    public void akıllı_arama_selecti_açılır() throws InterruptedException {
        clickSelect();
    }
    @And("Akıllı arama selecti altında tipi seçilir")
    public void akıllı_arama_selecti_altında_seçilir() throws InterruptedException {
      clickEncokSatan();
    }
    @And("Ilk ürün için sepete ekle butonuna tıklanır")
    public void ılk_ürün_sepete_eklenir() throws InterruptedException {
       clickBtnAdd();
    }
    @And("Çıkan ekranda istenilen seçeneğe tıklanır")
    public void çıkanEkrandaAySeçeneğiTıklanır() {
        yasSecButonu();
    }
    @And("Yeniden sepete ekle butonuna tıklanır")
    public void yenidenSepeteEkleButonunaTıklanır() throws InterruptedException {
        clickBtnAdd2();
    }
    @And("Sepeti gör butonuna tıklanır")
    public void sepeti_gör_butonuna_tıklanır() {
        clickViewCart();
    }
    @And("Ürünün sayısı max düzeyde arttırılır")
    public void ürünün_sayısı_max_düzeyde_arttırılır() throws InterruptedException {
        clickArttirmaBtn();
    }
    @Then("Max ürün mesajı ekranda görülür")
    public void max_ürün_mesajı_ekranda_görülür() {
        getMesage();
    }



}
