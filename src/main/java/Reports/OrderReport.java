package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderReport {

	public void orderData(WebDriver driver)throws Exception {
		try {
		driver.findElement(By.xpath("//span[normalize-space()='Order Report']")).click();
//		Thread.sleep(3000);
//		//start date 
//		WebElement start = driver.findElement(By.xpath("//input[@id='OrderReportStartDate']"));
//		start.sendKeys("02/03/2024");
//		start.click();
//		
//		//end date
//		WebElement end = driver.findElement(By.xpath("//input[@id='OrderReportEndDate']"));
//		 end.sendKeys("03/02/2025");
//		 end.click();
		
		
//	   //Select status
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//input[@id='SelectStatusorderreport']//option[contains(text(),'All')]")).click();
		
		
//	   //Select distributor 
//	   driver.findElement(By.xpath("//input[@name='orderdistributorId']//option[contains(text(),'Astra Designs')]")).click();
//	   Thread.sleep(3000);
		
//	   //Generate pdf 
//	   driver.findElement(By.id("ordertablepdf")).click();
//	   Thread.sleep(4000); 
		
		//Entire reports feature is having issue java team has fixed but needs to push 
		
		//calling another class
		CustomerLedgerReport customerData = new CustomerLedgerReport();
		customerData.customerData(driver);
		
		
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
