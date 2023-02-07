/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author olegd
 */
public class SneakersTest {
    
     private WebDriver driver;
  private String baseUrl;
    public SneakersTest() {
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
   @Test
  public void testSneackers() throws Exception {
    driver.get("https://www.macys.com/");
    driver.findElement(By.id("globalSearchInputField")).click();
    driver.get("https://go.lnk7a3.com/link/r?u=https%3A%2F%2Fwww.macys.com&campaign_id=DQEEDQkBBw0BDAkMBAsGDw");
    driver.get("https://www.macys.com/?ranMID=3184&ranEAID=HwnlokaVMX8&ranClickid=srDdPzuobQv0qdgMFFz7vw&ranSiteID=HwnlokaVMX8-srDdPzuobQv0qdgMFFz7vw&rcid=t7hqLZ9nRuiYF9ogAzUxYc&LinkshareID=HwnlokaVMX8-srDdPzuobQv0qdgMFFz7vw&m_sc=aff&PartnerID=LINKSHARE&cm_mmc=LINKSHARE-_-5-_-63-_-MP563&LSNSUBSITE=Omitted_HwnlokaVMX8");
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.macys.com/");
    driver.findElement(By.id("globalSearchInputField")).click();
    driver.findElement(By.xpath("//ul[@id='autosuggest']/div/li/a/div")).click();
  }

}
