package TestPackage;

import Pages.LoginPage;
import Pages.OTPpage;
import Pages.SecureAreaPage;
import Pages.SignUpPage;
import base.BaseTests;
import io.qameta.allure.Step;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utils.Helper;

import static base.BaseTests.RandomEmailGenerator.randomEmail;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SignUpTest extends BaseTests {


    @Test
    public void testSuccessfulSignUp() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("Test first name");
        signUpPage.setLastNameField("Test last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
        SecureAreaPage secureAreaPage = otpPage.enterRightOTP();
        Helper.explicitWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("homeIntroTitle")));
//        assert on element in home page when get loaded
        assertTrue(secureAreaPage.getSuccessfulText("homeIntroTitle").contains(" grow and advance in design"),
                "Alert message is incorrect");
    }


    @Test
    public void testEnterWronOTP() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("Test first name");
        signUpPage.setLastNameField("Test last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
        SecureAreaPage secureAreaPage = otpPage.enterWrongOTP();
//        otpPage.clickOnverifyOTP();
        assertFalse(secureAreaPage.getUnsuccessfulText().contains("Invalid OTP, Please try again"),
                "Alert message is incorrect");
    }

}
