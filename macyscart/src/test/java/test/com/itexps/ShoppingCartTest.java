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
public class ShoppingCartTest {
  private WebDriver driver;
  private String baseUrl;
    public ShoppingCartTest() {
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
    driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
    
 @Test
  public void ShoppingCartTest() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.costco.com/");
    driver.findElement(By.xpath("//img[@alt='Ends Tomorrow! Spend $1,500 or More, Get $250 OFF at checkout on Select Jewelry. Online-only, Valid 1/25 - 2/8/23. Limit 1 redemption per membership, While Supplies Last.']")).click();
    driver.findElement(By.xpath("//img[@alt='14kt Yellow Gold Love Knot Earrings']")).click();
    driver.findElement(By.id("add-to-cart-btn")).click();
    driver.findElement(By.xpath("//div[@id='costcoModalText']/div[2]/div[2]/a/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("shopCartCheckoutSubmitButton")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_537/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=fromCheckout%3Dtrue%26orderId%3D1108642587%26itemMessage%3D4.0%26URL%3D%5BSSO%5DCheckOutCmd%5BSSO%5D%26quickPurchase%3Dfalse&nonce=exqVSmH6P5g5IiyG&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.close();
  }

  }

  
