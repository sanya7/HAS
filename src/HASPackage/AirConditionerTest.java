package HASPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AirConditionerTest {

	@Test
	public void test() {
		AirConditioner test = new AirConditioner();
		int result = test.buttons(1);
		assertEquals(0,result);
	}

}
