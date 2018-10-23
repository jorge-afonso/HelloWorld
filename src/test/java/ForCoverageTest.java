
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ForCoverageTest {

	@Test
	void testGet() {

		ForCoverage classUnderTest = new ForCoverage();
		
		final String result = classUnderTest.get();

		assertEquals("TEST", result);
	}

	@Test
	void testOtherGet() {

		ForCoverage classUnderTest = new ForCoverage();
		
		final String result = classUnderTest.otherGet();

		assertEquals("OTHER_TEST", result);
	}

	@Test
	void testAnotherGet() {

		ForCoverage classUnderTest = new ForCoverage();
		
		final String result = classUnderTest.anotherGet();

		assertEquals("ANOTHER_TEST", result);
	}

}
