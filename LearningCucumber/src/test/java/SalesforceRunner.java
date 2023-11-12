import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features = {"src/test/resources/SalesforceLoginFeature.feature"},
                  glue= {"com.cucumber.stepdefintion"})
public class SalesforceRunner extends AbstractTestNGCucumberTests{

}
