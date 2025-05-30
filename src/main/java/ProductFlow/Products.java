package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Products {

	public void productsData(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
	         Thread.sleep(6000);
	        
	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
	         Thread.sleep(7000);
	         driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[2]")).click();
	     driver.findElement(By.xpath("//a[@id='activeBTn \"09a888c3-9cdd-45ea-9af3-94740b502895\"']")).click();
	         driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate']")).click();
	    Thread.sleep(7000);
	    System.out.println("Products activated successful");
	    
	    //Calling another class
	    RatingsAndReview ratingsData = new RatingsAndReview();
	    ratingsData.reviews(driver);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		 

	}

	}
}
