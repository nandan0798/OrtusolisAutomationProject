package Authentication;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Logout {

	public void checkedOut(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
	        Thread.sleep(4000);
	        System.out.println("Logged out successful");
	        
	        //calling another class
//	        SwitchToDistributor switchtodistributor = new SwitchToDistributor();
//       switchtodistributor.distributorSwitch(driver);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
        

	}

}
