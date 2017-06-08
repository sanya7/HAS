package HASPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AirConditionerTest.class, AudioSystemTest.class, HomeLightsTest.class, TVTest.class,
		WashingMachineTest.class })
public class AllTests {

}
