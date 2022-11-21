/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author Sweta
 */
public class Newarrival {
WebDriver driver;

   public Newarrival(WebDriver driver) {
        this.driver = driver;

}
//   public void hover() throws Exception {
//        //   driver = new ChromeDriver();
//        driver.manage().window().maximize();
//       // implicit wait condition
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        // this opens the url
//        driver.get("https://www.tjmaxx.tjx.com/store/index.jsp/");
//        //Mouse hover// 
//        
//        WebElement elem1 = driver.findElement(By.id("//*[usmm-tl-cat240003='']"));
//        Actions act = new Actions(driver);
//        //Action a1 = act.moveToElement(elem1).build();
//        Action a1 = act.moveToElement(elem1).pause(Duration.ofSeconds(5)).doubleClick().build();
//        a1.perform();
//        Thread.sleep(10*1000);
//        //To wait for element visible
//       WebDriverWait wait = new WebDriverWait(driver, (10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MEN")));
//       WebElement elem2 = driver.findElement(By.linkText("clothing"));
//        elem2.click();
//  }
   @FindBy(xpath = ".//*[@newarrival='MEN']")
    private WebElement newarrival;

   // @FindBy(xpath = ".//*[@name='submit']")
    //private WebElement submitBtn;

    public void loginToFlighApplication(String men)
            throws Exception {
        try {
            driver.get("https://tjmaxx.tjx.com/");
            newarrival.sendKeys(men);
           
         //   submitBtn.click();
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    } 
   
   

}
