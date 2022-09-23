package projectThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ProjectFirefox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "~Users/radikfakhretdinov/Downloads/geckodriver-v0.23.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://twitter.com/");
        driver.findElement(By.linkText("Sign Up")).click();

        // Locating an element and sending the key
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Firefox");
        driver.findElement(By.name("phone_number")).sendKeys("4124123124");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();


    }
}

