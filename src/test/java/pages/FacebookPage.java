package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){  // constructor'u görünür hale getiriyoruz
                            // driver'ı tanımlıyoruz.
                            // Bu class'da bu driver kullanılacak diyoruz

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[7]")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginSayfasiEmailKutusu;

    @FindBy (xpath = "//input[@id='pass']")
    public  WebElement loginSayfasiPasswordKutusu;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement loginSayfasiLoginButonu;




}
