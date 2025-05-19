package Evenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ExcelUtils.ExcelUtils;
import org.openqa.selenium.Alert;


import java.nio.file.Paths;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = null;
        ExcelUtils excel = null;

        try {
            String filePath = Paths.get("src", "test", "resources", "testdata.xlsx").toString();
            excel = new ExcelUtils(filePath, "LoginData");

            int rowCount = excel.getRowCount("LoginData");

            for (int i = 1; i < rowCount; i++) {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://ortusolis.in/eVenkart-Testing/Admin-Distributor/sign-in.php");

                String email = excel.getCellData(i, 0);
                String password = excel.getCellData(i, 1);

                driver.findElement(By.name("email")).sendKeys(email);
                driver.findElement(By.name("password")).sendKeys(password);
                driver.findElement(By.name("remember")).click();
                driver.findElement(By.cssSelector("button[type='submit']")).click();

                Thread.sleep(3000);

                try {
                		String currentUrl = driver.getCurrentUrl();
                	    if (!currentUrl.contains("sign-in.php")) {
                	        excel.setCellData(i, 2, "Login Successful");
                	        System.out.println("Login Successful for Row " + i);
                	    }
                } catch (Exception e) {
                    excel.setCellData(i, 2, e.getMessage());
                    System.out.println("Login failed in the row  " + i);
                }

                driver.quit();
            }

            excel.save();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (excel != null) excel.closeWorkbook();
                if (driver != null) driver.quit();
            } catch (Exception ignored) {}
        }
    }
}
