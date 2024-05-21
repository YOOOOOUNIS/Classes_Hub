package Pages;

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

//    private By verifyOTP = By.id("submit-verifyCode");

    private By resendOTP = By.id("resendVerificationCode");



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

//        return new SecureAreaPage(driver);
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

//        return new (driver);

    }



//    public void clickOnverifyOTP(){
//        driver.findElement(verifyOTP).click();
//    }

    public void resendOTP (){
        driver.findElement(resendOTP).click();
    }

}
