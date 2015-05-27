package domain;

import java.sql.Timestamp;
import org.junit.*;
import static org.junit.Assert.*;
import exception.AdsMessageException;

/**
 * The class <code>AdsMessageTest</code> contains tests for the class <code>{@link AdsMessage}</code>.
 *
 * @generatedBy CodePro at 24.05.15 21:19
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AdsMessageTest {
	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testAdsMessage_1()
		throws Exception {
		String jedisString = null;

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testAdsMessage_2()
		throws Exception {
		String jedisString = "19;4901205;10011001010000001001101100110101111000000101000000011010010011101000001011100110";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testAdsMessage_3()
		throws Exception {
		String jedisString = "19;4901205;1431508173375";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testAdsMessage_4()
		throws Exception {
		String jedisString = "19;10011001010000001001101100110101111000000101000000011010010011101000001011100110;1431508173375";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testAdsMessage_5()
		throws Exception {
		String jedisString = "4901205;10011001010000001001101100110101111000000101000000011010010011101000001011100110;1431508173375";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testAdsMessage_6()
		throws Exception {
		String jedisString = "19;4901205;1431508173375;10011001010000001001101100110101111000000101000000011010010011101000001011100110";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = java.lang.AssertionError.class)
	public void testAdsMessage_7()
		throws Exception {
		String jedisString = "4901205;19;10011001010000001001101100110101111000000101000000011010010011101000001011100110;1431508173375";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the AdsMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testAdsMessage_8()
		throws Exception {
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AdsMessage result = new AdsMessage(binarySentence, messageTypeD, originatorD, time);

		// add additional test code here
		assertNotNull(result);
		assertEquals(19, result.getMessageTypeD());
		assertEquals(4901205, result.getOriginatorD());
		assertEquals("19;4901205;10011001010000001001101100110101111000000101000000011010010011101000001011100110;1431508173375", result.toJedisString());
	}

	/**
	 * Run the AdsMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testAdsMessage_9()
		throws Exception {
		String binarySentence = "00110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		AdsMessage result = null;
		
		result = new AdsMessage(binarySentence, messageTypeD, originatorD, time);
		
		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the int getMessageTypeD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testGetMessageTypeD_1()
		throws Exception {
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		AdsMessage fixture = new AdsMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getMessageTypeD();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No0: Binary Sentece too short (binarySentence size =0.
		//       Message Content: --Begin--
		//       domain.AdsMessage@1bd4dd3b, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		assertEquals(19, result);
	}

	/**
	 * Run the int getOriginatorD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testGetOriginatorD_1()
		throws Exception {
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		AdsMessage fixture = new AdsMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getOriginatorD();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No0: Binary Sentece too short (binarySentence size =0.
		//       Message Content: --Begin--
		//       domain.AdsMessage@ca85335, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		assertEquals(4901205, result);
	}

	/**
	 * Run the Timestamp getTimeStamp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testGetTimeStamp_1()
		throws Exception {
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		AdsMessage fixture = new AdsMessage(binarySentence, messageTypeD, originatorD, time);

		Timestamp result = fixture.getTimeStamp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No0: Binary Sentece too short (binarySentence size =0.
		//       Message Content: --Begin--
		//       domain.AdsMessage@cb1c8ab, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		assertNotNull(result);
		assertEquals("2015-05-13 11:09:33.375",result.toString());
		assertEquals(1431508173375L,result.getTime());
	}

	/**
	 * Run the String toJedisString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testToJedisString_1()
		throws Exception {
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		AdsMessage fixture = new AdsMessage(binarySentence, messageTypeD, originatorD, time);


		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No0: Binary Sentece too short (binarySentence size =0.
		//       Message Content: --Begin--
		//       domain.AdsMessage@2ac7dc47, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		assertEquals("19;4901205;10011001010000001001101100110101111000000101000000011010010011101000001011100110;1431508173375",result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testToString_1()
		throws Exception {
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		AdsMessage fixture = new AdsMessage(binarySentence, messageTypeD, originatorD, time);


		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No0: Binary Sentece too short (binarySentence size =0.
		//       Message Content: --Begin--
		//       domain.AdsMessage@3d343705, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		assertNotNull(result);
		String test = "messageTypeD: 19, originatorD: 4901205, time: Mittwoch, 13.05.2015, 11:09:33.375, binarySentence: 10011001010000001001101100110101111000000101000000011010010011101000001011100110";
		assertEquals(test,result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
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
	 * @generatedBy CodePro at 24.05.15 21:19
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
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AdsMessageTest.class);
	}
}