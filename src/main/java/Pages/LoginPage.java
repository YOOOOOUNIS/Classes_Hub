package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Helper.explicitWait;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"submit-login\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setUsernameField(String username) {
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(usernameField));
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
        explicitWait(driver,10).until(ExpectedConditions.elementToBeClickable(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

}