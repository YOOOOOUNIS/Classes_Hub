package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By LoginButton = By.xpath("//*[@id=\"__nuxt\"]/div/div[1]/div/div/ul[2]/li[5]/div/a/button");

    public LoginPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return new LoginPage(driver);
    }

}
