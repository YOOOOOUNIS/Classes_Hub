package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utils.Helper.explicitWait;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By LoginButton = By.xpath("//*[@id=\"__nuxt\"]/div/div[1]/div/div/ul[2]/li[5]/div/a/button");

    private final By titleLocator = By.id("homeIntroTitle");

    public LoginPage clickLoginButton() {
        explicitWait(driver,10).until(ExpectedConditions.elementToBeClickable(LoginButton));
        driver.findElement(LoginButton).click();
        return new LoginPage(driver);
    }

    public void verifyHomePageIsLoaded(){
        driver.findElement(titleLocator).getText();
    }
}
