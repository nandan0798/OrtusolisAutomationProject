package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UsersClick {

	public void UsersData(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
			   Thread.sleep(5000);
			   System.out.println("Users Clicked successfully");
			   
			   //calling another class
			   AddUser user = new AddUser();
			   user.userAdding(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 
	}

}
