package Branding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Payout.PayoutClick;

public class FooterDetails {

	public void updateFooter(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Footer Details']")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.id("PhoneNumber")).clear();
	        driver.findElement(By.id("EmailId")).clear();
	        Thread.sleep(3000);
	        driver.findElement(By.id("PhoneNumber")).sendKeys("8861097684");
	        driver.findElement(By.id("EmailId")).sendKeys("Nandannandhu3@gmail.com");
	        
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//button[@id='UpdateFooterId']")).click();
	        System.out.println("Footer details updated successfully");
	        
	        //calling another class
	        PayoutClick pay = new PayoutClick();
	        pay.payDetails(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

}
