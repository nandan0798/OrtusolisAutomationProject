package ProductFlow;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Strings;

import ExcelUtils.ExcelUtils;


public class SubCategory {

		public void addSubCategory(WebDriver driver) throws Exception 
		{
			ExcelUtils excel = null;
			try {
				driver.findElement(By.xpath("//span[normalize-space()='Sub-Category']")).click();
				System.out.println("Sub Category Clicked Successfullly");
				String filePath = Paths.get("src", "test", "resources", "testdata.xlsx").toString();
				excel = new ExcelUtils(filePath, "SubCategoryData");
				System.out.println("Getting data fetched");
				
				int rowCount = excel.getRowCount("SubCategoryData"); 
				System.out.println("Now we will provide info from Sheet " + rowCount); 
				
				for (int i = 1; i < rowCount; i++) {
					try {
						System.out.println("Reading row: " + i);
						String subCategoryName = excel.getCellData(i, 0);
						System.out.println("Sub-Category Name" + subCategoryName);
						 if (Strings.isNullOrEmpty(subCategoryName)) {
			                	System.out.println("No first row");
			                	excel.setCellData(i, 3, "Please Enter Sub-Category Name");
			                	
						 }
					
//				driver.findElement(By.id("SubCategoryName")).sendKeys("TestSubCategory");
//				Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Testing Category')]")).click();
//					Thread.sleep(2000);
//					driver.findElement(By.id("fileToUploadSubCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Screenshot 2614.png");
//					Thread.sleep(8000);
//					WebElement radioButton = driver.findElement(By.id("updateId"));
//					
//					        // Scroll to the radio button
//					        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//					
//					
//					        // Add a small delay to ensure scrolling is complete (optional)
//					        Thread.sleep(3000);
//					
//					        // Click the radio button
//					        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
					   Thread.sleep(6000);
					   updateSubCategory(driver);
					}catch (Exception e) {
						excel.setCellData(i, 3, "Test failed: " + e.getMessage());
				        System.err.println("Error in row " + i + ": " + e.getMessage());
					}
				}
			}catch(Exception e) {
				throw new Exception(e.getMessage());
			}
								
}
		private void updateSubCategory(WebDriver driver) throws Exception{
			try {
			   
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
             Thread.sleep(6000);
             System.out.println("Subcategory Updated Successful");
             
             //Calling another class
             Products products = new Products();
             products.productsData(driver);
			}catch(Exception e) {
				throw new Exception(e.getMessage());
			}
		}
              
	}


