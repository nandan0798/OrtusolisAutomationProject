package Payout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PayoutClick {

	public void payDetails(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
	        Thread.sleep(5000);
	        System.out.println("Payout clicked successfully");
	        
	        //calling another class
	        Settlement settlement = new Settlement();
	        settlement.settlementDetails(driver);

		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

}
