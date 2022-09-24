package projectFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.get("https://accounts.gmail.com/");
        //WebElement username = driver.findElement(By.id("identifierId"));
        //username.sendKeys("selenium@gmail.com");
        driver.get("https://google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");

        // will wait for 2 seconds
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();





    }
}
