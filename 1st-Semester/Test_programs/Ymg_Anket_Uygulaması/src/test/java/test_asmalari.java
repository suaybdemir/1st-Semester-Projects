


import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


  public class test_asmalari {
    programm programm;

    protected WebDriver driver;
    @BeforeAll
    public void herseyden_oncee(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");


    }
    @Test
    //bu metota doğru değer gondermek
    public void ogrno_dogru_ise(){
        programm.ogr_num_input("2212101050");
        Assertions.assertEquals("2212101050",programm.dogru_bilgi_giris()," aferin doğru girdin ");

    }
    @Test

    public void ogrno_bos_giris(){
        programm.ogr_num_input(" ");
        Assertions.assertEquals("2212101050",programm.bos_bir_bilgi_gris()," boş girilemez");

    }
    @Test

    public void ayni_deger_girisi(){
        programm.ogr_num_input("2212101050");
        Assertions.assertEquals("2212101050",programm.dogru_bilgi_giris()," girilen değerin üstüne yeni bir değer girebilirsiniz ");

    }
    @Test

    public  void ogrno_harf_girisi(){
        programm.ogr_num_input("Suayb");
        Assertions.assertEquals("2212101050",programm.yaziyla_giris()," harf gönderemezsiniz ");

    }

    @BeforeEach
    public void hermetotonce(){
        driver=new ChromeDriver();
        driver.get("http://elvanduman.com/");
        programm =new programm(driver);

    }









    @AfterEach
    public void hermetodsonunda (){
        driver.findElement(By.cssSelector(".form-control[name='secenek']")).click();

        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.quit();

    }





}
