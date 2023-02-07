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
public class WomenCategoryTest {
      private WebDriver driver;
  private String baseUrl;
    public WomenCategoryTest() {
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
  public void testWomanCaterogyTets() throws Exception {
    driver.get("https://www.costco.com/");
    driver.findElement(By.linkText("Clothing, Luggage & Handbags")).click();
    driver.findElement(By.linkText("Clothing for Women")).click();
    driver.findElement(By.xpath("//div[@id='category-name-header']/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='category-name-header']/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='category-name-header']/h1")).getText(), "Clothing for Women");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//img[contains(@src,'https://mobilecontent.costco.com/live/resource/img/static-us-tiles/womens-outerwear.jpg')]")).click();
    driver.close();
  }
}
  

