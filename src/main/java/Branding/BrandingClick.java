package Branding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BrandingClick {

	public void ban(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
			Thread.sleep(5000);
			System.out.println("Branding clicked successfully");
			
			//Calling another class
			BannerDetails details = new BannerDetails();
			details.addBanner(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		

	}

}
