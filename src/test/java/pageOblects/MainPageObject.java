package pageOblects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPageObject {
    By From = By.xpath("//input[@id='origin']");
    By Where = By.xpath("//input[@id='destination']");
    By Button_Find = By.xpath("//button[@data-test-id='form-submit']");
    public By Result = By.xpath("//div[@data-test-id='card-text']/p");

    WebDriver webDriver;
    WebDriver wait;

    public MainPageObject (WebDriver driver) {
        webDriver = driver;
    }
    public void fillFromField (){
        webDriver.findElement(From).sendKeys("Минск");
    }
    public  void fillWhereField(){
        webDriver.findElement(Where).sendKeys("Мальта");
    }
    public void clickSearchButton(){
        webDriver.findElement(Button_Find).click();
    }

    public void fillFormsAndSend (){
        fillFromField();
        fillWhereField();
        clickSearchButton();
    }

}