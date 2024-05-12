package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {



    public static WebDriverWait explicitWait(WebDriver driver, long sec) {
        return new WebDriverWait(driver, Duration.ofSeconds(sec));
    }
}