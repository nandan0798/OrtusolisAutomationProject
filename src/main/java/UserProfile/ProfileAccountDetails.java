package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileAccountDetails {

	public void AccountDetails(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.xpath("//button[@id='updateProfileDetails']")).click();
         Thread.sleep(4000);
         System.out.println("Account details Updated Successfully");
         CompanyInformation info = new CompanyInformation();
         info.Information(driver);

	}

}
