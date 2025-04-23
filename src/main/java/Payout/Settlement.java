package Payout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Settlement {

	public void settlementDetails(WebDriver driver) throws Exception {
		try {
			//Settlement
	        driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
	        Thread.sleep(4000);
	        //select settlement distributor
	        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
	         Thread.sleep(5000);
	         System.out.println("Distributor Settlement shown successful");
	         
	         //calling another class
	         SettlementHistory history = new SettlementHistory();
	         history.history(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 
         
	}

}
