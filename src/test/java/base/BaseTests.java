package base;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    private static String url = "https://staging.classeshub.com/";
    protected HomePage homePage;
    String duration;

    @BeforeMethod
    public void goHome() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


}