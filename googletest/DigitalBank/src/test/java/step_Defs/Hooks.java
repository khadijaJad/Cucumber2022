package step_Defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.EnvironmentManager;

public class Hooks {
    //this class will contain only before and after annotation that we want to run before and after every class

    @Before//this hould be imported from cucumber.api.java.Before;
    public void setUp() throws Exception {
        ConfigReader.initProperties();//will initialize properties from properties file
        //here you can set up your environment variables
        //we will have environment manager that will store all environment variables and our before hook will  call the environment manager to
        //set up  all the variables correctly depending on the environment we are running our tests against.
        EnvironmentManager.setUpEnvironment();
    }
    @After
    public void tearDown(Scenario scenario){
        //I can attach a screenshot to failing scenario to the report
        try {
            if (scenario.isFailed()) {
                //we will take a screenshot
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                //add screenshot to the report
                scenario.embed(screenshot, "image/png");
            }
        }catch (Exception e){
            System.out.println("Error happened while taking screenshot and cleaning up after the test");//optional
            e.printStackTrace();
        }

        Driver.closeDriver();
    }
}
