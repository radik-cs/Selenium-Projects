package project7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //  Waits
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://login.yahoo.com/");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("selen@yahoo.com");
        Thread.sleep(3000);

        driver.findElement(By.xpath("input[@id='login-signin']")).click();
        




    }
}
