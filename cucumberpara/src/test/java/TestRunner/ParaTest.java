package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/Admin.feature",
					glue={"StepDef"},
					plugin= {"pretty"},
					tags= "@AdminDatabaseInitialize or @AdminDatabaseClean")
					
public class ParaTest {


}
