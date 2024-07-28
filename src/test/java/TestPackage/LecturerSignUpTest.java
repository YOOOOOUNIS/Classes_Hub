package TestPackage;
import Pages.LecturerSignUpPage;
import base.BaseTests;
import org.testng.annotations.Test;
import static base.BaseTests.RandomEmailGenerator.randomEmail;
import static base.BaseTests.RandomPhoneNumberGenerator.randomPhoneNumber;


public class LecturerSignUpTest extends BaseTests {

//    #TODO handle select drop down menu element
    @Test
    public void testAllValidData() {
        LecturerSignUpPage lecturerSignUpPage = homePage.clickOnJoinAsLecturerButton();
        lecturerSignUpPage.setFullNameInArabicField("الاسم بالكامل باللغة العربية صالح");
        lecturerSignUpPage.setFullNameInEnglishField("Valid full name in english");
        lecturerSignUpPage.setEmailAddressField(randomEmail);
        lecturerSignUpPage.setPhoneNumberField(randomPhoneNumber);
//        lecturerSignUpPage.selectNationalityMenu("Egypt");
//        lecturerSignUpPage.selectCountryMenu("Egypt");
//        lecturerSignUpPage.selectFieldOfTrainingMenu("ex");
        lecturerSignUpPage.clickOnSubmitLecturerSignUp();
    }

}
