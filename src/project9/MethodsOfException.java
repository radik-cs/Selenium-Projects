package project9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfException {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        // throw method
        try {
            driver.findElement(By.name("fake")).click();
        }catch (NoSuchElementException e){
            System.out.println("This element is not found");
            System.out.println("Hello");

             throw (e);
        }

        System.out.println("Hello");

    }

    }
}
