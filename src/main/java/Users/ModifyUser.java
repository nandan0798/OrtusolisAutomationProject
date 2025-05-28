package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Reports.ReportsClick;

public class ModifyUser {

	public void moduser(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Modify User']")).click();
			 System.out.println("Modify user clicked successfully");
			 Thread.sleep(8000);
			 
			   //Select distributor load table
			 driver.findElement(By.xpath("//select[@id='searchUserDetails1']/option[contains(text(),'Distributor')]")).click();
			 Thread.sleep(4000);
			 
			   System.out.println("Distributor loaded successfully");
			   
			   //Table search to active/inactive or delete distributor 
			   WebElement delete = driver.findElement(By.id("search_input_all"));
			   delete.sendKeys("wonder");
			   delete.click();
			   Thread.sleep(3000);
			   System.out.println("Table search worked");
			   
			   //Info button click
			   driver.findElement(By.xpath("//tbody/tr[2]/td[8]/div[1]/button[2]")).click();
			   System.out.println("Info button clicked");
			   
			   //delete distributor name
			   driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
			   System.out.println("Update button clicked successfully");
			   
			   //confirmation for delete swal 
			   driver.findElement(By.xpath("//button[normalize-space()='Yes Update']")).click();
			   Thread.sleep(5000);
			   System.out.println("finally Updated");
			 
			 
			 
	// Reports feature is not working still , so only have jumped to Branding feature 
			 
			 //calling another class
			   ReportsClick reportsClick = new ReportsClick();
			   reportsClick.reportsData(driver);
			   
			 
			 
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 
	}

}
