package base;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.Random;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;


//    site url
    private static String url = "https://staging.classeshub.com/";




    @BeforeMethod
    public void goHome() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        homePage = new HomePage(driver);
    }



    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }




//    create random email
    public class RandomEmailGenerator {
        private static final String[] domains = {"gmail.com", "yahoo.com", "hotmail.com",  "outlook.com"};
        private static final String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};


        public static String generateRandomEmail() {
            Random random = new Random();

            // Generate a random username with length between 6 and 12 characters
            StringBuilder usernameBuilder = new StringBuilder();
            int usernameLength = random.nextInt(7) + 6;
            for (int i = 0; i < usernameLength; i++) {
                String characterSet = characters[random.nextInt(characters.length)];
                int randomIndex = random.nextInt(characterSet.length());
                char randomChar = characterSet.charAt(randomIndex);
                usernameBuilder.append(randomChar);
            }
            String username = usernameBuilder.toString();

            // Select a random domain
            String domain = domains[random.nextInt(domains.length)];

            // Combine username and domain to form the email address
            String email = username + "@" + domain;

            return email;
        }

        public static String randomEmail = generateRandomEmail();

    }
}