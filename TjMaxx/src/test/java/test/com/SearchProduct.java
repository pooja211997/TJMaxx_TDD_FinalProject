/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author phalk
 */
public class SearchProduct {
    private WebDriver driver;
    
    public SearchProduct() {
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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-extensions");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    @Test
    public void testSearchProductTestCase() throws Exception {
      driver.get("https://tjmaxx.tjx.com/store/index.jsp");
      driver.findElement(By.id("search-text-input")).click();
      driver.findElement(By.id("search-text-input")).sendKeys("white tables");
      driver.findElement(By.id("search-submit-button")).click();
      //driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=white+tables&qfh_sch=Search");
      driver.findElement(By.xpath("//div[@id='style-1000896677']/div/div/a/img[2]")).click();
      //driver.get("https://tjmaxx.tjx.com/store/jump/product/51in-Orbina-Pine-Wood-Textured-Coffee-Table/1000896677?colorId=NS1003608&pos=1:1&Ntt=white%20tables&bsp=1");
      driver.findElement(By.id("addItemToOrder")).click();
      WebDriverWait wait=new WebDriverWait(driver, 20);  //20 sec
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal-close")));
      driver.findElement(By.id("modal-close")).click();
      driver.findElement(By.id("search-text-input")).click();
      driver.findElement(By.id("search-text-input")).sendKeys("Rose Riche Eau De Perfume");
      //Thread.sleep(1000);
      driver.findElement(By.id("search-submit-button")).click();
      //driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=Rose+Riche+Eau+De+Perfume&qfh_sch=Search");
      driver.findElement(By.xpath("//img[@alt='1oz Rose Riche Eau De Parfum']")).click();
      //driver.get("https://tjmaxx.tjx.com/store/jump/product/1oz-Rose-Riche-Eau-De-Parfum/1000847008?colorId=NS1003538&pos=1:1&Ntt=Rose%20Riche%20Eau%20De%20Perfume");
      driver.findElement(By.id("addItemToOrder")).click();
      WebDriverWait wait1=new WebDriverWait(driver, 20);  //20 sec
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW BAG")));
      driver.findElement(By.linkText("VIEW BAG")).click();
      driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("window.scrollBy(0,200)", "");
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
      FileUtils.copyFile(scrFile, new File("./myBag.png"));
      Thread.sleep(2000);
    }
}
