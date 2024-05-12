package SignUp;

import Pages.LoginPage;
import Pages.OTPpage;
import Pages.SignUpPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTests {

    @Test
    public void testSuccessfulSignUp(){
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("Abdelrahman");
        signUpPage.setLastNameField("Younis");
        signUpPage.setEmailAddressField("xoxoxo@gmail.com");
        signUpPage.setpasswordField("Test@1234");
        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
        otpPage.enterOTP();
        otpPage.clickOnverifyOTP();
    }
}
