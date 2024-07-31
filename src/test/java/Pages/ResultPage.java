package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;
import static Tests.SeleniumTest.*;

public class ResultPage {
    public static String iphone15Text_xpath="//span[text()='\"iphone 15\"']";
    public static String categoryText_xpath="//*[@id=\"n-title\"]/span";

    public static void searched_iphone15Text(){

        String actualText = driver.findElement(By.xpath(iphone15Text_xpath)).getText();
        String expectedText = "\"iphone 15\"";

        Assert.assertEquals(expectedText,actualText);
        if(expectedText.equals(actualText)){
            test.log(Status.PASS,"Successfully searched test");
        }
    }
}
