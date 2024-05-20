package Pages;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static utils.Helper.explicitWait;

public class LoginPage {
    private WebDriver driver;


    private By signUpButton = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[5]/p/a");
    private By usernameField = By.id("email");
    private By passwordField = By.id("password");
    private By submitloginButton = By.xpath("//*[@id=\"submit-login\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage clickSignUp(){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(signUpButton));
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public void setUsernameField(String username) {
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(usernameField));
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
        explicitWait(driver,10).until(ExpectedConditions.elementToBeClickable(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submitLoginButton(){
        driver.findElement(submitloginButton).click();
    }


    }

