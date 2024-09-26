package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author Maicon Fang
 * @version 1.0
 * 
 */

@CucumberOptions(
	features="src/test/java/features",
	glue ="stepDefinitions",
	monochrome=true, 
	tags ="@LoginTest"
	)

public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
