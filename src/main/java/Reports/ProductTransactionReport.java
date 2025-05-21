package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductTransactionReport {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//span[normalize-space()='Product Transaction Report']")).click();
		Thread.sleep(3000); 
		
		//Select distributor from loader
		driver.findElement(By.xpath("//select[@id='distributorId']/option[contains(text(),'Astra Designs')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();	

	}

}
