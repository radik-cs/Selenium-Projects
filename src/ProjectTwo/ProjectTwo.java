package ProjectTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProjectTwo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdrvier.chrome.driver", "~Users/radikfakhretdinov/Downloads/chromedriver.exe");

        // create reference variable, and object of the class
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("radik.engineer@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("Cwak9")).click();
        Thread.sleep(2000);

        // creating a small test case
        String at = driver.getTitle();

        // expected title //
        String et = "gmail";
        driver.close();

        if (at.equalsIgnoreCase(et)) ;
        {
            System.out.println("Test Successful");
        }else
        System.out.println("Test Failure");


    }
}
