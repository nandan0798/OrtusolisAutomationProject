package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyInformation {

	public void Information(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.xpath("//button[@id='ComapanyDetailssubmit']")).click();
         Thread.sleep(5000);
         System.out.println("Company information Updated successfully");
         PaymentDetails payinfo = new PaymentDetails();
         payinfo.Details(driver);
         

	}

}
