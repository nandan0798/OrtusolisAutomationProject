package Attributes;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AttributeManagement {

	public void attributesmap(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Attribute Management']")).click();
//			//Attribute Key Name
//			driver.findElement(By.id("attributekey1")).sendKeys("Company");
//			//Attribute Key Description 
//			driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
//			//ADD button
//			driver.findElement(By.id("Addattributekey")).click();
			Thread.sleep(4000);
			
			updateAttributeManagement(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
		
		public void updateAttributeManagement(WebDriver driver)throws Exception{
			try {
				//Table search to update or delete attribute key
//				driver.findElement(By.id("search_input_all")).sendKeys("Company");
//					Thread.sleep(4000);
					//Show table
					WebElement Show =driver.findElement(By.xpath("//select[@name='attributemanagementTable_length']"));
					Show.sendKeys("All");
					Show.click();
					Thread.sleep(4000);
					 WebElement aaname = driver.findElement(By.id("search_input_all"));
			         aaname.sendKeys("Company");
			         aaname.click();
			         Thread.sleep(4000);
					driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[2]")).click();
					driver.findElement(By.xpath("//a[@id='updtattrikey54']")).click();
					driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
					Thread.sleep(4000);
					System.out.println("AttributeManagement Updated Successfully");
					
					//Calling another class
					AttributeMapping add = new AttributeMapping();
					add.attributekey(driver);
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		}


	}


