package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestotomasyonuFormPage {

    public TestotomasyonuFormPage(){    // constructor'u görünür hale getiriyoruz
                                    // driver'ı tanımlıyoruz.
                                    // Bu class'da bu driver kullanılacak diyoruz

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@*='prod-img']")
    public List<WebElement> bulunanUrunelementleriList;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsimElementi;

    @FindBy(xpath = "(//span[@class='menu-icon-text'])[1]")
    public WebElement accountLinki;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement loginSayfasiEmailKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement loginSayfasiPasswordKutusu;

    @FindBy(xpath = "//*[@id='submitlogin']")
    public WebElement loginSayfasiSubmitButonu;

    @FindBy(xpath = "//span[.='Logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public WebElement ddGunOpsiyonu;

    @FindBy(xpath = "(//*[@class='form-control'])[4]")
    public WebElement ddAyOpsiyonu;

    @FindBy(xpath = "(//*[@class='form-control'])[5]")
    public WebElement ddYilOpsiyonu;



}
