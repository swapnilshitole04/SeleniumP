package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class ResultPage {
    public static String iphone15Text_xpath="//span[text()='\"iphone 15\"']";
    public static String naturalTitanium_xpath="//span[text()='Apple iPhone 15 Pro Max (128 GB) - Natural Titanium'";

    public static void searched_blackTitanium(){

//        JavascriptExecutor je = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.xpath(naturalTitanium_xpath));
//        je.executeScript("arguments[0].scrollIntoView(true);",element);

        String actualText = driver.findElement(By.xpath(iphone15Text_xpath)).getText();
        String expectedText = "\"iphone 15\"";

        Assert.assertEquals(actualText,expectedText);

    }
}
