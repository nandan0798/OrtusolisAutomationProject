package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws Exception {
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			//Admin Panel Url 
		    driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
		    //Email id
		    driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
		    //Password
			driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
			//Remember me
			driver.findElement(By.name("remember")).click();
			//Login
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(5000);	
			System.out.println("Login Successful");
			
			//calling another class
			Dashboard dashboard = new Dashboard();
			dashboard.dashboardClick(driver);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	
	}
}
	
		

	


