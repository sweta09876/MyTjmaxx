/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
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
 * @author Sweta
 */
public class TjmaxxPageTest {
private WebDriver driver;
private String baseUrl;  
public TjmaxxPageTest() {

    }
    @BeforeClass
    public void setUpClass() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    
    }
    @Test
    public void executeNewarrivalModule() throws Exception {
    Newarrival newarrival = PageFactory.initElements(driver, Newarrival.class);
    newarrival.loginToFlighApplication("MEN");
     //driver.close();
    }
    
       
  
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
@Test
    public void hover() throws Exception {
        //   driver = new ChromeDriver();
        driver.manage().window().maximize();
       // implicit wait condition
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // this opens the url
        driver.get("https://www.tjmaxx.tjx.com/store/index.jsp/");
        //Mouse hover// 
        
        //WebElement elem1 = driver.findElement(By.id("//*[usmm-tl-cat240003='NEW ARRIVAL']"));
        //Actions act = new Actions(driver);
        //Action a1 = act.moveToElement(elem1).build();
        //Action a1 = act.moveToElement(elem1).pause(Duration.ofSeconds(5)).doubleClick().build();
        //a1.perform();
//        Thread.sleep(10*1000);
//        //To wait for element visible
//       WebDriverWait wait = new WebDriverWait(driver, (10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MEN")));
//       WebElement elem2 = driver.findElement(By.linkText("clothing"));
//        elem2.click();
         //driver.close();
}
}