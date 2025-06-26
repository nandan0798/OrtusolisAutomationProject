package Evenkart;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OriginalScript {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Product flow
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span")).click();
	Thread.sleep(5000); 
	              
	
	//Category (Add Category)
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span")).click();
////	driver.findElement(By.name("text")).sendKeys("Testing Category");
////	driver.findElement(By.id("fileToUploadCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Provider Panel.jpg");
////	Thread.sleep(3000);
////     WebElement radioButton = driver.findElement(By.id("nutritionalNo"));
////
////     // Scroll to the radio button
////    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
////
////
////   // Add a small delay to ensure scrolling is complete (optional)
////   Thread.sleep(3000);
////
////   // Click the radio button
////      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
////      Thread.sleep(4000);
////	driver.findElement(By.id("CategoryId")).click();
////	Thread.sleep(10000);
//     
	//Update or delete category 
	WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
	search.sendKeys("Testing Category");
	search.click();
    Thread.sleep(7000);
    WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));
    
         // Scroll to the radio button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
    
    
       // Add a small delay to ensure scrolling is complete (optional)
      Thread.sleep(3000);
   
      // Click the radio button
          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
          Thread.sleep(4000);

    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
     driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
   Thread.sleep(4000);
////	
//	
//	
//		
//		//Add Sub Category)
//		driver.findElement(By.xpath("//span[normalize-space()='Sub-Category']")).click();
////		driver.findElement(By.id("SubCategoryName")).sendKeys("TestSubCategory");
////		Thread.sleep(4000);
////	driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Testing Category')]")).click();
////			Thread.sleep(2000);
////			driver.findElement(By.id("fileToUploadSubCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\Screenshot 2614.png");
////			Thread.sleep(8000);
////			WebElement radioButton = driver.findElement(By.id("updateId"));
////			
////			        // Scroll to the radio button
////			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
////			
////			
////			        // Add a small delay to ensure scrolling is complete (optional)
////			        Thread.sleep(3000);
////			
////			        // Click the radio button
////			        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//			   Thread.sleep(6000);
//			   
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
//             
//		
       //Products
//         driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
//	         Thread.sleep(6000);
	        
//	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
//	         Thread.sleep(7000);
//	         driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[2]")).click();
//         driver.findElement(By.xpath("//a[@id='activeBTn \"09a888c3-9cdd-45ea-9af3-94740b502895\"']")).click();
//	         driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate']")).click();
//        Thread.sleep(7000);
//	driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
//		Thread.sleep(7000);
	
//		
//	         //Ratings and reviews
//	         driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
//	         Thread.sleep(6000);
//	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
//	         Thread.sleep(7000);
//	         driver.findElement(By.xpath("//button[@class='btn btn-outline-success dropdown-toggle dropdown-toggle-split']")).click();
//	         driver.findElement(By.id("showratingId151")).click();
//	         driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//	         System.out.println("Review ratings activated successfully");
//	         Thread.sleep(7000);
	         
//	         System.out.println("Review Rating is not present");(This needs to be used only when if there is no product)

//         
////        Thread.sleep(2000);  // Wait for File Upload Dialog to Open
//	
////		Thread.sleep(5000);
		
		
//		Attributes Feature
//	        driver.findElement(By.xpath("//span[normalize-space()='Attributes']")).click();
//	        Thread.sleep(3000);
	        
	       
		//Attribute Management 
//		driver.findElement(By.xpath("//span[normalize-space()='Attribute Management']")).click();
//		
//		//Attribute Key Name
//		driver.findElement(By.id("attributekey1")).sendKeys("Company");
//		//Attribute Key Description 
//		driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
//		//ADD button
//		driver.findElement(By.id("Addattributekey")).click();
		
		
		//Table search to update or delete attribute key
//	driver.findElement(By.id("search_input_all")).sendKeys("Company");
//		Thread.sleep(4000);
		//Show table
//		WebElement Show =driver.findElement(By.xpath("//select[@name='attributemanagementTable_length']"));
//		Show.sendKeys("All");
//		Show.click();
//		Thread.sleep(4000);
//		 WebElement aaname = driver.findElement(By.id("search_input_all"));
//         aaname.sendKeys("Company");
//         aaname.click();
//         Thread.sleep(4000);
//		driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[2]")).click();
//		driver.findElement(By.xpath("//a[@id='updtattrikey54']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		Thread.sleep(4000);
	
//	//Attribute Mapping 
	
