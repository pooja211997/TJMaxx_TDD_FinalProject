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
import org.openqa.selenium.support.ui.Select;
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
public class StoreLocatorByCity {
    private WebDriver driver;
    
    public StoreLocatorByCity() {
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
    public void testStoreLocatorByCityAndStateTestCase() throws Exception {
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");
        WebDriverWait wait=new WebDriverWait(driver, 20);  //20 sec
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Stores")));
        driver.findElement(By.linkText("Stores")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        WebDriverWait wait1=new WebDriverWait(driver, 20);  //20 sec
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("store-location-city")));
        driver.findElement(By.id("store-location-city")).click();
        driver.findElement(By.id("store-location-city")).clear();
        driver.findElement(By.id("store-location-city")).sendKeys("Hoffman Estates");
        driver.findElement(By.xpath("//form[@id='findStoresForm']/div[3]/div/div/span")).click();
        driver.findElement(By.id("store-location-state")).click();
        new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Illinois");
        Thread.sleep(2000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        FileUtils.copyFile(scrFile, new File("./locateStoreByCityAndState.png"));
        driver.findElement(By.name("submit")).click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
    }
}
