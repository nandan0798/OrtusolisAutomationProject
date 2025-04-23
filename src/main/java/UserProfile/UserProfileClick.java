package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserProfileClick {

	public void profileClick(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='User Profile']")).click();
	        Thread.sleep(5000);
		         System.out.println("Profile clicked successfully");
		         
		         //Calling another clas
		         ProfileAccountDetails account = new ProfileAccountDetails();
		         account.accountDetails(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	         

	}

}
