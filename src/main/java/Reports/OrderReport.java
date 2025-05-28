package Reports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrderReport {

	public void orderData(WebDriver driver)throws Exception {
		try {
		driver.findElement(By.xpath("//span[normalize-space()='Order Report']")).click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Wait for modal to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("swal2-container")));

		// Set Start Date
		WebElement startDate = driver.findElement(By.id("OrderReportStartDate"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", startDate, "2025-05-21");

		// Set End Date
		WebElement endDate = driver.findElement(By.id("OrderReportEndDate"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", endDate, "2025-05-22");

		// Select Status
		driver.findElement(By.xpath("//select[@id='SelectStatusorderreport']//option[contains(text(),'All')]")).click();

		// Wait for distributor dropdown to load
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("orderdistributorId")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("orderdistributorId"), "Nandan ortusolis"));

		// Select Distributor
		WebElement distributorDropdown = driver.findElement(By.id("orderdistributorId"));
		Select selectDistributor = new Select(distributorDropdown);
		selectDistributor.selectByVisibleText("Nandan ortusolis");

		// Wait for PDF checkbox and click it like a real user
		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("ordertablepdf")));
		Actions actions = new Actions(driver);
		actions.moveToElement(checkbox).click().perform();

		// Wait for 'Get Report' button to be clickable and click
		WebElement getReportBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("OrderReportIds")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getReportBtn); // Scroll if needed
		actions.moveToElement(getReportBtn).click().perform();

		// Optional: wait for table data or confirmation
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='ordertable']//td")));
		Thread.sleep(5000);
		
		//calling another class
		CustomerLedgerReport customerData = new CustomerLedgerReport();
		customerData.customerData(driver);
		
		
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
