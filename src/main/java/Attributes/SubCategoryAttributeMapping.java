package Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubCategoryAttributeMapping {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.findElement(By.xpath("//span[normalize-space()='Sub Category Attribute Mapping']")).click();
		   Thread.sleep(6000);
			  
			  //Select Category
			  driver.findElement(By.xpath("//select[@id='attributecategory']//option[contains(text(),'Testing Category')]")).click();
			  Thread.sleep(7000);
			  
			  //Select SubCategory 
			  driver.findElement(By.xpath("//select[@id='attributesubcategory']//option[contains(text(),'TestSubCategory')]")).click();
			  Thread.sleep(7000);
			  
			  //Get Attributes 
			  driver.findElement(By.id("updateattributesubmapping")).click();
			  Thread.sleep(6000);
			   
			   //Sub Category Map 
		   driver.findElement(By.xpath("//select[@name='unmappedproductstable_length']")).sendKeys("All");
		   Thread.sleep(3000);
		     WebElement Map = driver.findElement(By.id("search_input_all"));
		       Map.sendKeys("Company");
		       Map.click();
		       Thread.sleep(4000);
		       driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[1]")).click();
		       Thread.sleep(5000); 
			

	}

}
