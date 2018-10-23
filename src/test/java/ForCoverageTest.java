
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ForCoverageTest {

	@Test
	void testGet() {

		ForCoverage classUnderTest = new ForCoverage();
		
		final String result = classUnderTest.get();

		assertEquals("TEST", result);
	}

}
