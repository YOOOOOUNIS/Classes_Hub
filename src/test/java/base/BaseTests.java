package base;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.Random;
import java.util.Set;

import static utils.Helper.explicitWait;


public class BaseTests {
    public static WebDriver driver;
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

//    @BeforeMethod
//    public void BackToHome(){driver.get(url);}

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    //    create random email
    public class RandomEmailGenerator {
        private static final String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
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

//    private static String tempMailUrl = "https://temp-mail.org/en/";



    public class tempEmailGenerator {


        public static String generateTempEmail() {

            // Store the current window handle (first tab)
            String originalTab = driver.getWindowHandle();

            // Open a new tab using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.open('https://temp-mail.org/en/', '_blank');");
            System.out.println("Opened a new tab");


            // Store all window handles in a set
            Set<String> allTabs = driver.getWindowHandles();

            // Switch to the new tab (the one that is not the original)
            for (String handle : allTabs) {
                if (!handle.equals(originalTab)) {
                    driver.switchTo().window(handle);
                    System.out.println("Switched to the new tab");
                    break;
                }
            }

            // Perform actions on the new tab
            explicitWait(driver, 5);
            String email = driver.findElement(By.id("mail")).getAttribute("value");


            // Switch back to the original tab
            driver.switchTo().window(originalTab);
            System.out.println("Switched back to the first tab");



            return email;
        }

        public static String tempEmail = generateTempEmail();

    }

    public class RandomPhoneNumberGenerator {
        private static final String[] PREFIXES = {"010", "012", "015"};

        public static void main(String[] args) {
            System.out.println(generateRandomPhoneNumber());
        }

        public static String generateRandomPhoneNumber() {
            Random random = new Random();
            String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
            StringBuilder phoneNumber = new StringBuilder(prefix);

            for (int i = 0; i < 8; i++) {
                int digit = random.nextInt(10);
                phoneNumber.append(digit);
            }

            return phoneNumber.toString();

        }

        public static String randomPhoneNumber = generateRandomPhoneNumber();

    }

}

//
//
//    public class TestCase {
//        private int id;
//        private String description;
//        private String expectedResult;
//
//        // Getters and Setters
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        public String getExpectedResult() {
//            return expectedResult;
//        }
//
//        public void setExpectedResult(String expectedResult) {
//            this.expectedResult = expectedResult;
//        }
//
//        @Override
//        public String toString() {
//            return "TestCase{" +
//                    "id=" + id +
//                    ", description='" + description + '\'' +
//                    ", expectedResult='" + expectedResult + '\'' +
//                    '}';
//        }
//    }
//
//    public class TestData {
//        private List<TestCase> testCases;
//
//        // Getter and Setter
//        public List<TestCase> getTestCases() {
//            return testCases;
//        }
//
//        public void setTestCases(List<TestCase> testCases) {
//            this.testCases = testCases;
//        }
//
//        @Override
//        public String toString() {
//            return "TestData{" +
//                    "testCases=" + testCases +
//                    '}';
//        }
//    }
//
//
//    public class TestDataImporter {
//
//        public static TestData importTestData(String filePath) {
//            ObjectMapper objectMapper = new ObjectMapper();
//            TestData testData = null;
//
//            try {
//                testData = objectMapper.readValue(new File(filePath), TestData.class);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return testData;
//        }
//
//        public static void main(String[] args) {
//            String filePath = "path/to/your/testdata.json";
//            TestData testData = importTestData(filePath);
//
//            if (testData != null) {
//                for (TestCase testCase : testData.getTestCases()) {
//                    System.out.println(testCase);
//                }
//            }
//        }
//    }