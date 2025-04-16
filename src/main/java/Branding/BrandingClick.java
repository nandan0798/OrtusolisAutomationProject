package Branding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandingClick {

	public void Ban(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
		Thread.sleep(4000);
		System.out.println("Branding clicked successfully");
		BannerDetails details = new BannerDetails();
		details.Update(driver);

	}

}
