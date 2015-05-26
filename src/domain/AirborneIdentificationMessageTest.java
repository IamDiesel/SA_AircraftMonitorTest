package domain;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>AirborneIdentificationMessageTest</code> contains tests for the class <code>{@link AirborneIdentificationMessage}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AirborneIdentificationMessageTest {
	/**
	 * Run the AirborneIdentificationMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAirborneIdentificationMessage_1()
		throws Exception {
		String binarySentence = "1000111000111111111011101101001100100001000100001101000001000001001111100000100000100000100001101011101110101110";
		//binarySentence in object(substring(32)): 00100001000100001101000001000001001111100000100000100000100001101011101110101110
		int messageTypeD = 4;
		int originatorD = 4189907;
		long time = 1432555987439L;

		AirborneIdentificationMessage result = new AirborneIdentificationMessage(binarySentence, messageTypeD, originatorD, time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:19)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
		assertEquals(4, result.getMessageTypeD());
		assertEquals(4189907, result.getOriginatorD());
		assertEquals("4;4189907;00100001000100001101000001000001001111100000100000100000100001101011101110101110;1432555987439;DMAAO   ", result.toJedisString());
		assertEquals("DMAAO   ",result.getAircraftID());
	}

	/**
	 * Run the String getAircraftID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAircraftID_1()
		throws Exception {
		String binarySentence = "1000111000111111111011101101001100100001000100001101000001000001001111100000100000100000100001101011101110101110";
		//binarySentence in object(substring(32)): 00100001000100001101000001000001001111100000100000100000100001101011101110101110
		int messageTypeD = 4;
		int originatorD = 4189907;
		long time = 1432555987439L;
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage(binarySentence, messageTypeD, originatorD, time);

		String result = fixture.getAircraftID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:19)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
		assertEquals("DMAAO   ",result);
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
		String binarySentence = "1000111000111111111011101101001100100001000100001101000001000001001111100000100000100000100001101011101110101110";
		//binarySentence in object(substring(32)): 00100001000100001101000001000001001111100000100000100000100001101011101110101110
		int messageTypeD = 4;
		int originatorD = 4189907;
		long time = 1432555987439L;
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage(binarySentence, messageTypeD, originatorD, time);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:19)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
		assertEquals("4;4189907;00100001000100001101000001000001001111100000100000100000100001101011101110101110;1432555987439;DMAAO   ", result);
	}

	/**
	 * Run the String toJedisString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testToJedisString_2()
		throws Exception {
		String binarySentence = "1000111000111111111011101101001100100001000100001101000001000001001111100000100000100000100001101011101110101110";
		//binarySentence in object(substring(32)): 00100001000100001101000001000001001111100000100000100000100001101011101110101110
		int messageTypeD = 72;
		int originatorD = 4189907;
		long time = 1432555987439L;
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage(binarySentence, messageTypeD, originatorD, time);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:19)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
		assertNotEquals("4;4189907;00100001000100001101000001000001001111100000100000100000100001101011101110101110;1432555987439;DMAAO   ", result);
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
		String binarySentence = "1000111000111111111011101101001100100001000100001101000001000001001111100000100000100000100001101011101110101110";
		//binarySentence in object(substring(32)): 00100001000100001101000001000001001111100000100000100000100001101011101110101110
		int messageTypeD = 4;
		int originatorD = 4189907;
		long time = 1432555987439L;
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage(binarySentence, messageTypeD, originatorD, time);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:19)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
		String test = "messageTypeD: 4, originatorD: 4189907, time: Montag, 25.05.2015, 14:13:07.439, binarySentence: 00100001000100001101000001000001001111100000100000100000100001101011101110101110, ID: DMAAO   ";
		assertEquals(test,result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testToString_2()
		throws Exception {
		String binarySentence = "1000111000111111111011101101001100100001000100001101000001000001001111100000100000100000100001101011101110101110";
		//binarySentence in object(substring(32)): 00100001000100001101000001000001001111100000100000100000100001101011101110101110
		int messageTypeD = 72;
		int originatorD = 4189907;
		long time = 1432555987439L;
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage(binarySentence, messageTypeD, originatorD, time);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:19)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
		String test = "messageTypeD: 4, originatorD: 4189907, time: Montag, 25.05.2015, 14:13:07.439, binarySentence: 00100001000100001101000001000001001111100000100000100000100001101011101110101110, ID: DMAAO   ";
		assertNotEquals(test,result);
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
		new org.junit.runner.JUnitCore().run(AirborneIdentificationMessageTest.class);
	}
}