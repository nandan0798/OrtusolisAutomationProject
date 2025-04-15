package Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesClick {

	public void AttributesData(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Attributes']")).click();
        Thread.sleep(3000);
        System.out.println("Attributes clicked successful");
        AttributeManagement manage = new AttributeManagement();
        manage.Attributesmap(driver);
        System.out.println("Attributes added successfully");
       
	}

}
