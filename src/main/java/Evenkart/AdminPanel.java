package Evenkart;

import static org.testng.Assert.assertEquals;

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
import org.testng.Assert;
import org.testng.annotations.Test;

//Test Cases 
// 1)Launch Browser 
// 2)Open url https://ortusolis.in/eVenkart-Development/Admin-Distributor/sign-in.php
// 3)Validate the title "Admin Panel"
// 4)Close 
public class AdminPanel extends BaseTest {
	
	@Test
	public void TestLogin() {
		setup();
		login("emerg@emergindia.org", "eVENKART@2024");
		driver.close();
	}

//	@Test
//	public void testLogin() throws InterruptedException, AWTException {
//		// TODO Auto-generated method stub
//
//		setup();
//		driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
//		driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
//		driver.findElement(By.name("remember")).click();
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(5000);
//		teardown();
//	}

//	@Test
//	public void testDashBoard() throws InterruptedException, AWTException {
//		setup();
//		driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
//		driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
//		driver.findElement(By.name("remember")).click();
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(5000);
//	}
//
//	@Test
//	public void testProductflow() throws InterruptedException, AWTException {
//		setup();
//		driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
//		driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
//		driver.findElement(By.name("remember")).click();
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
//		Thread.sleep(3000);
//		teardown();
//	}
//
//	@Test
//	public void Category() throws InterruptedException, AWTException {
//		setup();
//		driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("email")).sendKeys("emerg@emergindia.org");
//		driver.findElement(By.name("password")).sendKeys("eVENKART@2024");
//		driver.findElement(By.name("remember")).click();
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
//		Thread.sleep(3000);
//		teardown();
//		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span"))
//				.click();
//		Thread.sleep(5000);
//	}

//		//Dashboard
	
	@Test
	public void Dashboard() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
		System.out.println("Dashboard clicked Successfully");
		driver.close();
	}

