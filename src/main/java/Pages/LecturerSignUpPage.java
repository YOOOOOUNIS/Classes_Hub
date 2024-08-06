package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Helper;


public class LecturerSignUpPage extends Helper {
    private WebDriver driver;


    private By fullNameInArabicField = By.id("arFullName");
    private By fullNameInEnglishField = By.id("enFullName");
    private By emailAddressField = By.id("email");
    private By phoneNumberField = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[4]/div/input");
    private By nationalityDropDownMenu = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[5]/div[1]/div/div");
    private By countryDropDownMenu = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div/div");
    private By fieldOfTrainingDropDownMenu = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[5]/div[3]/div");
    private By trainingExperienceField = By.id("yearsOfExperience");
    private By jobTitleDropDownMenu = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[5]/div[5]/div/div");
    private By linkedInURLfield = By.id("linkedInUrl");
    private By facebookURLfield = By.id("facebookUrl");
    private By CVfield = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[8]/div/input");
    private By ErrorMessage = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[8]/div[2]/p");
    private By submitLecturerSignUpButton = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[9]/button");




    public LecturerSignUpPage(WebDriver driver) { this.driver = driver; }


    public void setFullNameInArabicField(String arFirstName){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(fullNameInArabicField));
        driver.findElement(fullNameInArabicField).sendKeys(arFirstName);
    }

    public void setFullNameInEnglishField(String enFirstName){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(fullNameInEnglishField));
        driver.findElement(fullNameInEnglishField).sendKeys(enFirstName);
    }

    public void setEmailAddressField(String emailAddress){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(emailAddressField));
        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }

    public void setPhoneNumberField(String phoneNumber){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(phoneNumberField));
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void selectNationalityMenu(){
        WebElement selectMyElement = driver.findElement(nationalityDropDownMenu);
        selectMyElement.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void selectCountryMenu(){
        WebElement selectMyElement = driver.findElement(countryDropDownMenu);
        selectMyElement.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void selectFieldOfTrainingMenu(){
        WebElement selectMyElement = driver.findElement(fieldOfTrainingDropDownMenu);
        selectMyElement.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void setTrainingExperienceField(String trainingExperience){

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,500);
        actions.perform();

        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(trainingExperienceField));
        driver.findElement(trainingExperienceField).sendKeys(trainingExperience);
    }

    public void selectJobTitleMenu(){
        WebElement selectMyElement = driver.findElement(jobTitleDropDownMenu);
        selectMyElement.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }
    public void setLinkedInURLfield(String linkedInURL){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(linkedInURLfield));
        driver.findElement(linkedInURLfield).sendKeys(linkedInURL);
    }

    public void setFacebookURLfield(String facebookURL){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(facebookURLfield));
        driver.findElement(facebookURLfield).sendKeys(facebookURL);
    }

    public void setCVattachmentField(){

        driver.findElement(CVfield).sendKeys(testImagePath);

    }

    public OTPpage clickOnSubmitLecturerSignUp(){

//        click on submit button before file get completely uploaded to show up error message
        driver.findElement(submitLecturerSignUpButton).click();

//        wait until file get uploaded and error message gone away to execute submit request
        explicitWait(driver, 10).until(ExpectedConditions.invisibilityOfElementWithText(ErrorMessage,"Upload your CV is a required field"));
        driver.findElement(submitLecturerSignUpButton).click();

        return new OTPpage(driver);
    }

}
