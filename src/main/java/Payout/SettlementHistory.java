package Payout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import UserProfile.UserProfileClick;

public class SettlementHistory {

	public void history(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
			
	         Thread.sleep(4000);
	         //select distributor
	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
	         //select duration
	         driver.findElement(By.xpath("//*[@id='settlementdistributorduration']//option[contains(text(),'Weekly')]")).click();
	         //week calendar
	         driver.findElement(By.xpath("//input[@id='camp-week']")).sendKeys("21.2025");
	         Thread.sleep(4000);
	         //get settlement record
	         driver.findElement(By.xpath("//button[@id='update']")).click();
	         Thread.sleep(4000);
		   System.out.println("Settlement history displayed successful");
		   
		   //calling another class
		   UserProfileClick Profile = new UserProfileClick();
		   Profile.profileClick(driver);
		   
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		   
		   
		   

	}

}
