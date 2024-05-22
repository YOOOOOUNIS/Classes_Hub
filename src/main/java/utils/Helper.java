package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class Helper {

//_______________________________________________________________________________________________________________________________________________________________

//    Explicit wait

    public static WebDriverWait explicitWait(WebDriver driver, long sec) {
        return new WebDriverWait(driver, Duration.ofSeconds(sec));
    }

//_______________________________________________________________________________________________________________________________________________________________





}
