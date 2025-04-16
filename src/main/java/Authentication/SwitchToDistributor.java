package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDistributor {

	public void DistributorSwitch(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Switch To Distributor']")).click();
//        Thread.sleep(5000);
		System.out.println("Switch to distributor successfull");

	}

}
