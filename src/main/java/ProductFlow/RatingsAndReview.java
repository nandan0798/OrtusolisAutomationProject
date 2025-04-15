package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Attributes.AttributeManagement;
import Attributes.AttributesClick;

public class RatingsAndReview {

	public void Reviews(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
         Thread.sleep(7000);
         System.out.println("Review Rating is not present");
         AttributesClick attribute = new AttributesClick();
         attribute.AttributesData(driver);
         
		

	}

}
