package Branding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BannerDetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//span[normalize-space()='Banner Details']")).click();
		//Banner content
//		driver.findElement(By.name("text")).sendKeys("Testing Banner");
		//Banner image link
//		driver.findElement(By.id("bannerImageLink")).sendKeys("Test Banner");
//		Thread.sleep(4000);
		//select banner image 
//		driver.findElement(By.id("fileToUploadBanner")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\emerg admin logo.jpg");
//		Thread.sleep(7000);
		//ADD banner button
//		WebElement radioButton = driver.findElement(By.id("AddBannerId"));
//		
//		        // Scroll to the radio button
//		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//	
//	
//	        // Add a small delay to ensure scrolling is complete (optional)
//		        Thread.sleep(3000);
//		
//	        // Click the radio button
		
		   //Update or delete Banner 
		driver.findElement(By.id("search_input_all")).sendKeys("Banner");
        Thread.sleep(7000);
		WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]"));
		        // Scroll to the radio button
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
	
	
	        // Add a small delay to ensure scrolling is complete (optional)
		        Thread.sleep(3000);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
		        
//		        driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]")).click();
		        driver.findElement(By.xpath("//a[@id='updtbanner377']")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		        Thread.sleep(4000);

	}

}
