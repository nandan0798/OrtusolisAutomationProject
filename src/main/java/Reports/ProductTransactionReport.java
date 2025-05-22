package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductTransactionReport {

	public void productTransactionReportClick(WebDriver driver)throws Exception{
		try {
		driver.findElement(By.xpath("//span[normalize-space()='Product Transaction Report']")).click();
		Thread.sleep(3000); 
		
		//Select distributor from loader
		driver.findElement(By.xpath("//select[@id='distributorId']/option[contains(text(),'Astra Designs')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		System.out.println("Product transaction report downloaded successfully");
		
		//calling another class
		OrderReport orderData = new OrderReport();
		orderData.orderData(driver);
		
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}

