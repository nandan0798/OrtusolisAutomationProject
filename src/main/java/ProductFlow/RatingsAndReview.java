package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingsAndReview {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
         Thread.sleep(7000);
		

	}

}
