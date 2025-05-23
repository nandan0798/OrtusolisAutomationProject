package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Branding.BannerDetails;

public class CustomerLedgerReport {

	public void customerData(WebDriver driver)throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Customer Ledger Report']")).click();
			
			// Set start date using JavaScript
			WebElement startDate = driver.findElement(By.id("CustomerLedgerStartDate"));
			((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", startDate, "2025-05-21");

			// Set end date using JavaScript
			WebElement endDate = driver.findElement(By.id("CustomerLedgerEndDate"));
			((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", endDate, "2025-05-22");
			Thread.sleep(5000);

			//Select distributor
			driver.findElement(By.xpath("//select[@id='customerdistributorId']//option[contains(text(),'Nandan ortusolis')]")).click();

		
			//select status
				driver.findElement(By.xpath("//select[@id='Selectstatus']//option[contains(text(),'All')]")).click();
				Thread.sleep(6000);

			
			//select customer 
			driver.findElement(By.xpath("//select[@id='SelectCustomer']//option[contains(text(),'Vishal P')]")).click();
			Thread.sleep(3000);
			
			//Generate pdf
			driver.findElement(By.id("CustomerLedgerReportPDFcheckboxTable")).click();
			
			//Get Report
			driver.findElement(By.id("CustomerLedgerReportId")).click();
			System.out.println("Ledger report generated successfully");
			
			//calling another class 
			BannerDetails bannerDetails = new BannerDetails();
			bannerDetails.addBanner(driver);
		
			
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		

	}
}


