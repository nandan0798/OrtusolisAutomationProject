package UserProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProfileAccountDetails {

	public void accountDetails(WebDriver driver) throws Exception {
		try {
			WebElement name = driver.findElement(By.id("userName"));
			name.clear();
			name.sendKeys("eMerge Emerg");
			Thread.sleep(5000);
			System.out.println("UserName");

			WebElement firstname = driver.findElement(By.id("firstName"));
			firstname.clear();
			firstname.sendKeys("eMerge");
			Thread.sleep(5000);
			System.out.println("FirstName Updated Successfully");
			
			WebElement lastname = driver.findElement(By.id("lastName"));
			lastname.clear();
			lastname.sendKeys("Emerg");
			Thread.sleep(5000);
			System.out.println("LastName Updated Successfully");

			WebElement number = driver.findElement(By.id("phoneNumber"));
			number.clear();
			number.sendKeys("8885000838");
			Thread.sleep(4000);
			System.out.println("Phone Number Updated Successfully");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement updateButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateProfileDetails")));

			System.out.println("Is update button enabled? " + updateButton.isEnabled());
			System.out.println("Is update button displayed? " + updateButton.isDisplayed());

			// Scroll into view (optional)
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", updateButton);
			Thread.sleep(1000);

			// Try normal click first
			try {
			    updateButton.click();
			    System.out.println("Clicked using normal click");
			} catch (Exception e) {
			    System.out.println("Normal click failed, trying Javascript click");
			    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", updateButton);
			}

			Thread.sleep(8000); // just to observe

			driver.findElement(By.xpath("//button[@id='updateProfileDetails']")).click();
	         Thread.sleep(4000);
	         System.out.println("Account details Updated Successfully");
	         
	         //calling another class
	         CompanyInformation info = new CompanyInformation();
	         info.information(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		 

	}

}
