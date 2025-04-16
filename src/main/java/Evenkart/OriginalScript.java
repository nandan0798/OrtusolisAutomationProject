package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
//		//Product flow
//	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span")).click();
//	Thread.sleep(5000); 
//	              
//	
//	//Category (Add Category)
////	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span")).click();
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
//	//Update or delete category 
////	WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
////	search.sendKeys("Testing Category");
////	search.click();
////    Thread.sleep(7000);
////    WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));
////    
////         // Scroll to the radio button
////        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
////    
////    
////       // Add a small delay to ensure scrolling is complete (optional)
////       Thread.sleep(3000);
////    
////       // Click the radio button
////          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
////          Thread.sleep(4000);
////
////    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']")).click();
////     driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
////   Thread.sleep(4000);
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
//       //Products
//         driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
//	         Thread.sleep(6000);
//	        
//	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
//	         Thread.sleep(7000);
//	         driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[2]")).click();
//         driver.findElement(By.xpath("//a[@id='activeBTn \"09a888c3-9cdd-45ea-9af3-94740b502895\"']")).click();
//	         driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate']")).click();
//        Thread.sleep(7000);
////	driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
////		Thread.sleep(7000);
//	
//		
//	         //Ratings and reviews
//	         driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
//	         Thread.sleep(6000);
//	         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
//	         Thread.sleep(7000);
//         
//
//         
////        Thread.sleep(2000);  // Wait for File Upload Dialog to Open
//	
////		Thread.sleep(5000);
//		Attributes Feature
	        driver.findElement(By.xpath("//span[normalize-space()='Attributes']")).click();
	        Thread.sleep(3000);
	        
//	       
//		//Attribute Management 
//		driver.findElement(By.xpath("//span[normalize-space()='Attribute Management']")).click();
//		
////		//Attribute Key Name
////		driver.findElement(By.id("attributekey1")).sendKeys("Company");
////		//Attribute Key Description 
////		driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
////		//ADD button
////		driver.findElement(By.id("Addattributekey")).click();
//		
//		
//		//Table search to update or delete attribute key
////	driver.findElement(By.id("search_input_all")).sendKeys("Company");
////		Thread.sleep(4000);
//		//Show table
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
//	
//	//Attribute Mapping 
//	
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
	//Sub Category Attribute Mapping 
	  driver.findElement(By.xpath("//span[normalize-space()='Sub Category Attribute Mapping']")).click();
   Thread.sleep(6000);
	  
	  //Select Category
	  driver.findElement(By.xpath("//select[@id='attributecategory']//option[contains(text(),'Testing Category')]")).click();
	  Thread.sleep(7000);
	  
	  //Select SubCategory 
	  driver.findElement(By.xpath("//select[@id='attributesubcategory']//option[contains(text(),'TestSubCategory')]")).click();
	  Thread.sleep(7000);
	  
	  //Get Attributes 
	  driver.findElement(By.id("updateattributesubmapping")).click();
	  Thread.sleep(6000);
	   
	   //Sub Category Map 
   driver.findElement(By.xpath("//select[@name='unmappedproductstable_length']")).sendKeys("All");
   Thread.sleep(3000);
     WebElement Map = driver.findElement(By.id("search_input_all"));
       Map.sendKeys("Company");
       Map.click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[1]")).click();
       Thread.sleep(5000); 
	
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
////		//Reports click 
////		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
////		Thread.sleep(3000);
//		   
//		  
////		//Product Transaction Report
////		driver.findElement(By.xpath("//span[normalize-space()='Product Transaction Report']")).click();
////		Thread.sleep(3000);
//		   
//		   
////		//Select distributor from loader
////		driver.findElement(By.xpath("//select[@id='distributorId']/option[contains(text(),'Astra Designs')]")).click();
////		Thread.sleep(3000);
//		
////		//order report click
////		driver.findElement(By.xpath("//span[normalize-space()='Order Report']")).click();
////		Thread.sleep(3000);
////		//start date 
////		WebElement start = driver.findElement(By.xpath("//input[@id='OrderReportStartDate']"));
////		start.sendKeys("02/03/2024");
////		start.click();
////		
////		//end date
////		WebElement end = driver.findElement(By.xpath("//input[@id='OrderReportEndDate']"));
////		 end.sendKeys("03/02/2025");
////		 end.click();
////	   //Select status
////	   Thread.sleep(3000);
////	   driver.findElement(By.xpath("//input[@id='SelectStatusorderreport']//option[contains(text(),'All')]")).click();
////	   //Select distributor 
////	   driver.findElement(By.xpath("//input[@name='orderdistributorId']//option[contains(text(),'Astra Designs')]")).click();
////	   Thread.sleep(3000);
////	   //Generate pdf 
////	   driver.findElement(By.id("ordertablepdf")).click();
////	   Thread.sleep(4000);
////	   
//		//Entire reports feature is having issue java team has fixed but needs to push
//		
//		
//		//Branding 
//		driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
//		Thread.sleep(4000);
//		//Banner details
//		driver.findElement(By.xpath("//span[normalize-space()='Banner Details']")).click();
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
//		driver.findElement(By.id("search_input_all")).sendKeys("Banner");
//        Thread.sleep(7000);
//		WebElement radioButton = driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]"));
//		        // Scroll to the radio button
//		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//	
//	
//	        // Add a small delay to ensure scrolling is complete (optional)
//		        Thread.sleep(3000);
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//		        
////		        driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]")).click();
//		        driver.findElement(By.xpath("//a[@id='updtbanner377']")).click();
//		        driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		        Thread.sleep(4000);
//		        
//		        //Footer
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
//		        
//			        //payout
//			        driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
//			        Thread.sleep(5000);
//			        //Settlement
//			        driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
//			        Thread.sleep(4000);
//			        //select settlement distributor
//			        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
//			         Thread.sleep(5000);
//	//		        
//	//		         //Settlement History
//	//		         driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
//	//		         Thread.sleep(4000);
//	//		         //select distributor
//	//		         driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
//	//		         //select duration
//	//		         driver.findElement(By.xpath("//*[@id='settlementdistributorduration']//option[contains(text(),'Weekly')]")).click();
//	//		         //week calendar
//	//		         driver.findElement(By.xpath("//input[@id='camp-week']")).sendKeys("13.2025");
//	//		         Thread.sleep(4000);
//	//		         //get settlement record
//	//		         driver.findElement(By.xpath("//button[@id='update']")).click();
//	//		         Thread.sleep(4000);
		        
//		        
//		         //User Profile(Didn't work need to fix this by me)
//		         driver.findElement(By.xpath("//span[normalize-space()='User Profile']")).click();
//		         Thread.sleep(5000);
//		         
//		         //Account/Profile
//		         driver.findElement(By.xpath("//button[@id='updateProfileDetails']")).click();
//		         Thread.sleep(4000);
//		         
//		         //company information 
//		         driver.findElement(By.xpath("//button[@id='ComapanyDetailssubmit']")).click();
//		         Thread.sleep(5000);
//		         
//		         //payment details
//		         driver.findElement(By.xpath("//button[@id='UpdatePaymentId']")).click();
//		         Thread.sleep(5000);
//		         
		         
		         //Authentication
		         driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
		         Thread.sleep(4000);
		         driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
		         Thread.sleep(4000);
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


