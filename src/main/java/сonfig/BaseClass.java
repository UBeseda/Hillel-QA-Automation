package сonfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static void createDriver() {
        if (driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
   public static void closeDriver(){
         if (driver!=null) {
             try {
                 Thread.sleep(5000);
             } catch (InterruptedException e){
             throw new RuntimeException(e);
         }
         driver.quit();
             }
             }
         }





