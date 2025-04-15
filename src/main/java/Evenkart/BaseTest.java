package Evenkart;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;

public class BaseTest {
    protected WebDriver driver;

    // Method to initialize WebDriver
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Method to log in to the application
    
    public void login(String email, String password) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    
    public void doLogin() {
    	login("emerg@emergindia.org", "eVENKART@2024");
    }

    // Method to close the browser
    public void teardown() {
//        if (driver != null) {
            driver.quit();
//        }
    }
}
