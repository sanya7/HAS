package HASPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class WashingMachineTest {

	@Test
	public void test() {
		WashingMachine test = new WashingMachine();
		int result = test.buttons(1);
		assertEquals(0,result);
	}

}
