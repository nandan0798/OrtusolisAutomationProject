package Reports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Branding.BannerDetails;

public class CustomerLedgerReport {

	public void customerData(WebDriver driver) throws Exception {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        
	        // Wait for modal to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("swal2-container")));
	        
	        // Wait and click the Customer Ledger Report
	        WebElement ledgerMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Customer Ledger Report']")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ledgerMenu);
	        ledgerMenu.click();
	        
	        System.out.println("Customer Ledger Report clicked.");

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


