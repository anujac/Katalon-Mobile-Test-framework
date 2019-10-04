 import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features", glue="",tags=["@android"], plugin = ["pretty",
	"junit:Reports/android/cucumber.xml",
	"html:Reports/android",
	"json:Reports/android/cucumber.json"])
public class MyCucumberRunnerAndroid {
}