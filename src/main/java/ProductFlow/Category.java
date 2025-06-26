package ProductFlow;

import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Strings;

import ExcelUtils.ExcelUtils;


public class Category {
		public void addCategory(WebDriver driver) throws Exception 
		{
			ExcelUtils excel = null;
			try {
				
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span")).click();
				System.out.println("Category clicked successfully");
				
				String filePath = Paths.get("src", "test", "resources", "testdata.xlsx").toString();
				excel = new ExcelUtils(filePath, "CategoryData");
				System.out.println("Getting data fetched");
				
				int rowCount = excel.getRowCount("CategoryData"); 
				System.out.println("Now we will provide info from Sheet " + rowCount);
				
				for (int i = 1; i < rowCount; i++) 
				{
					try {
						System.out.println("Reading row: " + i);
						String categoryName = excel.getCellData(i, 0);
						System.out.println("Category name" + categoryName);
						 if (Strings.isNullOrEmpty(categoryName)) {
			                	System.out.println("No first row");
			                	excel.setCellData(i, 3, "Please Enter Category Name!");
			                	
						 }
		                String categoryImage = excel.getCellData(i, 1);

		                System.out.println("Category i" + categoryImage);
						  if (Strings.isNullOrEmpty(categoryImage)) {
			                	excel.setCellData(i, 3, "Please Enter Category Image!");
			                	
						  }
		                String flag = excel.getCellData(i, 2); 
		                 if (Strings.isNullOrEmpty(flag)){
		                	excel.setCellData(i, 3, "Please select whether the category includes nutritional details.");
		                	
		                 }
		                 
		                driver.findElement(By.name("text")).sendKeys(categoryName);
						driver.findElement(By.id("fileToUploadCategory")).sendKeys(categoryImage);
						Thread.sleep(3000);
						if(flag.equalsIgnoreCase("Yes")) 
						{
							WebElement radioButton = driver.findElement(By.id("nutritionalYes"));
							
						     // Scroll to the radio button
						    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
						
						
						   // Add a small delay to ensure scrolling is complete (optional)
						   Thread.sleep(3000);
						
						   // Click the radio button

						  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
					       
					       Thread.sleep(4000);
					       driver.findElement(By.id("CategoryId")).click();
							excel.setCellData(i, 3, "Category added successfully");
							System.out.println("Category added successfully");
							Thread.sleep(10000);
							
							updateCategory(driver);
						}
						else if (flag.equalsIgnoreCase("No"))
						{
							WebElement radioButton = driver.findElement(By.id("nutritionalNo"));
							
						     // Scroll to the radio button
						    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
						
						
						   // Add a small delay to ensure scrolling is complete (optional)
						   Thread.sleep(3000);
						
						   // Click the radio button

						  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
					       
						  
					       Thread.sleep(4000);
					       driver.findElement(By.id("CategoryId")).click();
							excel.setCellData(i, 3, "Category added successfully");
							System.out.println("Category added successfully");
							Thread.sleep(10000);
							
							updateCategory(driver);
						}
						
						
					}catch (Exception e) {
						excel.setCellData(i, 3, "Test failed: " + e.getMessage());
				        System.err.println("Error in row " + i + ": " + e.getMessage());
					}
				
					
				}

				
//				driver.findElement(By.name("text")).sendKeys("Testing Category");
//				driver.findElement(By.id("fileToUploadCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Provider Panel.jpg");
//				Thread.sleep(3000);
//			     WebElement radioButton = driver.findElement(By.id("nutritionalNo"));
			//
//			     // Scroll to the radio button
//			    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
			//
			//
			//   // Add a small delay to ensure scrolling is complete (optional)
			//   Thread.sleep(3000);
			//
			//   // Click the radio button
//			      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//			      Thread.sleep(4000);
//				driver.findElement(By.id("CategoryId")).click();
				//System.out.println("Category added successfully");
//				Thread.sleep(10000);
//				updateCategory(driver);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
			
}
		private void updateCategory(WebDriver driver) throws Exception{
			try {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				// Wait until the element is visible and enabled
				WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search_input_all']")));
				System.out.println("entered category successfully");
				// Scroll into view
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", search);

				// Add small wait to avoid animation issues
				Thread.sleep(1000);

				// Click via JavaScript (if standard click fails)
				try {
				    search.click();
				} catch (Exception e) {
				    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", search);
				}

				// Send text after clicking
				search.sendKeys("Testing Category");
//
//			     
//				//Update or delete category 
////				WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
////				search.sendKeys("Testing Category");
////				search.click();
////			    Thread.sleep(7000);
//			    WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));
//			    
//			         // Scroll to the radio button
//			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//			    
//			    
//			       // Add a small delay to ensure scrolling is complete (optional)
//			       Thread.sleep(3000);
//			    
//			       // Click the radio button
//			          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//			          Thread.sleep(4000);
//			
//			    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
//			     driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//			   Thread.sleep(7000);
//				WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
//				search.sendKeys("Testing Category");
//				search.click();
//			    Thread.sleep(7000);
			    System.out.println("Search field entered successfully");
			    WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));
			    
			         // Scroll to the radio button
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
			        System.out.println("Info clicked successfully");
			    
			       // Add a small delay to ensure scrolling is complete (optional)
			      Thread.sleep(3000);
			   
			      // Click the radio button
			          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
			          Thread.sleep(4000);

			    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
			    System.out.println("successfully");  
			    driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
			     
			   Thread.sleep(4000);
			   System.out.println("Category Updated Successfully");
			   Thread.sleep(4000);
			   
			   //Calling SubCategory Class
			   SubCategory SubCategory = new SubCategory();
			   SubCategory.addSubCategory(driver);
				
			}catch(Exception e) {
				throw new Exception(e.getMessage());
			}
		}
		


}
