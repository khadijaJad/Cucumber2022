package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {
    WebDriver Driver;
    public static WebDriver loadChromeDriver(){
        WebDriverManager.chromedriver().setup();
        //new chromedriver, it creates default chrome browser
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size=1920,1080");//this is for window size
        if(ConfigReader.getProperties("headless").equalsIgnoreCase("true")){
            options.addArguments("--headless");
        }
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
