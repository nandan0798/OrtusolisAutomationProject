package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import Attributes.AttributesClick;

public class RatingsAndReview {

	public void reviews(WebDriver driver) throws Exception {
		try {
			System.out.println("Entered into ratings and review");
			driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
	         Thread.sleep(6000);
	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
	         Thread.sleep(7000);
	         driver.findElement(By.xpath("//button[@class='btn btn-outline-success dropdown-toggle dropdown-toggle-split']")).click();
	         driver.findElement(By.id("showratingId151")).click();

	         Thread.sleep(6000);
	         System.out.println("Review Rating activated");
	         
	         //calling another class
	         AttributesClick attribute = new AttributesClick();
	         attribute.attributesData(driver);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		 
         
		

	}

	}
}
