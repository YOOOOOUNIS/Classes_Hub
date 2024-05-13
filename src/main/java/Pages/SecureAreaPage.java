package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {


    private WebDriver driver;
    private By successfulOperationPath = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[1]/div[2]");
    private By unsuccessfulOperationPath = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[1]/div[1]/div/p");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessfulText(){
        return driver.findElement(successfulOperationPath).getText();
    }

    public String getUnsuccessfulText(){
        return driver.findElement(unsuccessfulOperationPath).getText();
    }
}
