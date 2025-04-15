package Payout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettlementHistory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
			//		         Thread.sleep(4000);
			//		         //select distributor
			//		         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
			//		         //select duration
			//		         driver.findElement(By.xpath("//*[@id='settlementdistributorduration']//option[contains(text(),'Weekly')]")).click();
			//		         //week calendar
			//		         driver.findElement(By.xpath("//input[@id='camp-week']")).sendKeys("13.2025");
			//		         Thread.sleep(4000);
			//		         //get settlement record
			//		         driver.findElement(By.xpath("//button[@id='update']")).click();
//					         Thread.sleep(4000);

	}

}
