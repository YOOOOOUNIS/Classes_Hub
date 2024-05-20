package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v122.css.model.Value;

import java.util.Random;
import java.util.Set;

public class SecureAreaPage {


    private WebDriver driver;
    private By successfulOperationPath ;
    private By unsuccessfulOperationPath = By.xpath("//*[@id=\"__nuxt\"]/div/div[2]/div/div/div[1]/div[1]/div/p");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessfulText(String path){
        return driver.findElement(By.id(path)).getText();
    }

    public String getUnsuccessfulText(){
        return driver.findElement(unsuccessfulOperationPath).getText();
    }
}
