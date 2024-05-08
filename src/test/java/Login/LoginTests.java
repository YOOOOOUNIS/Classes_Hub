package Login;

import Pages.HomePage;
import Pages.LoginPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setUsernameField("abdalrahan@baianat.com");
        loginPage.setPasswordField("Test@1234");
        loginPage.clickLoginButton();
    }

    @Test
    public void testunsuccessfulLogin(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setUsernameField("abdalrahan@abdalrahan.com");
        loginPage.setPasswordField("Test@1234");
        loginPage.clickLoginButton();
    }
}