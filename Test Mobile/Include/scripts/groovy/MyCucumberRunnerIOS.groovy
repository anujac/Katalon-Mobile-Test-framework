
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features", glue="",tags=["@ios"], plugin = ["pretty",
	"junit:Reports/ios/cucumber.xml",
	"html:Reports/ios",
	"json:Reports/ios/cucumber.json"])
public class MyCucumberRunnerIOS {
}