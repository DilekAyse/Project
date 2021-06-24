import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HepsiburadaTest extends BaseTest{

    @Test
    public void hepsiburadaTest(){
        hepsiburadaPage.clickLogin();
        hepsiburadaPage.setEmail("testotomasyon41@gmail.com");
        Assertions.assertEquals("testotomasyon41@gmail.com", hepsiburadaPage.getEmail(),"E-posta değeri doğru değil !");
        hepsiburadaPage.setPassword("Testotomasyon41");
        Assertions.assertEquals("Testotomasyon41", hepsiburadaPage.getPassword(),"Parola değeri doğru değil !");
        hepsiburadaPage.clickLoginButton();
        Assertions.assertEquals("Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com", driver.getTitle());
        hepsiburadaPage.clickElectronicMenuArea();
        hepsiburadaPage.computerCategoryArea();
        Assertions.assertEquals("Bilgisayarlar",hepsiburadaPage.computerPageControl());
        hepsiburadaPage.selectComputerBrand();
        Assertions.assertEquals("MSI Bilgisayarlar",hepsiburadaPage.computerBrandControl());
        hepsiburadaPage.secondPage();
        Assertions.assertEquals("MSI Bilgisayarlar ve Fiyatları - Hepsiburada.com - Sayfa 2", driver.getTitle());
        hepsiburadaPage.selectSecondPrice();
        hepsiburadaPage.favoriteButton();
        hepsiburadaPage.favoriteList();
        Assertions.assertEquals("Listem - hepsiburada", driver.getTitle());
        Assertions.assertEquals("1 ürün", hepsiburadaPage.favoriteListPriceNumberControl());
        hepsiburadaPage.selectAllButton();
        //hepsiburadaPage.closePopUp();
        hepsiburadaPage.deletePriceButton();
        hepsiburadaPage.deletePrice();
        Assertions.assertEquals("0 ürün", hepsiburadaPage.deletePriceControl());
        hepsiburadaPage.clickProfile();
        hepsiburadaPage.logOutButton();
        Assertions.assertEquals("Giriş Yap", hepsiburadaPage.logOutControl());
    }
}
