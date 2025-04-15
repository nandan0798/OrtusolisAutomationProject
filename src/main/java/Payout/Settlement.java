package Payout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settlement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 //Settlement
        driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
        Thread.sleep(4000);
        //select settlement distributor
        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
         Thread.sleep(5000);

	}

}
