package Branding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterDetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//a[normalize-space()='Footer Details']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("EmailId")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("PhoneNumber")).sendKeys("8861097684");
        driver.findElement(By.id("EmailId")).sendKeys("Nandannandhu3@gmail.com");
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@id='UpdateFooterId']")).click();

	}

}
