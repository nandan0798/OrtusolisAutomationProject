package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminPanelOne extends BaseTestOne {

    @Test
    public void TestLogin() {
        doLogin();
    }

    @Test
    public void Dashboard() {
        doLogin();
        driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
        System.out.println("Dashboard clicked Successfully");
    }

    @Test
    public void Productflow() {
        doLogin();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/span"))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void Categories() {
        doLogin();
        driver.findElement(
                By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/div/ul/li[1]/a/span"))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void Updatedelete() {
        doLogin();
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
		System.out.println("Category updated successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    @Test
//    public void AddSubCategory() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Sub-Category']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void SubCategoryUpdate() {
//        doLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement name = driver.findElement(By.id("search_input_all"));
//		name.sendKeys("TestSubCategory");
//		name.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(
//				By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Update']"))
//				.click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		System.out.println("Sub catgory updated succesfully");
//    }
//
//    @Test
//    public void Products() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Astra Designs')]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[2]")).click();
//		driver.findElement(By.xpath("//a[@id='activeBTn \"09a888c3-9cdd-45ea-9af3-94740b502895\"']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Distributor products shown successfull");
//    }
//
//    @Test
//    public void RatingsReviews() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Ratings and Reviews']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//*[@name='categories']//option[contains(text(),'Nandan ortusolis')]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Distributor product details shown");
//    }
//
//    @Test
//    public void Attribute() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Attributes']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void AttributeManagement() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Attribute Management']")).click();
//     // Attribute Key Name
////		driver.findElement(By.id("attributekey1")).sendKeys("Company");
////		// Attribute Key Description
////		driver.findElement(By.id("attributedescription1")).sendKeys("Work Related");
////		// ADD button
////		driver.findElement(By.id("Addattributekey")).click();
////		System.out.println("Attribute key added successfully");
////		driver.close();
//    }
//
//    @Test
//    public void UpdateAttributeKey() {
//        doLogin();
//        driver.findElement(By.id("search_input_all")).sendKeys("Company");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// Show table
//		WebElement Show = driver.findElement(By.xpath("//select[@name='attributemanagementTable_length']"));
//		Show.sendKeys("All");
//		Show.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement aaname = driver.findElement(By.id("search_input_all"));
//		aaname.sendKeys("Company");
//		aaname.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//tbody/tr[39]/td[4]/div[1]/button[2]")).click();
//		driver.findElement(By.xpath("//a[@id='updtattrikey54']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Attribute key updated successfully");
//    }
//
//    @Test
//    public void AttributeMapping() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Attribute Mapping']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//     // Attribute Key Name
////		driver.findElement(By.xpath("//select[@id='attributeKeyDetails']//option[contains(text(),'Company')]")).click();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////		// Attribute Key Value
////		driver.findElement(By.name("text")).sendKeys("Software");
////		// ADD button
////		driver.findElement(By.id("Addattributekey")).click();
////		System.out.println("Attribute mapping added successfully");
//    }
//    
// // Attribute Mapping Update or delete table
//    @Test
//    public void Attributemapping() {
//        doLogin();
//        WebElement Sea = driver.findElement(By.id("search_input_all"));
//		Sea.sendKeys("Software");
//		Sea.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//tbody/tr[224]/td[4]/div[1]/button[2]")).click();
//		driver.findElement(By.xpath("//a[@id='updtattrikey244']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Yes, Update']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Attribute mapping updated successfully");
//    }
//
//    @Test
//    public void SubCategory() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Sub Category Attribute Mapping']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // ... (rest of your SubCategory test logic) ...
//    }
//
//    @Test
//    public void SubCategoryMap() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Sub Category Attribute Mapping']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Select Category
//		driver.findElement(By.xpath("//select[@id='attributecategory']//option[contains(text(),'Testing Category')]"))
//				.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Select SubCategory
//		driver.findElement(By.xpath("//select[@id='attributesubcategory']//option[contains(text(),'TestSubCategory')]"))
//				.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		// Get Attributes
//		driver.findElement(By.id("updateattributesubmapping")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Displaying sub category Attributes successfully");
//    }
//
//    @Test
//    public void SelectCategoryAttribute() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Sub Category Mapped Attribute']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // ... (rest of your SelectCategoryAttribute test logic) ...
//    }
//
//    @Test
//    public void DeleteMappedAttribute() {
//        doLogin();
//        // ... (rest of your DeleteMappedAttribute test logic) ...
//    }
//
//    @Test
//    public void UsersClick() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void AddUser() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Add User']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // ... (rest of your AddUser test logic) ...
//    }
//
//    @Test
//    public void ModifyUserClick() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Modify User']")).click();
//        // ... (rest of your ModifyUserClick test logic) ...
//    }
//
//    @Test
//    public void ReportsClick() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void ProductTransaction() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Product Transaction Report']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // ... (rest of your ProductTransaction test logic) ...
//    }
//
//    @Test
//    public void BrandingClick() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Branding']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void BannerDetailsAdd() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Banner Details']")).click();
//        // ... (rest of your BannerDetailsAdd test logic) ...
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void UpdateBanner() {
//        doLogin();
//        // ... (rest of your UpdateBanner test logic) ...
//    }
//
//    @Test
//    public void FooterClick() {
//        doLogin();
//        driver.findElement(By.xpath("//a[normalize-space()='Footer Details']")).click();
//        // ... (rest of your FooterClick test logic) ...
//    }
//
//    @Test
//    public void Payout() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void Settlement() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Settlement']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // ... (rest of your Settlement test logic) ...
//    }
//
//    @Test
//    public void GetSettlementHistory() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Payout']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//span[normalize-space()='Settlement History']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // ... (rest of your GetSettlementHistory test logic) ...
//    }
//
//    @Test
//    public void Authentication() {
//        doLogin();
//        driver.findElement(By.xpath("//span[normalize-space()='Authentication']")).click();
//        driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
//        System.out.println("Log out successfull");
//    }
}