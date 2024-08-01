package utils;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class Helper {

    public String testImage = new String("/Users/baianat/IdeaProjects/Classes_Hub/src/test/resources/TestDataFiles/testImage.png");

//_______________________________________________________________________________________________________________________________________________________________

//    Explicit wait

    public static WebDriverWait explicitWait(WebDriver driver, long sec) {
        return new WebDriverWait(driver, Duration.ofSeconds(sec));
    }

//_______________________________________________________________________________________________________________________________________________________________



}
