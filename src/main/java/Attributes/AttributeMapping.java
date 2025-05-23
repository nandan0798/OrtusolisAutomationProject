package Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AttributeMapping {

	public void attributekey(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Attribute Mapping']")).click();
			Thread.sleep(3000);
////			//Attribute Key Name
////			driver.findElement(By.xpath("//select[@id='attributeKeyDetails']//option[contains(text(),'Company')]")).click();
////			Thread.sleep(2000);
////			//Attribute Key Value
////			driver.findElement(By.name("text")).sendKeys("Software");
////			//ADD button
////			driver.findElement(By.id("Addattributekey")).click();
			Thread.sleep(4000);
			updateAttributeMapping(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}	
		public void updateAttributeMapping(WebDriver driver)throws Exception{
			try {
				//Attribute Mapping Update or delete table 
				   WebElement Sea =  driver.findElement(By.id("search_input_all"));
				   Sea.sendKeys("Software");
				   Sea.click();
				   Thread.sleep(3000);
				   driver.findElement(By.xpath("//tbody/tr[224]/td[4]/div[1]/button[2]")).click();
				   driver.findElement(By.xpath("//a[@id='updtattrikey244']")).click();
				   driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
				   Thread.sleep(4000); 
				   System.out.println("AttributeMapping Updated Successfully");
				   
				   //Calling another class
				   SubCategoryAttributeMapping mapp = new SubCategoryAttributeMapping();
				   mapp.mapAttributes(driver);
			}catch (Exception e) {
					throw new Exception (e.getMessage());
			}
		}
	   
	}




