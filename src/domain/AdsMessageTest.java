package domain;

import java.sql.Timestamp;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AdsMessageTest</code> contains tests for the class <code>{@link AdsMessage}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class AdsMessageTest {
	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAdsMessage_1()
		throws Exception {
		String jedisString = "";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAdsMessage_2()
		throws Exception {
		String jedisString = "";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAdsMessage_3()
		throws Exception {
		String jedisString = "";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAdsMessage_4()
		throws Exception {
		String jedisString = "";

		AdsMessage result = new AdsMessage(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAdsMessage_5()
		throws Exception {
		String binarySentence = "";
		int messageTypeD = 1;
		int originatorD = 1;
		long time = 1L;

		AdsMessage result = new AdsMessage(binarySentence, messageTypeD, originatorD, time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the int getMessageTypeD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetMessageTypeD_1()
		throws Exception {
		AdsMessage fixture = new AdsMessage("", 1, 1, 1L);

		int result = fixture.getMessageTypeD();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
		assertEquals(0, result);
	}

	/**
	 * Run the int getOriginatorD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetOriginatorD_1()
		throws Exception {
		AdsMessage fixture = new AdsMessage("", 1, 1, 1L);

		int result = fixture.getOriginatorD();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
		assertEquals(0, result);
	}

	/**
	 * Run the Timestamp getTimeStamp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetTimeStamp_1()
		throws Exception {
		AdsMessage fixture = new AdsMessage("", 1, 1, 1L);

		Timestamp result = fixture.getTimeStamp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
		assertNotNull(result);
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
		AdsMessage fixture = new AdsMessage("", 1, 1, 1L);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
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
		AdsMessage fixture = new AdsMessage("", 1, 1, 1L);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
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
		AdsMessage fixture = new AdsMessage("", 1, 1, 1L);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -32
		//       at java.lang.String.substring(Unknown Source)
		//       at domain.AdsMessage.<init>(AdsMessage.java:21)
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
		new org.junit.runner.JUnitCore().run(AdsMessageTest.class);
	}
}