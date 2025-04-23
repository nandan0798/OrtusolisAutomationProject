package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProfileAccountDetails {

	public void accountDetails(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//button[@id='updateProfileDetails']")).click();
	         Thread.sleep(4000);
	         System.out.println("Account details Updated Successfully");
	         
	         //calling another class
	         CompanyInformation info = new CompanyInformation();
	         info.information(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 

	}

}
