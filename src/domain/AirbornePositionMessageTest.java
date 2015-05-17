package domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AirbornePositionMessageTest</code> contains tests for the class <code>{@link AirbornePositionMessage}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class AirbornePositionMessageTest {
	/**
	 * Run the AirbornePositionMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAirbornePositionMessage_1()
		throws Exception {
		String jedisString = "";

		AirbornePositionMessage result = new AirbornePositionMessage(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the AirbornePositionMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAirbornePositionMessage_2()
		throws Exception {
		String binarySentence = "";
		int messageTypeD = 1;
		int originatorD = 1;
		long time = 1L;

		AirbornePositionMessage result = new AirbornePositionMessage(binarySentence, messageTypeD, originatorD, time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:8)
		assertNotNull(result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetAltitude_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetAltitude_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetAltitude_3()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetAltitude_4()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetAltitude_5()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetLatitude_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLatitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetLatitude_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLatitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLongitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetLongitude_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLongitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLongitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetLongitude_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLongitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getTimeFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetTimeFlag_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.getTimeFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertTrue(result);
	}

	/**
	 * Run the boolean getTimeFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetTimeFlag_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.getTimeFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testIsOdd_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.isOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testIsOdd_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.isOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertTrue(result);
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the String toJedisString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testToJedisString_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AirbornePositionMessageTest.class);
	}
}