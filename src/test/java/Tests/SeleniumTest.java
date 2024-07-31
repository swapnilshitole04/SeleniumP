package Tests;

import Pages.GoogleSearchPage;
import Pages.HomePage;
import Pages.ResultPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    public static WebDriver driver;
    public static WebDriver driver1;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();


    @BeforeTest 
    void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
    }

    @Test(priority = 2)
    void searchResult() throws InterruptedException {
        test = extent.createTest("First Test", "This test searching iphone 15");
        HomePage.enter_searchTextbox();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        test = extent.createTest("Second Test", "This test searched iphone 15 text");
        HomePage.click_searchedElement();
        Thread.sleep(2000);

        ResultPage.searched_iphone15Text();
        Thread.sleep(2000);
        extent.flush();

    }

    @Test(priority = 1)
    void dummyResult() {
        driver1 = new ChromeDriver();
        driver1.get("https://www.google.co.in/");
        GoogleSearchPage.enter_googleSearch();
        driver1.quit();
        test = extent.createTest("Third Test", "Open google website");
    }

    @AfterTest
    void afterTest() {
        driver.quit();
    }
}
