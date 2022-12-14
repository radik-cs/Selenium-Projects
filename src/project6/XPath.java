package project6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.ebay.com/");

        // Using Xpath functions (methods)
        driver.findElement(By.xpath("//input[@id='gc-ac']")).sendKeys("Guitar");
        WebElement searchIcon = driver.findElement(By.xpath("//input[@id='gh-btn']"));

        searchIcon.click();

    }
}
