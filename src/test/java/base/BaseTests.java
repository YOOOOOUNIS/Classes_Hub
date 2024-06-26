package base;
import Pages.HomePage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
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

//    @BeforeMethod
//    public void BackToHome(){driver.get(url);}

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



}