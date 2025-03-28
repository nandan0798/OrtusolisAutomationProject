package Evenkart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductFlowTest extends BaseTest {

	@Test
    public void testAddSubCategory() throws InterruptedException {
        setup();
        login("emerg@emergindia.org", "eVENKART@2024");

        // Navigate to Product Flow > Sub Category
        driver.findElement(By.xpath("//span[text()='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Sub Category']")).click();
        Thread.sleep(2000);

        // Add Sub Category
        driver.findElement(By.id("SubCategoryName")).sendKeys("TestSubCategory");
        driver.findElement(By.xpath("//option[contains(text(),'Testing Category')]")).click();
        driver.findElement(By.id("fileToUploadSubCategory")).sendKeys("C:\\Users\\Nandan A S\\Downloads\\TestImage.png");

        Thread.sleep(3000);
        System.out.println("Sub Category added successfully!");

        teardown();
    }
}

