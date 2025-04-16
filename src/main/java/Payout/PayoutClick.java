package Payout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayoutClick {

	public void PayDetails(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
        Thread.sleep(5000);
        System.out.println("Payout clicked successfully");
        Settlement settlement = new Settlement();
        settlement.SettlementDetails(driver);

	}

}
