/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author olegd
 */
public class RingTest {
    private WebDriver driver;
    private String baseUrl;
    public RingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    @Test
  public void testRing() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.macys.com/");
    driver.findElement(By.id("globalSearchInputField")).click();
    driver.findElement(By.id("globalSearchInputField")).clear();
    driver.findElement(By.id("globalSearchInputField")).sendKeys("ring");
    driver.findElement(By.name("keywordSearch")).submit();
    driver.findElement(By.id("img_7169369")).click();
    driver.findElement(By.id("bag-add-7169369")).click();
       assertEquals(driver.findElement(By.xpath("//div[@id='mainCont']/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/div/h1/div")).getText(), "Women's 311 Shaping Skinny Jeans");
    } catch (Error e) {
        System.out.println(e.toString());
    }
  }

