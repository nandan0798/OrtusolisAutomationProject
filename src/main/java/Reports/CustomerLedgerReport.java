package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLedgerReport {

	public void customerData(WebDriver driver)throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Customer Ledger Report']")).click();
			
			//start date
			WebElement sdate = driver.findElement(By.id("CustomerLedgerStartDate"));
			sdate.sendKeys("05/22/2025");
			sdate.click();
			
			//end date
			WebElement edate = driver.findElement(By.className("endDate"));
			edate.sendKeys("05/22/2025");
			edate.click();
			
			//Select distributors
			driver.findElement(By.xpath("//select[@id='customerdistributorId']//option[contains(text(),'Nandan ortusolis')]")).click();
			
			//select status
			driver.findElement(By.xpath("//select[@id='Selectstatus']//option[contains(text(),'All')]")).click();
			
			//select customer 
			driver.findElement(By.xpath("//select[@id='SelectCustomer']//option[contains(text(),'Nandan emergecustomer1')]")).click();
			Thread.sleep(3000);
			
			//Generate pdf
			driver.findElement(By.id("CustomerLedgerReportPDFcheckboxTable")).click();
			
			//Get Report
			driver.findElement(By.id("CustomerLedgerReportId")).click();
			System.out.println("Ledger report generated successfully");
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		

	}
}


