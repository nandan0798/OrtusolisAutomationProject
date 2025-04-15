package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestOne {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with your chromedriver path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void doLogin() {
        driver.get("https://ortusolis.in/eVenkart-Development/Admin-Distributor/sign-in.php");
        driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
        driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Use quit() to close all browser windows and WebDriver session
            driver = null; // Set driver to null to avoid potential issues
        }
    }
}
