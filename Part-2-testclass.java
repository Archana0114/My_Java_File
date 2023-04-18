package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testDivide() {
		SimpleMath sm = new SimpleMath();
		assertEquals(2.0, sm.divide(4, 2), 0.0);
		assertEquals(0.0, sm.divide(0, 4), 0.0);
		assertEquals(-3.0, sm.divide(-6, 2), 0.0);
	}
}
