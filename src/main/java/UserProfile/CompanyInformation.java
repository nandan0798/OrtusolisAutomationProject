package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyInformation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//a[normalize-space()='Company Information']")).click();
//        driver.findElement(By.name("ComapanyDetailssubmit")).click();
//        Thread.sleep(5000);

	}

}
