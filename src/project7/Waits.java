package project7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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


        // driver.get("https://login.yahoo.com/");
        // driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("selen@yahoo.com");
        // Thread.sleep(3000);

        // driver.findElement(By.xpath("input[@id='login-signin']")).click();

        driver.get("https://www.facebook.com/");

        WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement lastname = driver.findElement(By.name("lastname"));

        sendKeys(driver,firstname,10,"Mike");
        sendKeys(driver,lastname,20, "Tyson");

        WebElement forgotAccount = driver.findElement((By.linkText("Forgotten Account?")));
        clickOn((driver, forgotAccount,10));


    }


    public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value){
        new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public static void clickOn(WebDriver driver1, WebElement element, int timeout){
        new WebDriverWait((driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }



}
