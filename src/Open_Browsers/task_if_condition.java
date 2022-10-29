package Open_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_if_condition {


    public static void main(String[] args) throws InterruptedException {

        String text = "firefox";

    //1- Declare your new object from WebDriver
	// What's WebDriver? it is an interface that is used to group different browsers types chrome, firefox, Edge, etc

        if(text.contains("chrome"))
        {
    //2- initialize your the object with chrome

        }
        else if(text.contains("firefox"))
        {
    //2- initialize your the object with firefox

        }


    //Note: the following steps should be out of if condition
    //3- Maximize the window
    //4- set implicit wait
    //5- Navigate to WebSite "https://www.selenium.dev/"
    //6- wait for two seconds
    //7- quit the driver


    }

}
