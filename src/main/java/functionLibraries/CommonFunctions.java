package functionLibraries;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CommonFunctions {

   public static WebDriver driver;
   public void openBrowser(){
       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       driver=new ChromeDriver(options);
   }
   public void closeBrowser(){
       driver.quit();
   }
   public void waitForTime(int waitTime){

       driver.manage().timeouts().implicitlyWait(waitTime,TimeUnit.SECONDS);
   }
   public void mouseOver(WebElement element)
   {
       Actions actions=new Actions(driver);
       actions.moveToElement(element).build().perform();
   }
}

