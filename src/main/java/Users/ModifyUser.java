package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Branding.BrandingClick;

public class ModifyUser {

	public void moduser(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Modify User']")).click();
			 System.out.println("Modify user clicked successfully");
			   //Select distributor load table
			   driver.findElement(By.xpath("//input[@id='searchUserDetails1']//option[contains(text(),'Distributor')]")).click();
			   Thread.sleep(4000);
			   //Table search to active/inactive or delete distributor 
			   WebElement delete = driver.findElement(By.id("search_input_all"));
			   delete.sendKeys("wonder");
			   delete.click();
			   Thread.sleep(3000);
			   //Info button click
			   driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[2]")).click();
			   //delete distributor name
			   driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
			   //confirmation for delete swal 
			   driver.findElement(By.xpath("//button[normalize-space()='Yes Update']")).click();
			   Thread.sleep(5000);
			 
			 
			 
	// Reports feature is not working still , so only have jumped to Branding feature 
			 
			 //calling another class
			 BrandingClick brandingdata = new BrandingClick();
			 brandingdata.ban(driver);
			 
			 
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 
	}

}
