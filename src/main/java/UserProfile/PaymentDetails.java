package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Authentication.AuthenticationClick;

public class PaymentDetails {

	public void details(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//button[@id='UpdatePaymentId']")).click();
	        Thread.sleep(5000);
	        System.out.println("Payment details updated successfully");
	        AuthenticationClick auth = new AuthenticationClick();
	        auth.authClick(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
        

	}

}
