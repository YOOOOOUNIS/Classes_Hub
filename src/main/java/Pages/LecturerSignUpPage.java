package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static utils.Helper.explicitWait;




public class LecturerSignUpPage {
    private WebDriver driver;

//    #TODO complete lecturer sign up page elements paths

    private By fullNameInArabicField = By.id("arFullName");
    private By fullNameInEnglishField = By.id("enFullName");
    private By emailAddressField = By.id("email");
    private By phoneNumberField = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[4]/div/input");
    private By nationalityField = By.xpath("//*[@id=\"vs9__combobox\"]/div[2]/svg/path");
    private By countryField = By.xpath("//*[@id=\"vs10__combobox\"]/div[2]/svg/path");
    private By fieldOfTrainingField = By.xpath("//*[@id=\"vs12__combobox\"]/div[2]/svg/path");
    private By trainingExperienceField = By.id("yearsOfExperience");
    private By jobTitleField = By.xpath("//*[@id=\"vs11__combobox\"]/div[2]/svg");
    private By linkedInURLfield = By.id("linkedInUrl");
    private By facebookURLfield = By.id("facebookUrl");
    private By CVfield = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/div/div[2]/div/form/div[8]/div");
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

//    #TODO handle select this drop down menu element
    public void selectNationalityMenu(String nationality){
        WebElement dropDownElement = explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(nationalityField));
        driver.findElement(nationalityField);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByVisibleText(nationality);
    }

    public void selectCountryMenu(String country){
        WebElement dropDownElement = explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(countryField));
        driver.findElement(countryField);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByVisibleText(country);
    }

    public void selectFieldOfTrainingMenu(String fieldOfTraining){
        WebElement dropDownElement = explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(fieldOfTrainingField));
        driver.findElement(fieldOfTrainingField);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByVisibleText(fieldOfTraining);
    }

    public void setTrainingExperienceField(String trainingExperience){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(trainingExperienceField));
        driver.findElement(trainingExperienceField).sendKeys(trainingExperience);
    }

    public void setJobTitleField(String jobTitle){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(jobTitleField));
        driver.findElement(jobTitleField).sendKeys(jobTitle);
    }
    public void setLinkedInURLfield(String linkedInURL){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(linkedInURLfield));
        driver.findElement(linkedInURLfield).sendKeys(linkedInURL);
    }

    public void setFacebookURLfield(String facebookURL){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(facebookURLfield));
        driver.findElement(facebookURLfield).sendKeys(facebookURL);
    }

    public void setCVfield(String CV){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(CVfield));
        driver.findElement(CVfield).sendKeys(CV);
    }

    public void clickOnSubmitLecturerSignUp(){
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(submitLecturerSignUpButton));
        driver.findElement(submitLecturerSignUpButton).click();
    }

}
