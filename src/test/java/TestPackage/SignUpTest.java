package TestPackage;
import Pages.LoginPage;
import Pages.OTPpage;
import Pages.SignUpPage;
import base.BaseTests;
import org.testng.annotations.Test;
import static base.BaseTests.RandomEmailGenerator.randomEmail;


public class SignUpTest extends BaseTests {

    @Test
    public void testAllValidData() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
        otpPage.enterRightOTP();
        homePage.verifyThatHomePageIsLoaded();
    }

//    test first name validation ________________________________

    @Test
    public void testEmptyFirstName() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnEmptyFirstNameError();
    }


    @Test
    public void testFirstNameLessThan2() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("A");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnLessThan2FirstNameError();
    }


    @Test
    public void testFirstNameMoreThan25() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("Testiiiiiiiiiiiiiiiiiiiing");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnMoreThan25FirstNameError();
    }


    @Test
    public void testFirstNameWithNumbers() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("55555555555555");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnFirstnameWithNumbersError();
    }


    @Test
    public void testFirstNameWithSpecialCH() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("@@@@@@@@@@@@@@");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnFirstnameWithSpecialCHError();
    }


//    test last name validation ________________________________


    @Test
    public void testEmptyLastName() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("                 ");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnEmptyLastNameError();
    }


    @Test
    public void testLastNameLessThan2() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("A");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnLessThan2LastNameError();
    }


    @Test
    public void testLastNameMoreThan25() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("Testiiiiiiiiiiiiiiiiiiiing");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnMoreThan25LastNameError();
    }


    @Test
    public void testLastNameWithNumbers() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("55555555555555");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnLastnameWithNumbersError();
    }


    @Test
    public void testLastNameWithSpecialCH() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("@@@@@@@@@@@@@@");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnLastnameWithSpecialCHError();
    }

//        test email validation ________________________________

    @Test
    public void testEmptyEmail() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField("              ");
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnEmptyِEmailError();
    }


    @Test
    public void testInvalidFormEmail() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField("test@test");
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnEmailFormError();
    }


    @Test
    public void testRegisteredEmail() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField("abdalrahman@baianat.com");
        signUpPage.setpasswordField("Test@1234");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnEmailRegisteredError();
    }

//            test password validation ________________________________


    @Test
    public void testEmptyPassword() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnEmptyPasswordError();
    }


    @Test
    public void testPasswordLessThan8() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@12");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnLessThan8PasswordError();
    }


    @Test
    public void testPasswordMoreThan25() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@123456789000000000000");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnMoreThan25PasswordError();
    }


    @Test
    public void testPasswordWithLettersOnly() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Testingg");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnLettersOnlyPasswordError();
    }


    @Test
    public void testPasswordWithNumbersOnly() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("123456789");
        signUpPage.clickOnsubmitSignUpButton();
        signUpPage.AssertOnNumbersOnlyPasswordError();
    }


    @Test
    public void testEmptyOTP() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
        otpPage.clickOnVerifyOTP();
        otpPage.AssertOnEmptyOTPError();
    }


    @Test
    public void testWrongOTP() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("VALID first name");
        signUpPage.setLastNameField("VALID last name");
        signUpPage.setEmailAddressField(randomEmail);
        signUpPage.setpasswordField("Test@1234");
        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
        otpPage.enterWrongOTP();
        otpPage.AssertOnWrongOTPError();
    }

}
