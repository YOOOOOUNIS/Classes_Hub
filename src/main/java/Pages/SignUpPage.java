package Pages;
import dev.failsafe.internal.util.Assert;
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


//    Assertions
//    Assertion on first name error msg. element ___________________________________________________________________________________________________________

    private By FirstNameErrorElement = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/p");



    public void AssertOnEmptyFirstNameError (){

        Assert.isTrue(explicitWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(FirstNameErrorElement)).getText().contains("First name is a required field"),
                "Empty first name scenario is corrupted");
    }

    public void AssertOnLessThan2FirstNameError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(FirstNameErrorElement)).getText().contains("First name must be at least 2 characters"),
                "first name less than 2 ch. scenario is corrupted");
    }

    public void AssertOnMoreThan25FirstNameError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(FirstNameErrorElement)).getText().contains("First name must be at most 25 characters"),
                "first name more than 25 ch. scenario is corrupted");
    }

    public void AssertOnFirstnameWithNumbersError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(FirstNameErrorElement)).getText().contains("Name should only contain alphabetic charachters"),
                "first name with numbers scenario is corrupted");
    }

    public void AssertOnFirstnameWithSpecialCHError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(FirstNameErrorElement)).getText().contains("Name should only contain alphabetic charachters"),
                "first name with Special ch. scenario is corrupted");
    }


//        Assertion on last name error msg. element ___________________________________________________________________________________________________________

    private By LastNameErrorElement = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/div/p");


    public void AssertOnEmptyLastNameError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(LastNameErrorElement)).getText().contains("Last name is a required field"),
                "Empty last name scenario is corrupted");
    }

    public void AssertOnLessThan2LastNameError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(LastNameErrorElement)).getText().contains("Last name must be at least 2 characters"),
                "Last name less than 2 ch. scenario is corrupted");
    }

    public void AssertOnMoreThan25LastNameError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(LastNameErrorElement)).getText().contains("Last name must be at most 25 characters"),
                "Last name more than 25 ch. scenario is corrupted");
    }

    public void AssertOnLastnameWithNumbersError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(LastNameErrorElement)).getText().contains("Name should only contain alphabetic charachters"),
                "Last name with numbers scenario is corrupted");
    }

    public void AssertOnLastnameWithSpecialCHError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(LastNameErrorElement)).getText().contains("Name should only contain alphabetic charachters"),
                "Last name with Special ch. scenario is corrupted");
    }

//            Assertion on email error msg. element ___________________________________________________________________________________________________________


    private By EmailErrorElement = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[2]/p");

    public void AssertOnEmptyِEmailError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(EmailErrorElement)).getText().contains("Email address is a required field"),
                "Empty email scenario is corrupted");
    }


    public void AssertOnEmailFormError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(EmailErrorElement)).getText().contains("Email address must be a valid email"),
                "Email format scenario is corrupted");
    }


    public void AssertOnEmailRegisteredError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(EmailErrorElement)).getText().contains("An account with this Email already exists please try to sign in instead"),
                "Email registered before scenario is corrupted");
    }

//                Assertion on password error msg. element ___________________________________________________________________________________________________________


    private By passwordErrorElement = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[3]/p");
    public void AssertOnEmptyPasswordError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(passwordErrorElement)).getText().contains("Password is a required field"),
                "Empty password scenario is corrupted");
    }


    public void AssertOnLessThan8PasswordError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(passwordErrorElement)).getText().contains("Password must be at least 8 characters"),
                "password less than 8 ch. scenario is corrupted");
    }


    public void AssertOnMoreThan25PasswordError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(passwordErrorElement)).getText().contains("Password must be at most 25 characters"),
                "password more than 25 ch. scenario is corrupted");
    }


    public void AssertOnLettersOnlyPasswordError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(passwordErrorElement)).getText().contains(" no "),
                "password with letters only scenario is corrupted");
    }


    public void AssertOnNumbersOnlyPasswordError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(passwordErrorElement)).getText().contains("Password should contain at least one letter"),
                "password with numbers only scenario is corrupted");
    }

}
