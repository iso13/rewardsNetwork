package org.david.code.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.david.code.utils.CucumberLog;
import org.junit.Before;


public class Hooks {

	@Before
	public void startUp(Scenario scenario){
		CucumberLog.info("# # # # # # # # Started Scenario : " + scenario.getName() + "# # # # # # # # ");
	}

	@After
	public void tearDown(Scenario scenario){
		CucumberLog.info("# # # # # # # # Ended Scenario : " + scenario.getName() + "# # # # # # # # ");
	}

}
