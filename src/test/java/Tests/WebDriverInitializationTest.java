package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;


import java.time.Duration;

public class WebDriverInitializationTest {

    @Test
    public void OpenURL(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        ChromeOptions chromeOptions = new ChromeOptions();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.quit();
        System.out.println();
        open("https://www.google.com/");
    }
}
