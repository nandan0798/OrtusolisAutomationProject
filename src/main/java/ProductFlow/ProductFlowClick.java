package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductFlowClick {

	public void flowClick(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span")).click();
			Thread.sleep(5000);
			System.out.println("Product click successful");
			
			//calling another class
			Category category = new Category();
			category.addCategory(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		
		
	}
	
		
}
}
