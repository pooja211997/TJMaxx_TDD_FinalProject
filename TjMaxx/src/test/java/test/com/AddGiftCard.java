/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.junit.Assert;
import org.openqa.selenium.By;
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
public class AddGiftCard {
    private WebDriver driver;
    
    public AddGiftCard() {
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
    public void testAddGiftCardTestCase() throws Exception {
      driver.get("https://tjmaxx.cashstar.com/");
      WebDriverWait wait=new WebDriverWait(driver, 20);  //20 sec
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipientName-input")));
      driver.findElement(By.id("recipientName-input")).click();
      driver.findElement(By.id("recipientName-input")).clear();
      driver.findElement(By.id("recipientName-input")).sendKeys("Stella");
      driver.findElement(By.id("senderName-input")).click();
      driver.findElement(By.id("senderName-input")).clear();
      driver.findElement(By.id("senderName-input")).sendKeys("Pooja");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@id='app-root']/div/main/div/form/div/button/span")).click();
      WebDriverWait wait1=new WebDriverWait(driver, 20);  //20 sec
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      WebDriverWait wait2=new WebDriverWait(driver, 20);  //20 sec
      wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount-0")));
      driver.findElement(By.id("amount-0")).click();
      driver.findElement(By.xpath("//div[@id='app-root']/div/main/div/form/div/button/span")).click();
      WebDriverWait wait3=new WebDriverWait(driver, 20);  //20 sec
      wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("message-input")));
      driver.findElement(By.id("message-input")).click();
      driver.findElement(By.id("message-input")).clear();
      driver.findElement(By.id("message-input")).sendKeys("Happy Birthday !");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@id='app-root']/div/main/div/form/div/button/span")).click();
      WebDriverWait wait4=new WebDriverWait(driver, 20);  //20 sec
      wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipientEmail-input")));
      driver.findElement(By.id("recipientEmail-input")).click();
      driver.findElement(By.id("recipientEmail-input")).clear();
      driver.findElement(By.id("recipientEmail-input")).sendKeys("stella@gmail.com");
      driver.findElement(By.id("recipientEmailConfirmation-input")).click();
      driver.findElement(By.id("recipientEmailConfirmation-input")).clear();
      driver.findElement(By.id("recipientEmailConfirmation-input")).sendKeys("stella@gmail.com");
      Thread.sleep(1000);
      WebDriverWait wait5=new WebDriverWait(driver, 20);  //20 sec
      wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      WebDriverWait wait6=new WebDriverWait(driver, 20);  //20 sec
      wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='app-root']/div/main/div[4]/div/button")));
      driver.findElement(By.xpath("//div[@id='app-root']/div/main/div[4]/div/button")).click();
      Thread.sleep(2000);
    }
}
