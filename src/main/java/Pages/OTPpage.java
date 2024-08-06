package Pages;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static utils.Helper.explicitWait;



public class OTPpage {

    public OTPpage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;


    private By firstNumber = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/input");
    private By secondNumber = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/input");
    private By thirdNumber = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[1]/div[3]/input");
    private By forthNumber = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/input");
    private By verifyOTP = By.id("submit-verifyCode");
    private By OTPerrorElement = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[2]/form/div[2]/p");
    private By OTPerrorToast = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[1]/div[1]/div/p");
    private By resendOTP = By.id("resendVerificationCode");
    private By backToHome = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div/a");



    public void enterRightOTP(){
        //        wait till the component shows up & send the first number
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(firstNumber));
        driver.findElement(firstNumber).sendKeys("1");

        //        send the second number
        driver.findElement(secondNumber).sendKeys("2");

        //        send the third number
        driver.findElement(thirdNumber).sendKeys("3");

        //        send the forth number
        driver.findElement(forthNumber).sendKeys("4");


    }

    public void enterWrongOTP(){
        //        wait till the component shows up & send the first number
        explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(firstNumber));
        driver.findElement(firstNumber).sendKeys("1");

        //        send the second number
        driver.findElement(secondNumber).sendKeys("1");

        //        send the third number
        driver.findElement(thirdNumber).sendKeys("1");

        //        send the forth number
        driver.findElement(forthNumber).sendKeys("1");


    }



    public void clickOnVerifyOTP(){

        explicitWait(driver,10).
                until(ExpectedConditions.elementToBeClickable(verifyOTP)).click();
    }

    public void resendOTP (){
        explicitWait(driver,10).
                until(ExpectedConditions.elementToBeClickable(resendOTP)).click();
    }

    public void backToHome (){
        explicitWait(driver,10).
                until(ExpectedConditions.elementToBeClickable(backToHome)).click();
    }


//    Assertions

    public void AssertOnEmptyOTPError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(OTPerrorElement)).getText().contains("OTP code must be at least 4 characters"),
                "Empty OTP scenario is corrupted");
    }

    public void AssertOnWrongOTPError (){

        Assert.isTrue(explicitWait(driver, 10).
                        until(ExpectedConditions.elementToBeClickable(OTPerrorToast)).getText().contains("Invalid OTP, Please try again"),
                "Wrong OTP scenario is corrupted");
    }


}
