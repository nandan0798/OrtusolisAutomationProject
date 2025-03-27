package Evenkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Test Cases 
// 1)Launch Browser 
// 2)Open url https://ortusolis.in/eVenkart-Development/Admin-Distributor/sign-in.php
// 3)Validate the title "Admin Panel"
// 4)Close 
public class AdminPanel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
		driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		
	
		
//		//Dashboard
//		driver.findElement(By.className("nav")).click();		
//		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[1]/a/span")).click();
//		Thread.sleep(5000);
//		
//		//Product flow
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span")).click();
	Thread.sleep(5000);
	
	//Category (Add Category)
//	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span")).click();
//	driver.findElement(By.name("text")).sendKeys("Testing Category");
//	driver.findElement(By.id("fileToUploadCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Provider Panel.jpg");
//	Thread.sleep(3000);
//     WebElement radioButton = driver.findElement(By.id("nutritionalNo"));
//
//     // Scroll to the radio button
//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//
//
//   // Add a small delay to ensure scrolling is complete (optional)
//   Thread.sleep(3000);
//
//   // Click the radio button
//      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//      Thread.sleep(4000);
//	driver.findElement(By.id("CategoryId")).click();
//	Thread.sleep(10000);
     
//	//Update or delete category 
//	WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
//	search.sendKeys("Testing Category");
//	search.click();
//    Thread.sleep(7000);
//    WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));
//    
//         // Scroll to the radio button
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//    
//    
//       // Add a small delay to ensure scrolling is complete (optional)
//       Thread.sleep(3000);
//    
//       // Click the radio button
//          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//          Thread.sleep(4000);
//
//    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
//     driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//   Thread.sleep(4000);
	
	
	
		
		//Add Sub Category)
//		driver.findElement(By.xpath("//span[normalize-space()='Sub-Category']")).click();
//		driver.findElement(By.id("SubCategoryName")).sendKeys("TestSubCategory");
//		Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Testing Category')]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("fileToUploadSubCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Screenshot 2614.png");
//			Thread.sleep(8000);
//			WebElement radioButton = driver.findElement(By.id("updateId"));
//			
//			        // Scroll to the radio button
//			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//			
//			
//			        // Add a small delay to ensure scrolling is complete (optional)
//			        Thread.sleep(3000);
//			
//			        // Click the radio button
//			        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//			   Thread.sleep(6000);
			   
//			   //Sub Category Update or Delete 
//			 Thread.sleep(5000);     
//	         WebElement name = driver.findElement(By.id("search_input_all"));
//	         name.sendKeys("TestSubCategory");
//	         name.click();
//             Thread.sleep(5000);
//             driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();
//             Thread.sleep(4000);
//             driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
//             driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//             Thread.sleep(5000);
		 


		
		
       //Products
	         driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
	         Thread.sleep(4000);
	        // driver.findElement(By.name("categories")).click();
	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[2]")).click();
	         driver.findElement(By.xpath("//a[@id='activeBTn \"09a888c3-9cdd-45ea-9af3-94740b502895\"']")).click();
	         driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate']")).click();
	         Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(4000);
		
		
//	         //Ratings and reviews
//	         driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
//	         Thread.sleep(5000);
//	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
//	         Thread.sleep(3000);
         
//	         
//	         Thread.sleep(4000);
//		  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
//		   Thread.sleep(4000);
//	         
//        Thread.sleep(2000);  // Wait for File Upload Dialog to Open
//		
//		Thread.sleep(5000);
//		zAttributes Feature
//		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[3]/a/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"users\"]/li[1]/a/span")).click();
//		driver.findElement(By.id("attributekey1")).sendKeys("Company");
//		driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
//		driver.findElement(By.id("Addattributekey")).click();
//		driver.findElement(By.id("search_input_all")).sendKeys("Company");
//		 WebElement aaname = driver.findElement(By.id("search_input_all"));
//         aaname.sendKeys("Company");
//         aaname.click();
//         Thread.sleep(4000);
//		driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[2]")).click();
//		driver.findElement(By.xpath("//a[@id='updtattrikey52']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		Thread.sleep(4000);
	
		   //Users (Add user)
		   driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//span[normalize-space()='Add User']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@name='userRole']//option[contains(text(),'Distributor')]")).click();
		driver.findElement(By.id("userFirstName")).sendKeys("Manju");
		driver.findElement(By.id("userLastName")).sendKeys("Java");
		driver.findElement(By.id("userPhoneNumber")).sendKeys("9938374821");
		driver.findElement(By.id("userEmailId")).sendKeys("manj@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("123");
		driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='admin']//option[conatins(text(),'Distributor')]")).click();
		Thread.sleep(5000);
		WebElement Search = driver.findElement(By.className("form"));
		Search.sendKeys("Reddy");
		Search.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tr[@class='odd']//button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Approve']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Approve']")).click();
		Thread.sleep(5000);
		
		
		
		
		//Branding 
		driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[normalize-space()='Banner Details']")).click();
