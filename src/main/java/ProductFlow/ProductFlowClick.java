package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductFlowClick {

	public void FlowClick(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span")).click();
		Thread.sleep(5000);
		System.out.println("Product click successful");
		Category category = new Category();
		category.CategoryFlow(driver);
	}
	
		
}
