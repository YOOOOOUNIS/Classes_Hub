package Pages;

import dev.failsafe.internal.util.Assert;
import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Helper;


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

    private By HomePageCheckElement = By.id("homeIntroTitle");


    public void verifyThatHomePageIsLoaded(){

        Assert.isTrue(explicitWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(HomePageCheckElement)).getText().contains(" grow and advance in design"),
                "ALL VALID DATA scenario is corrupted");

    }


}
