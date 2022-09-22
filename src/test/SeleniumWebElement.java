package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.jobs/en/");

        // it pause the execution process for a few seconds
        Thread.sleep(4000);

        // it will search for Software Engineer and click the search button
        driver.findElement(By.id("id=search_typeahead-label")).sendKeys("Software Engineer");

        Thread.sleep(4000);
        driver.findElement(By.className("btn location-search form-control")).click();
        driver.findElement(By.linkText("Software Development")).click();


    }
}
