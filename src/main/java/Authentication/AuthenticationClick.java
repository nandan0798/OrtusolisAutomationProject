package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationClick {

	public void AuthClick(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
         Thread.sleep(4000);
         System.out.println("Authentication clicked successfully");
         Logout out = new Logout();
         out.CheckedOut(driver);
	}

}
