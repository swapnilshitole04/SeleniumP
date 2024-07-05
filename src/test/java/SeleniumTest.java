import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static WebDriver driver;

    @BeforeTest
    void beforeTest() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
    }
    @Test
    void testSteps() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("ChatGPT");
        Thread.sleep(2000);

    }
    @AfterTest
    void afterTest(){
        driver.quit();
    }
}
