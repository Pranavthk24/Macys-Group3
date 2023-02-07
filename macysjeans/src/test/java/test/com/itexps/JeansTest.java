/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.devtools.v105.browser.Browser.close;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author olegd
 */
public class JeansTest {
    private WebDriver driver;
    private String baseUrl;
    public JeansTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    @Test
  public void testJeans() throws Exception {
    driver.get("https://www.macys.com/");
    driver.findElement(By.id("globalSearchInputField")).click();
    driver.findElement(By.id("globalSearchInputField")).click();
    driver.findElement(By.id("globalSearchInputField")).clear();
    driver.findElement(By.id("globalSearchInputField")).sendKeys("levis jeans");
    driver.findElement(By.name("keywordSearch")).submit();
    driver.findElement(By.id("img_2286442")).click();
    driver.findElement(By.xpath("//img[@alt='Lapis Topic']")).click();
    driver.findElement(By.xpath("//div[@id='mainCont']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div/div/div[4]/div/div[2]/div/ul/li[3]/span")).click();
    driver.findElement(By.xpath("//div[@id='mainCont']/div[2]/div[2]/div/div/div/div/div[2]/div/div/div")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='mainCont']/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/div/h1/div | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='mainCont']/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/div/h1/div")).getText(), "Women's 311 Shaping Skinny Jeans");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.id("bag-add-2286442")).click();
  
  }

}