//		driver.findElement(By.xpath("//span[normalize-space()='Attribute Mapping']")).click();
//		Thread.sleep(3000);
//////		//Attribute Key Name
//////		driver.findElement(By.xpath("//select[@id='attributeKeyDetails']//option[contains(text(),'Company')]")).click();
//////		Thread.sleep(2000);
//////		//Attribute Key Value
//////		driver.findElement(By.name("text")).sendKeys("Software");
//////		//ADD button
//////		driver.findElement(By.id("Addattributekey")).click();
////	
//	   //Attribute Mapping Update or delete table 
//	   WebElement Sea =  driver.findElement(By.id("search_input_all"));
//	   Sea.sendKeys("Software");
//	   Sea.click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//tbody/tr[224]/td[4]/div[1]/button[2]")).click();
//	   driver.findElement(By.xpath("//a[@id='updtattrikey244']")).click();
//	   driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//	   Thread.sleep(4000); 
//	
//	//Sub Category Attribute Mapping 
//	  driver.findElement(By.xpath("//span[normalize-space()='Sub Category Attribute Mapping']")).click();
//   Thread.sleep(7000);
//	  
//	  //Select Category
//	  driver.findElement(By.xpath("//select[@id='attributecategory']//option[contains(text(),'Testing Category')]")).click();
//	  Thread.sleep(7000);
//	  
//	  //Select SubCategory 
//	  driver.findElement(By.xpath("//select[@id='attributesubcategory']//option[contains(text(),'TestSubCategory')]")).click();
//	  Thread.sleep(7000);
//	  
//	  //Get Attributes 
//	  driver.findElement(By.id("updateattributesubmapping")).click();
//	  Thread.sleep(6000);
//	   
//	   //Sub Category Map 
//   driver.findElement(By.xpath("//select[@name='unmappedproductstable_length']")).sendKeys("All");
//   Thread.sleep(3000);
//     WebElement Map = driver.findElement(By.id("search_input_all"));
//       Map.sendKeys("Company");
//       Map.click();
//       Thread.sleep(4000);
//       driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[1]")).click();
//       Thread.sleep(5000); 
//	
//	//Sub Category Mapped Attribute 
//	driver.findElement(By.xpath("//span[normalize-space()='Sub Category Mapped Attribute']")).click();
//	Thread.sleep(6000); 
//	
//	//Select Category
//      driver.findElement(By.xpath("//select[@id='mappedattributecategory']//option[contains(text(),'Testing Category')]")).click();
//	  Thread.sleep(6000);
//	
//	//Select SubCategory 
//	  driver.findElement(By.xpath("//select[@id='mappedattributesubcategory']//option[contains(text(),'TestSubCategory')]")).click();
//	  Thread.sleep(6000);
//	  
//	  //Get ATtributes 
//	  driver.findElement(By.id("updateloadallattributekeysformappedproducts")).click();
//	  Thread.sleep(6000);
//	
//	  //Text field search to delete mapped attribute 
//	   WebElement delete = driver.findElement(By.id("search_input_all"));
//	   delete.sendKeys("Company");
//	   delete.click();
//	   Thread.sleep(6000);
//	   driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
//	   driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
//	
//		   //Users (Add user)
//		   driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
//		   Thread.sleep(5000);
//		   //Add user
//		   driver.findElement(By.xpath("//span[normalize-space()='Add User']")).click();
//		   Thread.sleep(5000);
//		   
////		   //User Role Distributor
////		   driver.findElement(By.xpath("//*[@name='userRole']//option[contains(text(),'Distributor')]")).click();
////		   //First Name
////		driver.findElement(By.id("userFirstName")).sendKeys("Sandesh");
////		//Last Name
////		driver.findElement(By.id("userLastName")).sendKeys("Developer");
////		//Phone number
////		driver.findElement(By.id("userPhoneNumber")).sendKeys("9938374841");
////		//Email Id
////		driver.findElement(By.id("userEmailId")).sendKeys("sda@gmail.com");
////		//Password
////		driver.findElement(By.id("userPassword")).sendKeys("123");
////		//ADD Button
////		WebElement addButton = driver.findElement(By.id("addUser"));
////		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
////		Thread.sleep(5000); 
//		   
//
////		   //Distributor approve table 
////		   
////		WebElement distributor = driver.findElement(By.xpath("//input[@type='search']"));
////		distributor.sendKeys("prajwal");
////		distributor.click();
////		Thread.sleep(3000);
////
////		 WebElement radioButton = driver.findElement(By.xpath("//button[@class='btn btn-outline-success dropdown-toggle dropdown-toggle-split']"));
////	       // Add a small delay to ensure scrolling is complete (optional)
////	       Thread.sleep(3000);
////	    
////	       // Click the radio button
////	          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
////	          Thread.sleep(4000);
////		driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Approve']")).click();
////		driver.findElement(By.xpath("//button[normalize-space()='Yes, Approve']")).click();
////		Thread.sleep(4000);
//		   
//		   
//		   //Modify user
//		   driver.findElement(By.xpath("//span[normalize-space()='Modify User']")).click();
////		   //Select distributor load table
//////		   driver.findElement(By.xpath("//input[@id='searchUserDetails1']//option[contains(text(),'Distributor')]")).click();
////		   Thread.sleep(4000);
////		   //Table search to active/inactive or delete distributor 
////		   WebElement delete = driver.findElement(By.id("search_input_all"));
////		   delete.sendKeys("nandhan");
////		   delete.click();
////		   Thread.sleep(3000);
////		   //Info button click
////		   driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/button[2]")).click();
////		   //delete distributor name
////		   driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Delete']")).click();
////		   //confirmation for delete swal 
////		   driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
////		   Thread.sleep(5000);
//		   
//		   
//	
//		
//		//Reports click 
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
		Thread.sleep(3000);
		   
		  
