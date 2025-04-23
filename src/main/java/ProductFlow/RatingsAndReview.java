package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import Attributes.AttributesClick;

public class RatingsAndReview {

	public void Reviews(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
	         Thread.sleep(6000);
	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
	         Thread.sleep(7000);
	         System.out.println("Review Rating is not present");
	         
	         //calling another class
	         AttributesClick attribute = new AttributesClick();
	         attribute.AttributesData(driver);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		 
         
		

	}

	}
}
