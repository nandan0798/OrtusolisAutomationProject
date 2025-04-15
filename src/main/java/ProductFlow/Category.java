package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Category {

	public void CategoryFlow(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span")).click();
		
		
//		driver.findElement(By.name("text")).sendKeys("Testing Category");
//		driver.findElement(By.id("fileToUploadCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Provider Panel.jpg");
//		Thread.sleep(3000);
//	     WebElement radioButton = driver.findElement(By.id("nutritionalNo"));
	//
//	     // Scroll to the radio button
//	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
	//
	//
	//   // Add a small delay to ensure scrolling is complete (optional)
	//   Thread.sleep(3000);
	//
	//   // Click the radio button
//	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//	      Thread.sleep(4000);
//		driver.findElement(By.id("CategoryId")).click();
//		Thread.sleep(10000);
	     
		//Update or delete category 
		WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
		search.sendKeys("Testing Category");
		search.click();
	    Thread.sleep(7000);
	    WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));
	    
	         // Scroll to the radio button
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
	    
	    
	       // Add a small delay to ensure scrolling is complete (optional)
	       Thread.sleep(3000);
	    
	       // Click the radio button
	          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
	          Thread.sleep(4000);
	
	    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
	     driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
	   Thread.sleep(7000);
	   System.out.println("Category Updated Successful");
	   SubCategory SubCategory = new SubCategory();
	   SubCategory.SubCategoryFlow(driver);
		

	}

}
