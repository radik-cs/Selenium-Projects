package project9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        //driver.switchTo().window("Fail");
        driver.switchTo().frame("Fail");
        driver.close();
    }
}
