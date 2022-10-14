package project9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleExceptions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        // this element is not existing and it will throw an Exception
        driver.findElement(By.name("fake")).click();

        // if we want to handle it

    }
}
