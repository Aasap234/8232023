package suggestioncount;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Collabera\\cucumbertest\\testing\\src\\test\\java\\WebsiteShopping\\onlinetest.feature",
		glue={"WebsiteShopping"},
		tags = "@tag2",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		//tags = {'@Regression'}
		
		)

public class suggestioncountrunner {

}