//		//Product flow
	@Test
	public void Productflow() {
		setup();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Category (Add Category)
	@Test
	public void Categories() {
		setup();
		driver.findElement(
				By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span"))
				.click();
//		driver.findElement(By.name("text")).sendKeys("Testing Category");
//		driver.findElement(By.id("fileToUploadCategory"))
//				.sendKeys("C:\\Users\\Nandan A S\\Downloads\\Provider Panel.jpg");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement radioButton = driver.findElement(By.id("nutritionalNo"));
//
//		// Scroll to the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//
//		// Add a small delay to ensure scrolling is complete (optional)
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Click the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.id("CategoryId")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Category added successfully");
//		driver.close();
//	
		}

	// Update or delete category
	@Test
	public void Updatedelete() {
		setup();
		WebElement search = driver.findElement(By.xpath("//input[@id='search_input_all']"));
		search.sendKeys("Testing Category");
		search.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement update = driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/button[2]"));

		// Scroll to the radio button
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", update);

		// Add a small delay to ensure scrolling is complete (optional)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click the radio button
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", update);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(
				By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']"))
				.click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Category updated successfully");
		driver.close();
	}

	// Add Sub Category)
	@Test
	public void AddSubCategory() {
		setup();
		
		driver.findElement(By.xpath("//span[normalize-space()='Sub-Category']")).click();
//		driver.findElement(By.id("SubCategoryName")).sendKeys("TestSubCategory");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Testing Category')]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.id("fileToUploadSubCategory"))
//				.sendKeys("C:\\Users\\Nandan A S\\Downloads\\Screenshot 2614.png");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement SubCategory = driver.findElement(By.id("updateId"));
//
//		// Scroll to the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", SubCategory);
//
//		// Add a small delay to ensure scrolling is complete (optional)
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Click the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubCategory);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("SubCategory added successfully");
//		driver.close();
//	
		}

	// Sub Category Update or Delete
	@Test
	public void SubCategoryUpdate() {
		setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name = driver.findElement(By.id("search_input_all"));
		name.sendKeys("TestSubCategory");
		name.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(
				By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']"))
				.click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		System.out.println("Sub catgory updated succesfully");
		driver.close();
	}


	// Products
	@Test
	public void Products() {
		setup();
		
		driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//a[@id='activeBTn \"09a888c3-9cdd-45ea-9af3-94740b502895\"']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Distributor products shown successfull");
		driver.close();
	}

	// Ratings and reviews
	@Test
	public void RatingsReviews() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Distributor product details shown");
		driver.close();
	}

//		Attributes Feature
	@Test
	public void Attribute() {
		setup();
		
		driver.findElement(By.xpath("//span[normalize-space()='Attributes']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Attribute Management
	@Test
	public void AttributeManagement() {
		setup();
		
		driver.findElement(By.xpath("//span[normalize-space()='Attribute Management']")).click();
		// Attribute Key Name
//		driver.findElement(By.id("attributekey1")).sendKeys("Company");
//		// Attribute Key Description
//		driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
//		// ADD button
//		driver.findElement(By.id("Addattributekey")).click();
//		System.out.println("Attribute key added successfully");
//		driver.close();
//	
		}

	// Table search to update or delete attribute key
	@Test
	public void UpdateAttributeKey() {
		setup();
		driver.findElement(By.id("search_input_all")).sendKeys("Company");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Show table
		WebElement Show = driver.findElement(By.xpath("//select[@name='attributemanagementTable_length']"));
		Show.sendKeys("All");
		Show.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement aaname = driver.findElement(By.id("search_input_all"));
		aaname.sendKeys("Company");
		aaname.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//a[@id='updtattrikey54']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Attribute key updated successfully");
		driver.close();
	}

	// Attribute Mapping
	@Test
	public void AttributeMapping() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Attribute Mapping']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// Attribute Key Name
//		driver.findElement(By.xpath("//select[@id='attributeKeyDetails']//option[contains(text(),'Company')]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// Attribute Key Value
//		driver.findElement(By.name("text")).sendKeys("Software");
//		// ADD button
//		driver.findElement(By.id("Addattributekey")).click();
//		System.out.println("Attribute mapping added successfully");
//		driver.close();
//	
		}

	// Attribute Mapping Update or delete table
	@Test
	public void Attributemapping() {
	
		setup();
		WebElement Sea = driver.findElement(By.id("search_input_all"));
		Sea.sendKeys("Software");
		Sea.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//tbody/tr[224]/td[4]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//a[@id='updtattrikey244']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Attribute mapping updated successfully");
		driver.close();
	}

	// Sub Category Attribute Mapping
	@Test
	public void SubCategory() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Sub Category Attribute Mapping']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select Category
		driver.findElement(By.xpath("//select[@id='attributecategory']//option[contains(text(),'Testing Category')]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select SubCategory
		driver.findElement(By.xpath("//select[@id='attributesubcategory']//option[contains(text(),'TestSubCategory')]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Get Attributes
		driver.findElement(By.id("updateattributesubmapping")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Displaying sub category Attributes successfully");
		driver.close();
	}

	// Sub Category Map
	@Test
	public void SubCategoryMap() {
		setup();
		driver.findElement(By.xpath("//select[@name='unmappedproductstable_length']")).sendKeys("All");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Map = driver.findElement(By.id("search_input_all"));
		Map.sendKeys("Company");
		Map.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Mapped sub category attributes successfully");
		driver.close();
	}

	// Sub Category Mapped Attribute
	@Test
	public void SelectCategoryAttribute() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Sub Category Mapped Attribute']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select Category
		driver.findElement(
				By.xpath("//select[@id='mappedattributecategory']//option[contains(text(),'Testing Category')]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select SubCategory
		driver.findElement(
				By.xpath("//select[@id='mappedattributesubcategory']//option[contains(text(),'TestSubCategory')]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Get ATtributes
		driver.findElement(By.id("updateloadallattributekeysformappedproducts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Displaying sub category mapped attribute");
		driver.close();
	}

	// Text field search to delete mapped attribute
	@Test
	public void DeleteMappedAttribute() {
		setup();
		WebElement delete = driver.findElement(By.id("search_input_all"));
		delete.sendKeys("Company");
		delete.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
		System.out.println("Deleted Mapped attribute to sub category successfully");
		driver.close();

	}

	// Users (Add user)
	@Test
	public void UsersClick() {
		setup();
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Add user
	@Test
	public void AddUser() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Add User']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		// User Role Distributor
//
//		driver.findElement(By.xpath("//*[@name='userRole']//option[contains(text(),'Distributor')]")).click();
//		// First Name
//		driver.findElement(By.id("userFirstName")).sendKeys("prajwal");
//		// Last Name
//		driver.findElement(By.id("userLastName")).sendKeys("Gowda");
//		// Phone number
//		driver.findElement(By.id("userPhoneNumber")).sendKeys("9938374842");
//		// Email Id
//		driver.findElement(By.id("userEmailId")).sendKeys("prg@gmail.com");
//		// Password
//		driver.findElement(By.id("userPassword")).sendKeys("123");
//		// ADD Button
//		WebElement addButton = driver.findElement(By.id("addUser"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Distributor added successfully");
//		driver.close();
//	
		}

//	// Distributor Approve or reject
//	@Test
//	public void DistributorApprove() {
//		setup();
//
//		WebElement distributor = driver.findElement(By.xpath("//input[@type='search']"));
//		distributor.sendKeys("prajwal");
//		distributor.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		WebElement radioButton = driver.findElement(
//				By.xpath("//button[@class='btn btn-outline-success dropdown-toggle dropdown-toggle-split']"));
//		// Add a small delay to ensure scrolling is complete (optional)
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Click the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(
//				By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Approve']"))
//				.click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Approve']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Distirbutor approved successfully");
//		driver.close();
//	}

	// Modify user
	@Test
	public void ModifyUserClick() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Modify User']")).click();

		// Select distributor load table

		driver.findElement(By.xpath("//input[@id='searchUserDetails1']//option[contains(text(),'Distributor')]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		// Table search to active/inactive or delete distributor
//
//		WebElement delete = driver.findElement(By.id("search_input_all"));
//		delete.sendKeys("nandhan");
//		delete.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// Info button click
//		driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/button[2]")).click();
//		// delete distributor name
//		driver.findElement(
//				By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Delete']"))
//				.click();
//		// confirmation for delete swal
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Distributor deleted successfully");
//		driver.close();
//	
		}

	// Reports click
	@Test
	public void ReportsClick() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Product Transaction Report
	@Test
	public void ProductTransaction() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Product Transaction Report']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select distributor from loader

		driver.findElement(By.xpath("//select[@id='distributorId']/option[contains(text(),'Astra Designs')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Distributor data fetched successfully");
		driver.close();	
		}
	

//	// order report click
//	@Test
//	public void OrderReportClick() {
//		setup();
//		driver.findElement(By.xpath("//span[normalize-space()='Order Report']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// start date
//		WebElement start = driver.findElement(By.xpath("//input[@id='OrderReportStartDate']"));
//		start.sendKeys("02/03/2024");
//		start.click();
//
//		// end date
//		WebElement end = driver.findElement(By.xpath("//input[@id='OrderReportEndDate']"));
//		end.sendKeys("03/02/2025");
//		end.click();
//		// Select status
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//input[@id='SelectStatusorderreport']//option[contains(text(),'All')]")).click();
//		// Select distributor
//		driver.findElement(By.xpath("//input[@name='orderdistributorId']//option[contains(text(),'Astra Designs')]"))
//				.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// Generate pdf
//		driver.findElement(By.id("ordertablepdf")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Order report generated successfully");
//		driver.close();
//	}
	// Entire reports feature is having issue java team has fixed but needs to push

	// Branding
	@Test
	public void BrandingClick() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Banner details
	@Test
	public void BannerDetailsAdd() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Banner Details']")).click();
		// Banner content
//		driver.findElement(By.name("text")).sendKeys("Testing Banner");
//		// Banner image link
//		driver.findElement(By.id("bannerImageLink")).sendKeys("Test Banner");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// select banner image
//		driver.findElement(By.id("fileToUploadBanner"))
//				.sendKeys("C:\\Users\\Nandan A S\\Downloads\\emerg admin logo.jpg");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// ADD banner button
//		WebElement radioButton = driver.findElement(By.id("AddBannerId"));
//
//		// Scroll to the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", radioButton);
//
//		// Add a small delay to ensure scrolling is complete (optional)
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Click the radio button
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
//		System.out.println("Banner details added successfully");
//		driver.close();
//	
		}

	// Update Banner
	@Test
	public void UpdateBanner() {
		setup();
		driver.findElement(By.id("search_input_all")).sendKeys("Banner");
		WebElement radioButton = driver.findElement(By.id("AddBannerId"));
		driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//a[@id='updtbanner377']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
		System.out.println("Banner details updated successfully");
		driver.close();
	}

	// Footer
	@Test
	public void FooterClick() {
		setup();
		driver.findElement(By.xpath("//a[normalize-space()='Footer Details']")).click();
		WebElement radioButton = driver.findElement(By.id("AddBannerId"));
		driver.findElement(By.id("PhoneNumber")).clear();
		driver.findElement(By.id("EmailId")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("PhoneNumber")).sendKeys("8861097684");
		driver.findElement(By.id("EmailId")).sendKeys("Nandannandhu3@gmail.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='UpdateFooterId']")).click();
		System.out.println("Footer details updated successfully");
		driver.close();
	}

	// payout
	@Test
	public void Payout() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Settlement
	@Test
	public void Settlement() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// select settlement distributor
		driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("settlement of distirbutor generated successfully");
		driver.close();
	}

	// Settlement History
	@Test
	public void GetSettlementHistory() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// select distributor
		driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
		// select duration
		driver.findElement(By.xpath("//*[@id='settlementdistributorduration']//option[contains(text(),'Weekly')]"))
				.click();
		// week calendar
		driver.findElement(By.xpath("//input[@id='camp-week']")).sendKeys("13.2025");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// get settlement record
		driver.findElement(By.xpath("//button[@id='update']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Weekly settlement of distributor generated successfully");
		driver.close();
	}

	// User Profile(Didn't work need to fix this by me)
//	@Test
//	public void UserProfileClick() {
//		setup();
//		driver.findElement(By.id("//span[normalize-space()='User Profile']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Save Changes
//		driver.findElement(By.id("updateProfileDetails")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Account details saved successfully");
//
//		// company information
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		driver.findElement(By.xpath("//a[normalize-space()='Company Information']")).click();
//		driver.findElement(By.name("ComapanyDetailssubmit")).click();
//		System.out.println("Company details updated successfully");
//
//		// payment details
//		driver.findElement(By.xpath("//a[normalize-space()='Payment Deatils']")).click();
//		driver.findElement(By.name("submit")).click();
//		System.out.println("Payment details updated successfully");
//		driver.close();
//		
//	}

	// Authentication
	@Test
	public void Authentication() {
		setup();
		driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
		System.out.println("Log out successfull");
//			         driver.findElement(By.xpath("//span[normalize-space()='Switch To Distributor']")).click();
		//System.out.println("Switch to distributor successfull");

		driver.close();
	}

}
