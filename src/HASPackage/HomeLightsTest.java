package HASPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class HomeLightsTest {

	@Test
	public void test() {
		HomeLights test = new HomeLights();
		int result = test.buttons(1);
		assertEquals(0,result);
	}

}
