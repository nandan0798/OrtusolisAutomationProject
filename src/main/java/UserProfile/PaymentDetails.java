package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Authentication.AuthenticationClick;

public class PaymentDetails {

	public void Details(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='UpdatePaymentId']")).click();
        Thread.sleep(5000);
        System.out.println("Payment details updated successfully");
        AuthenticationClick auth = new AuthenticationClick();
        auth.AuthClick(driver);
        

	}

}
