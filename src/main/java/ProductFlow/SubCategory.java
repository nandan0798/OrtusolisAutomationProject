package ProductFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubCategory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//span[normalize-space()='Sub-Category']")).click();
//		driver.findElement(By.id("SubCategoryName")).sendKeys("TestSubCategory");
//		Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Testing Category')]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("fileToUploadSubCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Screenshot 2614.png");
//			Thread.sleep(8000);
//			WebElement radioButton = driver.findElement(By.id("updateId"));
//			
//			        // Scroll to the radio button
//			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//			
//			
//			        // Add a small delay to ensure scrolling is complete (optional)
//			        Thread.sleep(3000);
//			
//			        // Click the radio button
//			        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
			   Thread.sleep(6000);
			   
			   //Sub Category Update or Delete 
			 Thread.sleep(5000);     
	         WebElement name = driver.findElement(By.id("search_input_all"));
	         name.sendKeys("TestSubCategory");
	         name.click();
             Thread.sleep(5000);
             driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();
             Thread.sleep(4000);
             driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
             driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
             Thread.sleep(5000);
	}

}
