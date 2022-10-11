package project8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");

        // instantiating
        WebDriver driver = new ChromeDriver();

        // your file / project with alerts
        driver.get("file://Users/Download/fileName.html");
        Thread.sleep(5000);

        driver.findElement(By.id("alert")).click();
        Thread.sleep(3000);

        // Create an object To switch to another alert
        Alert alert = driver.switchTo().alert();

        // Getting the text that present in the window
        String alertMessage = driver.switchTo().alert().getText();

        // Print the text
        System.out.println(alertMessage);

        // Pause this execution for a few seconds
        Thread.sleep(4000);



    }
}


