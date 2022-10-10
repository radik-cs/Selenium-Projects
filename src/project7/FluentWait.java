package project7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWait {
    static WebDriver driver;

    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        //needs to be fixed, it should be different
        driver.findElement(By.xpath("//button[@text()='Start']")).click();

        // Fluent Wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
        .withTimeout(30, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

        WebElement content = fluentWait.until(new Function<WebDriver,WebElement>(){
            public WebElement apply(WebDriver driver){

                //needs to be fixed, it should be different
                return driver.findElement(By.xpath("h4[text()='Hello World']"));
            }
        });
        System.out.println(content.getText());


    }
}
