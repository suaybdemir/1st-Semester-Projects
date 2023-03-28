import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class programm {
    private WebDriver driver;

    private final By girisno= By.id("exampleFormControlInput1");


    public programm(WebDriver driver){
        this.driver=driver;

    }

    public void ogr_num_input(String an){
        WebElement name = driver.findElement(girisno);
        name.click();
        name.sendKeys(an);

    }
    public String dogru_bilgi_giris(){
        WebElement namespace = driver.findElement(girisno);
        return namespace.getAttribute("value");
    }

    public String bos_bir_bilgi_gris(){
        WebElement namespace= driver.findElement(girisno);
        return namespace.getAttribute("value");
    }
    public String yaziyla_giris(){
        WebElement namespace= driver.findElement(girisno);
        return namespace.getAttribute("value");
    }

}
