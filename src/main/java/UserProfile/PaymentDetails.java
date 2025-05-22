package UserProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Authentication.AuthenticationClick;

public class PaymentDetails {

	public void details(WebDriver driver) throws Exception {
		try {
			WebDriverWait waitPayment = new WebDriverWait(driver, Duration.ofSeconds(10));
	         WebElement paymentDetailsLink = waitPayment.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Payment Deatils']")));

	         try {
	             paymentDetailsLink.click();
	             System.out.println("Clicked 'Payment Deatils' successfully.");
	         } catch (Exception e) {
	             System.err.println("Error clicking 'Payment Deatils': " + e.getMessage());
	             // Optionally, you can try a JavaScript click as a fallback
	             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", paymentDetailsLink);
	             System.out.println("Tried clicking 'Payment Deatils' using JavaScript.");
	         }

	         Thread.sleep(3000);

	         WebElement pay = driver.findElement(By.id("PaymentName"));
	         pay.clear();
	         pay.sendKeys("ENGINEERING MANUFACTURER ENTREPRENEURS RESOURCE GROUP");
	         Thread.sleep(4000);
	         System.out.println("Name Updated successfully");

	         WebElement payAcc = driver.findElement(By.id("PaymentAcccountNumber"));
	         payAcc.clear();
	         payAcc.sendKeys("093705003812");
	         Thread.sleep(4000);
	         System.out.println("Account number successfully");

	         WebElement payAdd = driver.findElement(By.id("PaymentAddress"));
	         payAdd.clear();
	         payAdd.sendKeys("No1&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;2 sharadhambaNagar MES Ring Road Jalahalli");
	         Thread.sleep(4000);
	         System.out.println("Address successfully");

	         WebElement bankN = driver.findElement(By.id("PaymentBankName"));
	         bankN.clear();
	         bankN.sendKeys("ICIC0000937");
	         System.out.println("Bank Update successfully");


	         WebElement updatePaymentButton = driver.findElement(By.xpath("//button[@id='UpdatePaymentId']"));
	         try {
	             updatePaymentButton.click();
	             System.out.println("Clicked 'Update Payment' button.");
	         } catch (Exception e) {
	             System.err.println("Error clicking 'Update Payment' button: " + e.getMessage());
	             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", updatePaymentButton);
	             System.out.println("Tried clicking 'Update Payment' button using JavaScript.");
	         }

	         Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='UpdatePaymentId']")).click();
	        Thread.sleep(5000);
	        System.out.println("Payment details updated successfully");
	        
	        //Calling another class
	        AuthenticationClick auth = new AuthenticationClick();
	        auth.authClick(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
        

	}

}
