package project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class ProjectTwo {

    public static void main(String[] args) {
        System.setProperty("webdrvier.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");

        // create reference variable, and object of the class
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com/");
        driver.findElement(By.id("identifierId")).sendKeys("radik.engineer@gmail.com");
        driver.findElement(By.className("Cwak9")).click();

        // creating a small test case
        String at = driver.getTitle();

        // expected title //
        String et = "gmail";
        driver.close();

        if(at.equalsIgnoreCase(et){
            System.out.println("Test Successful");
        }else
        {
            System.out.println("Test Failure");
        }

    }
}
