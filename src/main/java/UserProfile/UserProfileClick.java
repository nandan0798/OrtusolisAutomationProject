package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserProfileClick {

	public void ProfileClick(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='User Profile']")).click();
        Thread.sleep(5000);
	         System.out.println("Profile clicked successfully");
	         ProfileAccountDetails account = new ProfileAccountDetails();
	         account.AccountDetails(driver);
	         

	}

}
