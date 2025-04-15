package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentDetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//a[normalize-space()='Payment Deatils']")).click();
        Thread.sleep(4000);
//        driver.findElement(By.name("submit")).click();

	}

}
