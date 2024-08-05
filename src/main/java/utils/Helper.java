package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class Helper {



//    get absolute path of attachment
//    TODO complete function to get absolute path from repo root path
    public String testImagePath = "/Users/baianat/IdeaProjects/Classes_Hub/src/test/resources/TestDataFiles/testImage.png";


//    public static void main(String args[])
//    {
//
//        // try-catch block to handle exceptions
//        try {
//
//            // Create a file object
//            File f = new File("src/test/resources/TestDataFiles/testImage.png");
//
//            // Get the absolute path of file f
//
//            // Display the file path of the file object
//            // and also the file path of absolute file
//            System.out.println("Original  path: " + f.getPath());
//            System.out.println("Absolute  path: " + f.getAbsolutePath());
//        }
//        catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//    }


//_______________________________________________________________________________________________________________________________________________________________

//    Explicit wait

    public static WebDriverWait explicitWait(WebDriver driver, long sec) {
        return new WebDriverWait(driver, Duration.ofSeconds(sec));
    }


//_______________________________________________________________________________________________________________________________________________________________

//    logger

    public class LoggerSetup {
        public static final Logger logger = Logger.getLogger(LoggerSetup.class.getName());

        static {
            try {
                // Console handler
                ConsoleHandler consoleHandler = new ConsoleHandler();
                consoleHandler.setLevel(Level.ALL);
                logger.addHandler(consoleHandler);

                // File handler
                FileHandler fileHandler = new FileHandler("selenium.log", true);
                fileHandler.setLevel(Level.ALL);
                fileHandler.setFormatter(new SimpleFormatter());
                logger.addHandler(fileHandler);

                logger.setLevel(Level.ALL);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error occurred in Logger Setup", e);
            }
        }

        public static Logger getLogger() {
            return logger;
        }
    }

}
