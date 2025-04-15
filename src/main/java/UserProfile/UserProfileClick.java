package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserProfileClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.findElement(By.id("//span[normalize-space()='User Profile']")).click();
//	         Thread.sleep(5000);

	}

}
