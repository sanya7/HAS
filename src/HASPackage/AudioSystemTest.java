package HASPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AudioSystemTest {

	@Test
	public void test() {
		AudioSystem test = new AudioSystem();
		int result = test.buttons(1);
		int result1 = test.volumeup(10);
		int result2 = test.volumedown(10);
		assertEquals(0,result);
		assertEquals(11,result1);
		assertEquals(9,result2);
	}

}
