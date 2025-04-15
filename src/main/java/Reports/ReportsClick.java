package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReportsClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
//		Thread.sleep(3000);

	}

}
