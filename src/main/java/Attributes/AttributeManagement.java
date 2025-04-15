package Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeManagement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		//Attribute Key Name
//		driver.findElement(By.id("attributekey1")).sendKeys("Company");
//		//Attribute Key Description 
//		driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
//		//ADD button
//		driver.findElement(By.id("Addattributekey")).click();
		
		
		//Table search to update or delete attribute key
//	driver.findElement(By.id("search_input_all")).sendKeys("Company");
//		Thread.sleep(4000);
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

	}

}
