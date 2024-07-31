package Pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static Tests.SeleniumTest.driver1;

public class GoogleSearchPage {

    public static String searchTextbox_xpath="//*[@id=\"APjFqb\"]";

    public static void enter_googleSearch(){
        driver1.findElement(By.xpath(searchTextbox_xpath)).sendKeys("Automation Testing");
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
