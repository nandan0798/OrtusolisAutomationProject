package UserProfile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CompanyInformation {

	public void information(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//button[@id='ComapanyDetailssubmit']")).click();
	         Thread.sleep(5000);
	         WebElement company =  driver.findElement(By.id("CompanyName"));
		        company.clear();
		        company.sendKeys("EMerge");
		        Thread.sleep(4000);
		        System.out.println("company name updated successfully");
		        
		        WebElement url = driver.findElement(By.id("CompanyUrl"));
		        url.clear();
		        url.sendKeys("http://emergindia.org/");
		        Thread.sleep(4000);
		        System.out.println("Company Url Updated successfully");
		        
		        
		         driver.findElement(By.xpath("//button[@id='ComapanyDetailssubmit']")).click();
		         Thread.sleep(5000);
		         System.out.println("Company information updated successfully");
		         Thread.sleep(4000);
		         
		      // Handle multiple alerts
		         while (true) {
		             try {
		                 Alert alert = driver.switchTo().alert();
		                 System.out.println("Alert Text: " + alert.getText());
		                 alert.accept();
		                 System.out.println("Alert accepted");
		                 Thread.sleep(2000);
		             } catch (NoAlertPresentException e) {
		                 System.out.println("No more alerts");
		                 break;
		             }
		         }

		         Thread.sleep(7000);
	         
	         System.out.println("Company information Updated successfully");
	         
	         //calling another class
	         PaymentDetails payinfo = new PaymentDetails();
	         payinfo.details(driver);	         
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 

	}

}
