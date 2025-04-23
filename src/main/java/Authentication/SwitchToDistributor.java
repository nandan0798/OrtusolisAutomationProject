package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SwitchToDistributor {

	public void distributorSwitch(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Switch To Distributor']")).click();
//	        Thread.sleep(5000);
			System.out.println("Switch to distributor successfull");
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		

	}

}
