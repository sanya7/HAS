package HASPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TVTest {

	@Test
	public void test() {
		TV test = new TV();
		int result = test.buttons(1);
		int result1 = test.volumeup(10);
		int result2 = test.volumedown(10);
		int result3 = test.channelup(5);
		int result4 = test.channeldown(5);
		assertEquals(0,result);
		assertEquals(11,result1);
		assertEquals(9,result2);
		assertEquals(6,result3);
		assertEquals(4,result4);
	}

}
