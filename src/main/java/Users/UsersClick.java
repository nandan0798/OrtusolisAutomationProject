package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsersClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		   Thread.sleep(5000);

	}

}
