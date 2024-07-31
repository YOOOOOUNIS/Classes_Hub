package TestPackage;
import Pages.LecturerSignUpPage;
import base.BaseTests;
import dev.failsafe.Timeout;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.devtools.v124.log.Log;
import org.testng.annotations.Test;
import static base.BaseTests.RandomEmailGenerator.randomEmail;
import static base.BaseTests.RandomPhoneNumberGenerator.randomPhoneNumber;


public class LecturerSignUpTest extends BaseTests {

    @Test
    public void testAllValidData() {
        LecturerSignUpPage lecturerSignUpPage = homePage.clickOnJoinAsLecturerButton();
        lecturerSignUpPage.setFullNameInArabicField("الاسم بالكامل باللغة العربية صالح");
        lecturerSignUpPage.setFullNameInEnglishField("Valid full name in english");
        lecturerSignUpPage.setEmailAddressField(randomEmail);
        lecturerSignUpPage.setPhoneNumberField(randomPhoneNumber);
        lecturerSignUpPage.selectNationalityMenu();
        lecturerSignUpPage.selectCountryMenu();
//        lecturerSignUpPage.selectFieldOfTrainingMenu("ex");
//        lecturerSignUpPage.clickOnSubmitLecturerSignUp();
    }

}
