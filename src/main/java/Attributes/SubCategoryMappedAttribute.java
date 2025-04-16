package Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Users.UsersClick;

public class SubCategoryMappedAttribute {

	public void DeleteAttributes(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Sub Category Mapped Attribute']")).click();
		Thread.sleep(6000); 
		
		//Select Category
	      driver.findElement(By.xpath("//select[@id='mappedattributecategory']//option[contains(text(),'Testing Category')]")).click();
		  Thread.sleep(6000);
		
		//Select SubCategory 
		  driver.findElement(By.xpath("//select[@id='mappedattributesubcategory']//option[contains(text(),'TestSubCategory')]")).click();
		  Thread.sleep(6000);
		  
		  //Get ATtributes 
		  driver.findElement(By.id("updateloadallattributekeysformappedproducts")).click();
		  Thread.sleep(6000);
		
		  //Text field search to delete mapped attribute 
		   WebElement delete = driver.findElement(By.id("search_input_all"));
		   delete.sendKeys("Company");
		   delete.click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		   driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
		   System.out.println("Deleted attribute successfully");
		   UsersClick click = new UsersClick();
		   click.UsersData(driver);

	}

}
