package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public void CheckedOut(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
        Thread.sleep(4000);
        System.out.println("Logged out successful");
//        SwitchToDistributor switchtodistributor = new SwitchToDistributor();
//        switchtodistributor.DistributorSwitch(driver);
        

	}

}