//		driver.findElement(By.name("text")).sendKeys("Testing Banner");
//		driver.findElement(By.id("bannerImageLink")).sendKeys("Test Banner");
//		Thread.sleep(4000);
//		driver.findElement(By.id("fileToUploadBanner")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\emerg admin logo.jpg");
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
//		WebElement radioButton = driver.findElement(By.id("AddBannerId"));
		
//		        // Scroll to the radio button
//		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
	
	
//	        // Add a small delay to ensure scrolling is complete (optional)
//		        Thread.sleep(3000);
//		
//	        // Click the radio button
//		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//		        driver.findElement(By.id("search_input_all")).sendKeys("Banner");
//		        Thread.sleep(5000);
//		        driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]")).click();
//		        driver.findElement(By.xpath("//a[@id='updtbanner377']")).click();
//		        driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		        
//		        //Footer
//		        driver.findElement(By.xpath("")).click();
//		        Thread.sleep(5000);
//		        driver.findElement(By.id("PhoneNumber")).sendKeys("8861097684");
//		        driver.findElement(By.id("EmailId")).sendKeys("Nandannandhu3@gmail.com");
//		        Thread.sleep(4000);
//		        driver.findElement(By.name("submit")).click();
		        
		        //payout
		        driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
		         Thread.sleep(5000);
		        
		         //Settlement History
		         driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
		         Thread.sleep(4000);
		         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
		         driver.findElement(By.xpath("//*[@id='settlementdistributorduration']//option[contains(text(),'Weekly')]")).click();
		         driver.findElement(By.xpath("//input[@id='camp-week']")).sendKeys("13.2025");
		         Thread.sleep(4000);
		         driver.findElement(By.xpath("//button[@id='update']")).click();
		         Thread.sleep(4000);
		        
		        
		         //User Profile
		         driver.findElement(By.id("//span[normalize-space()='User Profile']")).click();
		         Thread.sleep(5000);
		         driver.findElement(By.id("updateProfileDetails")).click();
		         Thread.sleep(4000);
		         
		         //company information 
		         driver.findElement(By.xpath("//a[normalize-space()='Company Information']")).click();
		         driver.findElement(By.name("ComapanyDetailssubmit")).click();
		         Thread.sleep(5000);
		         
		         //payment details
		         driver.findElement(By.xpath("//a[normalize-space()='Payment Deatils']")).click();
		         Thread.sleep(4000);
		         driver.findElement(By.name("submit")).click();
		         
		         
		         //Authentication
		         driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
		         Thread.sleep(4000);
		         driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
		         Thread.sleep(4000);
		         driver.findElement(By.xpath("//span[normalize-space()='Switch To Distributor']")).click();
		         Thread.sleep(5000);
		        
		         driver.close();
		        
		        
        // Use Robot Class to Type the File Path
//        Robot robot = new Robot();
//
//        // Copy the file path to clipboard
//        StringSelection filePath = new StringSelection("D:\\1736937591263 - Copy.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
//
//        // Paste the file path in the Windows File Dialog (Ctrl + V)
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//
//        // Press Enter to Upload
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

//				driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\1736937591263 - Copy.jpg");
		
	
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div/div/div/form/div[2]/div/div/div/div/div[1]/div/img"));
//		driver.findElement(By.id("CategoryImageAddition")).sendKeys("D:\1736937591263 - Copy.jpg");
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\1736937591263 - Copy.jpg");

//		driver.findElement(By.id("nutritionalNo")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("CategoryId")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"CategoryId\"]")).click();
//		Thread.sleep(5000);

//		Thread.sleep(5000);
	
//       driver.close();
        
	

		
		
		
//		String act_title=driver.getTitle();
//		if(act_title.equals("Admin Panel"))
//		{
//			System.out.println("Test Passed");
//		}
//		else 
//		{
//			System.out.println("Test Failed");
//		}
//		driver.close();
         
	}

}
