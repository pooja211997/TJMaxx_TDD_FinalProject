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
import org.testng.Assert;
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
public class SearchByCategory {
    private WebDriver driver;
    public SearchByCategory() {
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
    public void testSearchByCategoryTestCase() throws Exception {
      driver.get("https://tjmaxx.tjx.com/store/index.jsp");
      WebDriverWait wait=new WebDriverWait(driver, 60);  //60 sec
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usmm-tl-cat260062")));
      driver.findElement(By.id("usmm-tl-cat260062")).click();
      driver.get("https://tjmaxx.tjx.com/store/shop/women/_/N-2107733895?tn=2");
      driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[5]/a")).click();
      driver.get("https://tjmaxx.tjx.com/store/shop/womens-beauty/_/N-3242054037?ln=5:1");
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("window.scrollBy(0,400)", "");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@id='style-1000844343']/div/div/a/img[2]")).click();
      driver.get("https://tjmaxx.tjx.com/store/jump/product/women-beauty/Made-In-France-1oz-Serum/1000844343?colorId=NS1020558&pos=1:1&N=3242054037");
      WebDriverWait wait1=new WebDriverWait(driver, 60);  //60 sec
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("addItemToOrder")));
      driver.findElement(By.id("addItemToOrder")).click();
      WebDriverWait wait2=new WebDriverWait(driver, 60);  //60 sec
      wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("KEEP SHOPPING")));
      driver.findElement(By.linkText("KEEP SHOPPING")).click();
      WebDriverWait wait3=new WebDriverWait(driver, 60);  //60 sec
      wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("usmm-tl-cat260062")));
      driver.findElement(By.id("usmm-tl-cat260062")).click();
      driver.get("https://tjmaxx.tjx.com/store/shop/women/_/N-2107733895?tn=2");   
      driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[6]/a")).click();
      driver.get("https://tjmaxx.tjx.com/store/shop/womens-handbags/_/N-522081314?ln=6:1");
      JavascriptExecutor js2 = (JavascriptExecutor) driver;
      js2.executeScript("window.scrollBy(0,400)", "");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@id='style-1000892298']/div/div/a/img[2]")).click();
      driver.get("https://tjmaxx.tjx.com/store/jump/product/women-handbags/Made-In-Italy-Suede-Large-Convertible-Belt-Bag/1000892298?colorId=NS16367084&pos=1:1&N=522081314");
      WebDriverWait wait4=new WebDriverWait(driver, 60);  //60 sec
      wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("addItemToOrder")));
      driver.findElement(By.id("addItemToOrder")).click();
      WebDriverWait wait5=new WebDriverWait(driver, 60);  //60 sec
      wait5.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("KEEP SHOPPING")));
      driver.findElement(By.linkText("KEEP SHOPPING")).click();
      WebDriverWait wait6=new WebDriverWait(driver, 60);  //60 sec
      wait6.until(ExpectedConditions.visibilityOfElementLocated(By.id("usmm-tl-cat3620015p")));
      driver.findElement(By.id("usmm-tl-cat3620015p")).click();
      driver.get("https://tjmaxx.tjx.com/store/shop/kids-baby/_/N-3285712293?tn=5");
      WebDriverWait wait7=new WebDriverWait(driver, 60);  //60 sec
      wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"endeca-main\"]/div[2]/div/div[2]/ul/li[6]/a")));
      driver.findElement(By.xpath("//*[@id=\"endeca-main\"]/div[2]/div/div[2]/ul/li[6]/a")).click();
      driver.get("https://tjmaxx.tjx.com/store/shop/kids-baby-toys-books/_/N-121228901?ln=6:1");
      JavascriptExecutor js3 = (JavascriptExecutor) driver;
      js3.executeScript("window.scrollBy(0,400)", "");
      Thread.sleep(1000);
      WebDriverWait wait8=new WebDriverWait(driver, 60);  //60 sec
      wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Seaside Sidekicks Sand Cookie Set']")));
      driver.findElement(By.xpath("//img[@alt='Seaside Sidekicks Sand Cookie Set']")).click();
      driver.get("https://tjmaxx.tjx.com/store/jump/product/kids-baby-toys-books/Seaside-Sidekicks-Sand-Cookie-Set/1000837807?colorId=NS1003538&pos=1:1&N=121228901");
      WebDriverWait wait9=new WebDriverWait(driver, 60);  //60 sec
      wait9.until(ExpectedConditions.visibilityOfElementLocated(By.id("addItemToOrder")));
      driver.findElement(By.id("addItemToOrder")).click();
      WebDriverWait wait10=new WebDriverWait(driver, 60);  //60 sec
      wait10.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW BAG")));
      driver.findElement(By.linkText("VIEW BAG")).click();
      driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
      JavascriptExecutor js4 = (JavascriptExecutor) driver;
      js4.executeScript("window.scrollBy(0,200)", "");
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
      FileUtils.copyFile(scrFile, new File("./searchByCategory.png"));
      Thread.sleep(2000);
    }
}
