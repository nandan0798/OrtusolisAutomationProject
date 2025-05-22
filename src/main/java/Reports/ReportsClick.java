package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ReportsClick {

	public void reportsData (WebDriver driver)throws Exception {
		try {
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
		Thread.sleep(3000);
		System.out.println("Reports click successfully");
		
		//calling another class 
		ProductTransactionReport productTransactionReportClick = new ProductTransactionReport();
		productTransactionReportClick.productTransactionReportClick(driver);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		

	}

}
