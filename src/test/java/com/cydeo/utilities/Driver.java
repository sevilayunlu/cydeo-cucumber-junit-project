package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor to remove access to this object

    private Driver(){}
    /*
    We make the WebDriver private, because we want to close ACCESS FROM OUTSIDE THE CLASS.
    We are making it static, because we will use it in a static method
    */

   // private static WebDriver driver;
    private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();

    public static WebDriver getDriver(){

        /*
        Create a reusable utility method which will return the same driver instance once we call it.
        -If an instance doesn't exist, it will create first, and then it will always return same instance
        */

        if(driverPool.get()==null){//Singleton pattern:The pattern is useful when exactly one object is needed to coordinate actions across a system.
            /*
            We will read our browser type from configuration properties file. This way, we can control which browser is opened from outside our code.

          */
            /* to be able to do parallel testing we need more than one driver, and we can achieve that thanks to InheritableThreadLocal



            Depending on the browserType returned from the configuration.properties switch statement will determine the "case", and open the matching browser.
             */
            String browserType= ConfigurationReader.getProperty("browser");
            switch(browserType){

                case "chrome":
                   // WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                   // WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }
        }

        return driverPool.get();
    }

    public static void closeDriver(){

        if(driverPool.get()!=null){//This line will terminate the currently existing driver completely.It will be non-Existing
            driverPool.get().quit();
            //We assign the value back to null so that Singleton can create a newer one if needed.
        driverPool.remove();
        }



    }



}
