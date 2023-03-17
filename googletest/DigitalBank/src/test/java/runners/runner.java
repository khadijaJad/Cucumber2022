package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//(CucumberOptions) this is used to set up runner class configs like which feature file should be scanned
//where to look for step defs
@CucumberOptions(

        //  plugin = {"json:target/JsonFileCucumber2022.json"},//generating junit report in json format
        plugin={"html:target/default-cucumber-reports"},
        format={"pretty","html:target/reports"},//generating html cucumber report  from json file
        features= {"classpath:features"},
        glue ={"step_Defs"},
        //tags={"@db "} ,
        dryRun = false
        //generate step defs, it true=ignore
)

public class runner {
}
