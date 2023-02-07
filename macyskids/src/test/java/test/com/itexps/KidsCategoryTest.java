/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ukiel
 */
public class KidsCategoryTest {

    private WebDriver driver;
    private String baseUrl;

    public KidsCategoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
      System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void testKidsCategory() throws Exception {
        driver.get("https://www.target.com/");
        driver.findElement(By.xpath("//img[contains(@src,'https://target.scene7.com/is/image/Target/GUEST_e3d6ddb7-ffdc-4734-942e-007236e1e167?wid=315&hei=315&qlt=60&fmt=webp')]")).click();
        driver.findElement(By.xpath("//div[@id='pageBodyContainer']/div/div/div/div/div/h1")).click();
        driver.findElement(By.xpath("//div[@id='pageBodyContainer']/div/div/div/div/div/h1")).click();
        //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='pageBodyContainer']/div/div/div/div/div/h1 | ]]
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='pageBodyContainer']/div/div/div/div/div/h1")).getText(), "Kids’ Clothing");
        } catch (Error e) {
            System.out.println(e.toString());
        }
        driver.findElement(By.xpath("//img[contains(@src,'https://target.scene7.com/is/image/Target/GUEST_8d22092d-8c9f-4052-8a31-136ec6576a63?wid=167&hei=167&qlt=100&fmt=webp')]")).click();
        driver.findElement(By.xpath("//img[contains(@src,'https://target.scene7.com/is/image/Target/GUEST_e936fa53-3666-4782-9384-bb3527967838?wid=167&hei=167&qlt=100&fmt=webp')]")).click();
        driver.close();
    }
}
