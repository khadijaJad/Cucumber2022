package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class FirefoxWebDriver {
    public static WebDriver loadFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options=new FirefoxOptions();
        if(ConfigReader.getProperties("headless").equalsIgnoreCase("true")) {
            options.setHeadless(true);
        }
        WebDriver driver=new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        return driver;
    }}