//////		//Product Transaction Report
//		driver.findElement(By.xpath("//span[normalize-space()='Product Transaction Report']")).click();
//		Thread.sleep(3000);
//		
//    //Select distributor from loader
//		driver.findElement(By.xpath("//select[@id='distributorId']/option[contains(text(),'Astra Designs')]")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		
//		// Click Order Report
//		driver.findElement(By.xpath("//span[normalize-space()='Order Report']")).click();
//		Thread.sleep(3000);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//		// Wait for modal to disappear
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("swal2-container")));
//
//		// Set Start Date
//		WebElement startDate = driver.findElement(By.id("OrderReportStartDate"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", startDate, "2025-05-21");
//
//		// Set End Date
//		WebElement endDate = driver.findElement(By.id("OrderReportEndDate"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", endDate, "2025-05-22");
//
//		// Select Status
//		driver.findElement(By.xpath("//select[@id='SelectStatusorderreport']//option[contains(text(),'All')]")).click();
//
//		// Wait for distributor dropdown to load
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("orderdistributorId")));
//		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("orderdistributorId"), "Nandan ortusolis"));
//
//		// Select Distributor
//		WebElement distributorDropdown = driver.findElement(By.id("orderdistributorId"));
//		Select selectDistributor = new Select(distributorDropdown);
//		selectDistributor.selectByVisibleText("Nandan ortusolis");
//
//		// Wait for PDF checkbox and click it like a real user
//		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("ordertablepdf")));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(checkbox).click().perform();
//
//		// Wait for 'Get Report' button to be clickable and click
//		WebElement getReportBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("OrderReportIds")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getReportBtn); // Scroll if needed
//		actions.moveToElement(getReportBtn).click().perform();
//
//		// Optional: wait for table data or confirmation
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='ordertable']//td")));
		
		// Click on Customer Ledger Report
		driver.findElement(By.xpath("//span[normalize-space()='Customer Ledger Report']")).click();

		// Set start date using JavaScript
		WebElement startDate = driver.findElement(By.id("CustomerLedgerStartDate"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", startDate, "2025-05-21");

		// Set end date using JavaScript
		WebElement endDate = driver.findElement(By.id("CustomerLedgerEndDate"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", endDate, "2025-05-22");
		Thread.sleep(5000);

		//Select distributor
		driver.findElement(By.xpath("//select[@id='customerdistributorId']//option[contains(text(),'Nandan ortusolis')]")).click();

	
		//select status
			driver.findElement(By.xpath("//select[@id='Selectstatus']//option[contains(text(),'All')]")).click();
			Thread.sleep(6000);

		
		//select customer 
		driver.findElement(By.xpath("//select[@id='SelectCustomer']//option[contains(text(),'Vishal P')]")).click();
		Thread.sleep(3000);
		
		//Generate pdf
		driver.findElement(By.id("CustomerLedgerReportPDFcheckboxTable")).click();
		
		//Get Report
		driver.findElement(By.id("CustomerLedgerReportId")).click();
		System.out.println("Ledger report generated successfully");


	   
//		//Entire reports feature is having issue java team has fixed but needs to push
//		
//		
//		//Branding 
//		driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
//		Thread.sleep(4000);
//		//Banner details
//		driver.findElement(By.xpath("//span[normalize-space()='Banner Details']")).click();
//		Thread.sleep(4000);
		
		
		//		//Banner content
////		driver.findElement(By.name("text")).sendKeys("Testing Banner");
//		//Banner image link
////		driver.findElement(By.id("bannerImageLink")).sendKeys("Test Banner");
////		Thread.sleep(4000);
//		//select banner image 
////		driver.findElement(By.id("fileToUploadBanner")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\emerg admin logo.jpg");
////		Thread.sleep(7000);
//		//ADD banner button
////		WebElement radioButton = driver.findElement(By.id("AddBannerId"));
////		
////		        // Scroll to the radio button
////		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
////	
////	
////	        // Add a small delay to ensure scrolling is complete (optional)
////		        Thread.sleep(3000);
////		
////	        // Click the radio button
//		
//		   //Update or delete Banner 
//		WebElement search = driver.findElement(By.id("search_input_all"));
//		search.sendKeys("Banner");
//		search.click();
//        Thread.sleep(5000);
//		WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]"));
//		        // Scroll to the radio button
//		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//		        
//	
//	        // Add a small delay to ensure scrolling is complete (optional)
//		        Thread.sleep(3000);
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//		        
//		        driver.findElement(By.id("updtbanner378")).click();
//		        driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		        Thread.sleep(4000);
		        
		        //Footer
//		        driver.findElement(By.xpath("//a[normalize-space()='Footer Details']")).click();
//		        Thread.sleep(5000);
//		        driver.findElement(By.id("PhoneNumber")).clear();
//		        driver.findElement(By.id("EmailId")).clear();
//		        Thread.sleep(3000);
//		        driver.findElement(By.id("PhoneNumber")).sendKeys("8861097684");
//		        driver.findElement(By.id("EmailId")).sendKeys("Nandannandhu3@gmail.com");
//		        
//		        Thread.sleep(4000);
//		        driver.findElement(By.xpath("//button[@id='UpdateFooterId']")).click();
		        
//			        //payout
//			        driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
//			        Thread.sleep(5000);
//			        //Settlement
//			        driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
//			        Thread.sleep(4000);
//			        //select settlement distributor
//			        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
//			         Thread.sleep(5000);
//			         System.out.println("Payment details displayed successfully");
//			        
//			         //Settlement History
//			         driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
//			         Thread.sleep(4000);
//			         //select distributor
//			         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
//			         //select duration
//			         driver.findElement(By.xpath("//*[@id='settlementdistributorduration']//option[contains(text(),'Weekly')]")).click();
//			         //week calendar
//			         driver.findElement(By.xpath("//input[@id='camp-week']")).sendKeys("21.2025");
//			         Thread.sleep(4000);
//			         //get settlement record
//			         driver.findElement(By.xpath("//button[@id='update']")).click();
//			         Thread.sleep(4000);
//			         System.out.println("Settlement record displayed successfully");
		        
		        
		         //User Profile
//		driver.findElement(By.xpath("//span[normalize-space()='User Profile']")).click();
//		Thread.sleep(4000);
//
//		// Account/Profile
//		WebElement name = driver.findElement(By.id("userName"));
//		name.clear();
//		name.sendKeys("eMerge Emerg");
//		Thread.sleep(5000);
//		System.out.println("UserName");
//
//		WebElement firstname = driver.findElement(By.id("firstName"));
//		firstname.clear();
//		firstname.sendKeys("eMerge");
//		Thread.sleep(5000);
//		System.out.println("FirstName Updated Successfully");
//		
//		WebElement lastname = driver.findElement(By.id("lastName"));
//		lastname.clear();
//		lastname.sendKeys("Emerg");
//		Thread.sleep(5000);
//		System.out.println("LastName Updated Successfully");
//
//		WebElement number = driver.findElement(By.id("phoneNumber"));
//		number.clear();
//		number.sendKeys("8885000838");
//		Thread.sleep(4000);
//		System.out.println("Phone Number Updated Successfully");
//
//		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement updateButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateProfileDetails")));
//
//		System.out.println("Is update button enabled? " + updateButton.isEnabled());
//		System.out.println("Is update button displayed? " + updateButton.isDisplayed());
//
//		// Scroll into view (optional)
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", updateButton);
//		Thread.sleep(1000);
//
//		// Try normal click first
//		try {
//		    updateButton.click();
//		    System.out.println("Clicked using normal click");
//		} catch (Exception e) {
//		    System.out.println("Normal click failed, trying Javascript click");
//		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", updateButton);
//		}
//
//		Thread.sleep(8000); // just to observe
//
//         
//		         //company information 
//		         driver.findElement(By.xpath("//a[normalize-space()='Company Information']")).click();
//		         Thread.sleep(5000);
//		         
//		        WebElement company =  driver.findElement(By.id("CompanyName"));
//		        company.clear();
//		        company.sendKeys("EMerge");
//		        Thread.sleep(4000);
//		        System.out.println("company name updated successfully");
//		        
//		        WebElement url = driver.findElement(By.id("CompanyUrl"));
//		        url.clear();
//		        url.sendKeys("http://emergindia.org/");
//		        Thread.sleep(4000);
//		        System.out.println("Company Url Updated successfully");
//		        
//		        
//		         driver.findElement(By.xpath("//button[@id='ComapanyDetailssubmit']")).click();
//		         Thread.sleep(5000);
//		         System.out.println("Company information updated successfully");
//		         Thread.sleep(4000);
//		         
//		      // Handle multiple alerts
//		         while (true) {
//		             try {
//		                 Alert alert = driver.switchTo().alert();
//		                 System.out.println("Alert Text: " + alert.getText());
//		                 alert.accept();
//		                 System.out.println("Alert accepted");
//		                 Thread.sleep(2000);
//		             } catch (NoAlertPresentException e) {
//		                 System.out.println("No more alerts");
//		                 break;
//		             }
//		         }
//
//		         Thread.sleep(7000);
		         
		       
//		         //payment details
//		         WebDriverWait waitPayment = new WebDriverWait(driver, Duration.ofSeconds(10));
//		         WebElement paymentDetailsLink = waitPayment.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Payment Deatils']")));
//
//		         try {
//		             paymentDetailsLink.click();
//		             System.out.println("Clicked 'Payment Deatils' successfully.");
//		         } catch (Exception e) {
//		             System.err.println("Error clicking 'Payment Deatils': " + e.getMessage());
//		             // Optionally, you can try a JavaScript click as a fallback
//		             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", paymentDetailsLink);
//		             System.out.println("Tried clicking 'Payment Deatils' using JavaScript.");
//		         }
//
//		         Thread.sleep(3000);
//
//		         WebElement pay = driver.findElement(By.id("PaymentName"));
//		         pay.clear();
//		         pay.sendKeys("ENGINEERING MANUFACTURER ENTREPRENEURS RESOURCE GROUP");
//		         Thread.sleep(4000);
//		         System.out.println("Name Updated successfully");
//
//		         WebElement payAcc = driver.findElement(By.id("PaymentAcccountNumber"));
//		         payAcc.clear();
//		         payAcc.sendKeys("093705003812");
//		         Thread.sleep(4000);
//		         System.out.println("Account number successfully");
//
//		         WebElement payAdd = driver.findElement(By.id("PaymentAddress"));
//		         payAdd.clear();
//		         payAdd.sendKeys("No1&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;2 sharadhambaNagar MES Ring Road Jalahalli");
//		         Thread.sleep(4000);
//		         System.out.println("Address successfully");
//
//		         WebElement bankN = driver.findElement(By.id("PaymentBankName"));
//		         bankN.clear();
//		         bankN.sendKeys("ICIC0000937");
//		         System.out.println("Bank Update successfully");
//
//
//		         WebElement updatePaymentButton = driver.findElement(By.xpath("//button[@id='UpdatePaymentId']"));
//		         try {
//		             updatePaymentButton.click();
//		             System.out.println("Clicked 'Update Payment' button.");
//		         } catch (Exception e) {
//		             System.err.println("Error clicking 'Update Payment' button: " + e.getMessage());
//		             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", updatePaymentButton);
//		             System.out.println("Tried clicking 'Update Payment' button using JavaScript.");
//		         }
//
//		         Thread.sleep(5000);
//		         
//		         
//		         //Authentication
//		         driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
//		         Thread.sleep(4000);
//		         driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
//		         Thread.sleep(4000);
//		         driver.findElement(By.xpath("//span[normalize-space()='Switch To Distributor']")).click();
//		         Thread.sleep(5000);
		        
		         
		        
		        
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



