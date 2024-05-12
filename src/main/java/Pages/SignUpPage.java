package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utils.Helper.explicitWait;

public class SignUpPage {

    private WebDriver driver;

    private By firstNameField = By.xpath("//*[@id=\"firstName\"]");

    private By lastNameField = By.xpath("//*[@id=\"lastName\"]");

    private By emailAddressField = By.id("email");

    private By passwordField = By.id("password");

    private By submitSignUpButton = By.id("submit-signUp");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setFirstnameField(String firstName){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(firstNameField));
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastname){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(lastNameField));
        driver.findElement(lastNameField).sendKeys(lastname);
    }

    public void setEmailAddressField(String emailAddress){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(emailAddressField));
        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }

    public void setpasswordField(String password){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public OTPpage clickOnsubmitSignUpButton(){
        driver.findElement(submitSignUpButton).click();
        return new OTPpage(driver);
    }
}
