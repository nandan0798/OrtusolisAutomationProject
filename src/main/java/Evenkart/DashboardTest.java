package Evenkart;

import org.openqa.selenium.By;

public class DashboardTest extends BaseTest {

    public void testDashboardNavigation() throws InterruptedException {
        setup();
        login("emerg@emergindia.org", "eVENKART@2024");

        // Navigate to Dashboard
        driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
        Thread.sleep(3000);

        // Validate if Dashboard page is loaded
        String title = driver.getTitle();
        if (title.equals("Dashboard")) {
            System.out.println("Dashboard navigation test passed");
        } else {
            System.out.println("Dashboard navigation test failed");
        }

        teardown();
    }
}
