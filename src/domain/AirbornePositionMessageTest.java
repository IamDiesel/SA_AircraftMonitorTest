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
		String binarySentence = "1000110101001100101000100101100001011000110000111000010000011001000001011111100101110011110110100111011011001001";
		int messageTypeD = 11;
		int originatorD = 5022296;
		long time = 1432557564600L;
		AirbornePositionMessage fixture = new AirbornePositionMessage(binarySentence, messageTypeD, originatorD, time);
		//binarySentence: positions from 1 to 32 are deleted. the rest is saved in variable binarySentence (from AdsMessage)
		//old and new bin string:
		
		//old: 					 1000110101001100101000100101100001011000110000111000010000011001000001011111100101110011110110100111011011001001
		//new:                                 					 01011000110000111000010000011001000001011111100101110011110110100111011011001001
		//                                             					 1100001P1000
		//pos 9-15 and 17-20 are used for latitude calculation (plus factor) (converted to decimal) factor is at pos 16 (0 means factor = 100, 1 means 25)

		int result = fixture.getAltitude();

		assertEquals(39000, result);
	}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetAltitude_2()
			throws Exception {
			String binarySentence = "1000110101001100101000100101100001011000110000101000010000011001000001011111100101110011110110100111011011001001";
			//In this string factor bit was changed to 0. This should overthrow the plausibility check resulting in a plausibility check (AdsMessageException) error

			

			int messageTypeD = 11;
			int originatorD = 5022296;
			long time = 1432557564600L;
			AirbornePositionMessage fixture = new AirbornePositionMessage(binarySentence, messageTypeD, originatorD, time);

			int result = fixture.getAltitude();

			assertEquals(39000/4, result);
		}

	/**
	 * Run the int getAltitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	



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
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;01011000110000111000010000011001000001011111100101110011110110100111011011001001;1432557564600");
		int result = fixture.getLatitude();
		assertEquals(3202, result);
		//Position 22-39 are binary altitude representation
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
		String latitude = 																			    "11111111111111111";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;0101100011000011100001"+latitude+       "11111100101110011110110100111011011001001;1432557564600");
		
		int result = fixture.getLatitude();

		assertEquals(131071, result);
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
		String longitude = 																			    				 "11111111111111111";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;010110001100001110000100000110010000010"+longitude+      "110110100111011011001001;1432557564600");

		int result = fixture.getLongitude();

		assertEquals(131071,result);
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
		String longitude = 																			    				 "00000000000000000";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;010110001100001110000100000110010000010"+longitude+      "110110100111011011001001;1432557564600");

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
	@Test(expected = exception.AdsMessageException.class)
	public void testGetTimeFlag_1()
		throws Exception {
		AirbornePositionMessage fixture = new AirbornePositionMessage("");

		boolean result = fixture.getTimeFlag();

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
		//timeflag is at position 20. 1...aircraft uses exact UTC timing 0.. not
		String t = 																			    	  "1";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;01011000110000111000"+t+"10000011001000001000000000000000000110110100111011011001001;1432557564600");

		boolean result = fixture.getTimeFlag();
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
	public void testGetTimeFlag_3()
		throws Exception {
		//timeflag is at position 20. 1...aircraft uses exact UTC timing 0.. not
		String t = 																			    	  "0";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;01011000110000111000"+t+"10000011001000001000000000000000000110110100111011011001001;1432557564600");
		
		boolean result = fixture.getTimeFlag();
		assertFalse(result);
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
		String o = 																			    	    "1";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;010110001100001110001"+o+"0000011001000001000000000000000000110110100111011011001001;1432557564600");
		
		boolean result = fixture.isOdd();
		
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
		String o = 																			    	    "0";
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;010110001100001110001"+o+"0000011001000001000000000000000000110110100111011011001001;1432557564600");
		

		boolean result = fixture.isOdd();

		assertFalse(result);
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
		AirbornePositionMessage fixture = new AirbornePositionMessage("11;5022296;01011000110000111000010000011001000001011111100101110011110110100111011011001001;1432557564600");

		String result = fixture.toJedisString();

		assertNotNull(result);
		assertEquals(fixture.toJedisString(),"11;5022296;01011000110000111000010000011001000001011111100101110011110110100111011011001001;1432557564600");
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