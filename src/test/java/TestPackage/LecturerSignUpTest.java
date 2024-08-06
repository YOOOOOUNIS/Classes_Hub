package TestPackage;
import Pages.LecturerSignUpPage;
import Pages.OTPpage;
import base.BaseTests;
import org.testng.annotations.Test;
import static base.BaseTests.RandomEmailGenerator.randomEmail;
import static base.BaseTests.RandomPhoneNumberGenerator.randomPhoneNumber;


public class LecturerSignUpTest extends BaseTests {

        @Test
        public void testAllValidData () {
        LecturerSignUpPage lecturerSignUpPage = homePage.clickOnJoinAsLecturerButton();
        lecturerSignUpPage.setFullNameInArabicField("الاسم الكامل الصحيح باللغة العربية");
        lecturerSignUpPage.setFullNameInEnglishField("Valid full name in english");
        lecturerSignUpPage.setEmailAddressField(randomEmail);
        lecturerSignUpPage.setPhoneNumberField(randomPhoneNumber);
        lecturerSignUpPage.selectNationalityMenu();
        lecturerSignUpPage.selectCountryMenu();
        lecturerSignUpPage.selectFieldOfTrainingMenu();
        lecturerSignUpPage.setTrainingExperienceField("10");
        lecturerSignUpPage.selectJobTitleMenu();
        lecturerSignUpPage.setLinkedInURLfield("https://www.linkedin.com/in/abdelrahman-younis-47b863286");
        lecturerSignUpPage.setFacebookURLfield("https://www.facebook.com/abdoyounis32?mibextid=ZbWKwL");
        lecturerSignUpPage.setCVattachmentField();
        OTPpage otPpage = lecturerSignUpPage.clickOnSubmitLecturerSignUp();
        otPpage.enterRightOTP();
        otPpage.backToHome();
        homePage.verifyThatHomePageIsLoaded();
        }


//        @Test
//        public void testAllValidData () {
//                LecturerSignUpPage lecturerSignUpPage = homePage.clickOnJoinAsLecturerButton();
//                lecturerSignUpPage.setFullNameInArabicField("الاسم الكامل الصحيح باللغة العربية");
//                lecturerSignUpPage.setFullNameInEnglishField("Valid full name in english");
//                lecturerSignUpPage.setEmailAddressField(randomEmail);
//                lecturerSignUpPage.setPhoneNumberField(randomPhoneNumber);
//                lecturerSignUpPage.selectNationalityMenu();
//                lecturerSignUpPage.selectCountryMenu();
//                lecturerSignUpPage.selectFieldOfTrainingMenu();
//                lecturerSignUpPage.setTrainingExperienceField("10");
//                lecturerSignUpPage.selectJobTitleMenu();
//                lecturerSignUpPage.setLinkedInURLfield("https://www.linkedin.com/in/abdelrahman-younis-47b863286");
//                lecturerSignUpPage.setFacebookURLfield("https://www.facebook.com/abdoyounis32?mibextid=ZbWKwL");
//                lecturerSignUpPage.setCVattachmentField();
//                OTPpage otPpage = lecturerSignUpPage.clickOnSubmitLecturerSignUp();
//                otPpage.enterRightOTP();
//        }


}