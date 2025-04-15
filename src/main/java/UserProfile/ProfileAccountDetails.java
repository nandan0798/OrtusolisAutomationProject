package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileAccountDetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("updateProfileDetails")).click();
//        Thread.sleep(4000);

	}

}
