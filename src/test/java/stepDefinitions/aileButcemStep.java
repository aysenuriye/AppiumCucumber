package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AppPage.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class aileButcemStep {
    AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
    TouchAction action=new TouchAction<>(driver);
    AileButcemPage page=new AileButcemPage();
    @Given("Kullanici kurulumlari tamamlar")
    public void kullanici_kurulumlari_tamamlar() {
        Driver.getAndroidDriver();
    }

    @Then("ilk ekran ayarlarini yapar ve {string} a tiklayin ve ardindan login sayfasina ulasin")
    public void ilkEkranAyarlariniYaparVeATiklayinVeArdindanLoginSayfasinaUlasin(String girisyap) {
        ReusableMethods.wait(2);
        for (int i=0;i<7; i++){
            action.press(PointOption.point(900,900))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(159,900)).release().perform();
        }
        ReusableMethods.wait(1);

  //     action.press(PointOption.point(900,900)).release().perform()
  //      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
  //             moveTo(PointOption.point(159,900)).release().perform();
        ReusableMethods.scrollWithUiScrollable(girisyap);
    }


    @Then("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void veBilgileriniGirerekKullaniciBilgileriyle(String mail, String sifre, String girisyap) {
        page.mailBox.sendKeys(ConfigReader.getProperty(mail));
        page.passwordBox.sendKeys(ConfigReader.getProperty(sifre));
        ReusableMethods.scrollWithUiScrollable(girisyap);
    }
    @Then("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        ReusableMethods.wait(1);
        page.girisBasariliMethodu();
    }
    @Then("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {
        ReusableMethods.wait(3);

        action.press(PointOption.point(120,240)).release().perform();
        page.hesabimBox.click();


    }
    @Then("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {

        action.press(PointOption.point(961,1391)).release().perform();
        action.press(PointOption.point(961,1391)).release().perform();
    }
    @Then("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }



}