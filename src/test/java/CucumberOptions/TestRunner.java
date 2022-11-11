package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/FeatureFiles",
 // features="src/test/java/FeatureFiles/background.feature",  //package name
  glue="StepDefinations" , //package name  
  //dryRun = true
 monochrome=true,
  tags="@Smoke"  //THis same tag name use in feature file (above the scenario which you want to execute)
 // tags="@SmokeTest or @Regression" //give tags in feature file too  //with 'or' operator
 // tags = "@SmokeTest and @Regression"  //with 'and' operator
// plugin = { "pretty", "html:target/cucumber-reports1" }
  )
public class TestRunner {

}

//https://stackoverflow.com/questions/36787461/how-to-run-multiple-tags-from-testrunner-class-file-in-cucumber-framework-using

//https://www.toolsqa.com/selenium-cucumber-framework/cucumber-reports/
