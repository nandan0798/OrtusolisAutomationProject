package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ProductFlow.ProductFlowClick;

public class Dashboard {
	
	public void DashboardClick(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
			System.out.println("Dashboard action successful");
			
			ProductFlowClick product = new ProductFlowClick();
			product.FlowClick(driver);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		
	}

}
