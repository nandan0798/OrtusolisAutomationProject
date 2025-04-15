package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.findElement(By.xpath("//span[normalize-space()='Modify User']")).click();
//		   //Select distributor load table
////		   driver.findElement(By.xpath("//input[@id='searchUserDetails1']//option[contains(text(),'Distributor')]")).click();
//		   Thread.sleep(4000);
//		   //Table search to active/inactive or delete distributor 
//		   WebElement delete = driver.findElement(By.id("search_input_all"));
//		   delete.sendKeys("nandhan");
//		   delete.click();
//		   Thread.sleep(3000);
//		   //Info button click
//		   driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/button[2]")).click();
//		   //delete distributor name
//		   driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Delete']")).click();
//		   //confirmation for delete swal 
//		   driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
//		   Thread.sleep(5000);

	}

}
