package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddUser {

	public void userAdding(WebDriver driver) throws Exception {
		try {
			//Add user
			   driver.findElement(By.xpath("//span[normalize-space()='Add User']")).click();
			   Thread.sleep(5000);
			   
			   //User Role Distributor
			   driver.findElement(By.xpath("//*[@name='userRole']//option[contains(text(),'Distributor')]")).click();
			   //First Name
			driver.findElement(By.id("userFirstName")).sendKeys("Girish");
			//Last Name
			driver.findElement(By.id("userLastName")).sendKeys("eVENKART");
			//Phone number
			driver.findElement(By.id("userPhoneNumber")).sendKeys("9938374856");
			//Email Id
			driver.findElement(By.id("userEmailId")).sendKeys("gi@gmail.com");
			//Password
			driver.findElement(By.id("userPassword")).sendKeys("123");
			//ADD Button
			WebElement addButton = driver.findElement(By.id("addUser"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
			Thread.sleep(5000); 
			System.out.println("Distributor added successfully");
			
			distributorApprove(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	} 
		private void distributorApprove(WebDriver driver)throws Exception {
			try {
//				   //Distributor approve table 
//				   
//				WebElement distributor = driver.findElement(By.xpath("//input[@type='search']"));
//				distributor.sendKeys("Sandesh");
//				distributor.click();
//				Thread.sleep(3000);
		//
//				 WebElement radioButton = driver.findElement(By.xpath("//button[@class='btn btn-outline-success dropdown-toggle dropdown-toggle-split']"));
//			       // Add a small delay to ensure scrolling is complete (optional)
//			       Thread.sleep(3000);
//			    
//			       // Click the radio button
//			          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//			          Thread.sleep(4000);
//				driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Approve']")).click();
//				driver.findElement(By.xpath("//button[normalize-space()='Yes, Approve']")).click();
//				Thread.sleep(4000);
				
				//calling another class
				ModifyUser mod = new ModifyUser();
				mod.moduser(driver);
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}


		}
}


	
		
	


