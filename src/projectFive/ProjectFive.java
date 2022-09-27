package projectFive;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectFive {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Swimming Goggles");
        driver.findElement(By.cssSelector("#gh-btn")).click();

        js.executeScript("window.scrollBy(0,300)");

    }
}
