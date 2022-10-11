package project8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input;

import java.awt.*;
import java.awt.event.InputEvent;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");

        // instantiating
        WebDriver driver = new ChromeDriver();

        // your file / project with alerts
        driver.get("https://www.amazon.com/gp/help/customer/display.html?nodeId=GSU7B24EJZGP9A9Y");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.id("a-autoid-0")).click();
        Thread.sleep(3000);

        // Create an object To switch to another alert
        Alert alert = driver.switchTo().alert();

        // Getting the text that present in the window
        String alertMessage = driver.switchTo().alert().getText();

        // Print the text
        System.out.println(alertMessage);

        // Pause this execution for a few seconds
        Thread.sleep(4000);

        // clicking the "Yes" button on Alert window
        alert.accept();

        // Pop Up button
        Thread.sleep(5000);
        driver.findElement(By.id("PopUp")).click();

        // Mouse functions
        Robot robot = new Robot();
        robot.mouseMove(400, 5)
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        driver.quit();

    }
}


