package Pages;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static utils.Helper.explicitWait;




public class HomePage {


    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    private final By titleLocator = By.id("homeIntroTitle");
    private By HomePageCheckElement = By.id("homeIntroTitle");
    private By LoginButton = By.xpath("//*[@id=\"__nuxt\"]/div/div[1]/div/div/ul[2]/li[5]/div/a/button");
    private By joinAsLecturerButton = By.xpath("//*[@id=\"__nuxt\"]/div/div[3]/div[1]/div/div/div[3]/ul[3]/li[2]/a");




    public void verifyThatHomePageIsLoaded(){
//        assert on home page after user sign up process has completed
        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(HomePageCheckElement)).getText().contains(" grow and advance in design"),
                "ALL VALID DATA scenario is corrupted");
    }

    public LoginPage clickLoginButton() {
        explicitWait(driver,10).until(ExpectedConditions.elementToBeClickable(LoginButton));
        driver.findElement(LoginButton).click();
        return new LoginPage(driver);
    }

    public LecturerSignUpPage clickOnJoinAsLecturerButton(){

//        scroll down to join as lecturer button
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,5000);
        actions.perform();

//        click on join as lecturer button
        explicitWait(driver,10).until(ExpectedConditions.elementToBeClickable(joinAsLecturerButton));
        driver.findElement(joinAsLecturerButton).click();
        return new LecturerSignUpPage(driver);

    }

}
