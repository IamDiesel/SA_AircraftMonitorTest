package domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AirbornePositionMessageTest</code> contains tests for the class <code>{@link AirbornePositionMessage}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AirbornePositionMessageTest {
	/**
	 * Run the AirbornePositionMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAirbornePositionMessage_1()
		throws Exception {
		String jedisString = "11;5022296;01011000110000111000010000011001000001011111100101110011110110100111011011001001;1432557564600";

		AirbornePositionMessage result = new AirbornePositionMessage(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertNotNull(result);
		assertEquals(11,result.getMessageTypeD());
		assertEquals(5022296,result.getOriginatorD());
		assertEquals("11;5022296;01011000110000111000010000011001000001011111100101110011110110100111011011001001;1432557564600",result.toJedisString());
		assertEquals(true,result.isOdd());
		assertEquals(3202,result.getLatitude());
		assertEquals(129395,result.getLongitude());
	}

	/**
	 * Run the AirbornePositionMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAirbornePositionMessage_2()
		throws Exception {
		String binarySentence = "1000110101001100101000100101100001011000110000111000010000011001000001011111100101110011110110100111011011001001";
		//binarySentence in object(substring(32)): 01011000110000111000010000011001000001011111100101110011110110100111011011001001
		int messageTypeD = 11;
		int originatorD = 5022296;
		long time = 1432557564600L;
		AirbornePositionMessage result = new AirbornePositionMessage(binarySentence, messageTypeD, originatorD, time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:10)
		assertNotNull(result);
		assertEquals(11,result.getMessageTypeD());
		assertEquals(5022296,result.getOriginatorD());
		assertEquals("11;5022296;01011000110000111000010000011001000001011111100101110011110110100111011011001001;1432557564600",result.toJedisString());
		assertEquals(true,result.isOdd());
		assertEquals(3202,result.getLatitude());
		assertEquals(129395,result.getLongitude());
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAltitude_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAltitude_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAltitude_3()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAltitude_4()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAltitude_5()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getAltitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetLatitude_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLatitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetLatitude_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLatitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLongitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetLongitude_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLongitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLongitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetLongitude_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		int result = fixture.getLongitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getTimeFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetTimeFlag_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.getTimeFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getTimeFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetTimeFlag_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.getTimeFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testIsOdd_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.isOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testIsOdd_2()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.isOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the String toJedisString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testToJedisString_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirbornePositionMessage.toString(AirbornePositionMessage.java:53)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:33)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:14)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
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
	 * @generatedBy CodePro at 25.05.15 12:07
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
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AirbornePositionMessageTest.class);
	}
}