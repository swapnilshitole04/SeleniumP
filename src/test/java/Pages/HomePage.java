package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String searchTextbox_xpath="//input[@id='twotabsearchtextbox']";
    public static String searchedElement_xpath="//div[text()='iphone 15' and @aria-label='iphone 15']";

    public static void enter_searchTextbox(){
        driver.findElement(By.xpath(searchTextbox_xpath)).sendKeys("iphone 15");
    }

    public static void click_searchedElement(){
        driver.findElement(By.xpath(searchedElement_xpath)).click();
    }

}
