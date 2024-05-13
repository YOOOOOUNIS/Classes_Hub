package SignUp;

import Pages.LoginPage;
import Pages.OTPpage;
import Pages.SecureAreaPage;
import Pages.SignUpPage;
import base.BaseTests;
import org.testng.annotations.Test;

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
//        otpPage.clickOnverifyOTP();
        assertTrue(secureAreaPage.getSuccessfulText().contains("ffrfr"),
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
