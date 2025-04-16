package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsersClick {

	public void UsersData(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		   Thread.sleep(5000);
		   System.out.println("Users Clicked successfully");
		   AddUser user = new AddUser();
		   user.UserAdding(driver);

	}

}
