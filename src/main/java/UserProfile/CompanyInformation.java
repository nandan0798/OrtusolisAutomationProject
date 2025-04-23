package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CompanyInformation {

	public void information(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//button[@id='ComapanyDetailssubmit']")).click();
	         Thread.sleep(5000);
	         System.out.println("Company information Updated successfully");
	         
	         //calling another class
	         PaymentDetails payinfo = new PaymentDetails();
	         payinfo.details(driver);	         
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 

	}

}
