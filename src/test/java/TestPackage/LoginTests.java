package TestPackage;
import Pages.HomePage;
import Pages.LoginPage;
import base.BaseTests;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setUsernameField("abdalrahan@baianat.com");
        loginPage.setPasswordField("Test@1234");
        loginPage.submitLoginButton();
    }

    @Test
    public void testUnsuccessfulLogin_incorrectEmail(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setUsernameField("abdalrahan@abdalrahan.com");
        loginPage.setPasswordField("Test@1234");
        loginPage.submitLoginButton();
    }

    @Test
    public void testUnsuccessfulLogin_incorrectPass(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setUsernameField("abdalrahan@abdalrahan.com");
        loginPage.setPasswordField("Test@1234");
        loginPage.submitLoginButton();
    }
}