package Tests;

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
    static ExtentTest test;
    static ExtentReports extent= new ExtentReports();


    @BeforeTest
    void beforeTest() {

        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
    }
    @Test
    void searchResult() throws InterruptedException {
        test=extent.createTest("First Test","This test searching iphone 15");
        HomePage.enter_searchTextbox();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage.click_searchedElement();
        Thread.sleep(2000);

        ResultPage.searched_blackTitanium();
        Thread.sleep(2000);
        extent.flush();

    }
    @AfterTest
    void afterTest(){
        driver.quit();
    }
}
//div[text()='iphone 15' and @aria-label='iphone 15']