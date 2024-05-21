package TestPackage;
import Pages.LoginPage;
import Pages.OTPpage;
import Pages.SignUpPage;
import base.BaseTests;
import org.testng.annotations.Test;
import static base.BaseTests.RandomEmailGenerator.randomEmail;


public class SignUpTest extends BaseTests {


//    @Test
//    public void testAllValidData() {
//        LoginPage loginPage = homePage.clickLoginButton();
//        SignUpPage signUpPage = loginPage.clickSignUp();
//        signUpPage.setFirstnameField("VALID first name");
//        signUpPage.setLastNameField("VALID last name");
//        signUpPage.setEmailAddressField(randomEmail);
//        signUpPage.setpasswordField("Test@1234");
//        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
//        otpPage.enterRightOTP();
//        homePage.verifyThatHomePageIsLoaded();
//
//    }

//    test first name validation ________________________________

    @Test
    public void testEmptyFirstName() {
        LoginPage loginPage = homePage.clickLoginButton();
        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.setFirstnameField("              ");
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



//    @Test
//    public void testEnterWronOTP() {
//        LoginPage loginPage = homePage.clickLoginButton();
//        SignUpPage signUpPage = loginPage.clickSignUp();
//        signUpPage.setFirstnameField("VALID first name");
//        signUpPage.setLastNameField("VALID last name");
//        signUpPage.setEmailAddressField(randomEmail);
//        signUpPage.setpasswordField("Test@1234");
//        OTPpage otpPage = signUpPage.clickOnsubmitSignUpButton();
//        otpPage.enterWrongOTP();
//        assertFalse(driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[1]/div[1]/div/p")).getText().contains("Invalid OTP, Please try again"),
//                "Alert message is incorrect");
//    }

}
