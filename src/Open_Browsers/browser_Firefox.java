package Open_Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class browser_Firefox {


    public static void main(String[] args) throws InterruptedException {
// 0- you should download relative geckodriver first and define its path on your PC

// 1- Define the bridge between the browser and the code
// Note: there is another better way to define the executable path, which will be discussed after Maven
  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");

   // 2- Create new object from firefox driver 
  FirefoxDriver driver = new FirefoxDriver();

   // 3- Configure your driver
   
  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
 driver.manage().window().maximize();

// 4- Navigate to the website
 driver.navigate().to("https://www.selenium.dev/");

 Thread.sleep(2000);

 driver.quit();


    }
}
