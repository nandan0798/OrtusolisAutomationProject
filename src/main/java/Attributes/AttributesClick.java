package Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AttributesClick {

	public void AttributesData(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Attributes']")).click();
	        Thread.sleep(3000);
	        System.out.println("Attributes clicked successful");
	        
	        //Calling another class
	        AttributeManagement manage = new AttributeManagement();
	        manage.attributesmap(driver);
	        System.out.println("Attributes added successfully");
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
       
	}

}
