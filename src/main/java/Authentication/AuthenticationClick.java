package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AuthenticationClick {

	public void authClick(WebDriver driver) throws Exception {
		try {
			 driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
	         Thread.sleep(4000);
	         System.out.println("Authentication clicked successfully");
	         
	         //calling another class
	         Logout out = new Logout();
	         out.checkedOut(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

}
