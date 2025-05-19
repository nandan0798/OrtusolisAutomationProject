package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ExcelUtils.ExcelUtils;

import java.nio.file.Paths;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = null;
        ExcelUtils excel = null;

        try {
            // Load Excel
            String filePath = Paths.get("src", "test", "resources", "testdata.xlsx").toString();
            excel = new ExcelUtils(filePath, "LoginData");

            // Read email and password from Excel
            String email = excel.getCellData(1, 0);
            String password = excel.getCellData(1, 1);

            // Launch browser
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");

            // Login steps
            driver.findElement(By.name("email")).sendKeys(email);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("remember")).click();
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(5000);

            // Write result to Excel
            excel.setCellData(1, 2, "Login Successful");
            excel.save();

            // Next steps
            System.out.println("Login Successful");
            Dashboard dashboard = new Dashboard();
            dashboard.dashboardClick(driver);

        } catch (Exception e) {
            System.out.println("Login Failed: " + e.getMessage());
            try {
                if (excel != null) excel.setCellData(0, 2, "Login Failed");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (excel != null) excel.closeWorkbook();
                if (driver != null) driver.quit();
            } catch (Exception ignored) {}
        }
    }
}
