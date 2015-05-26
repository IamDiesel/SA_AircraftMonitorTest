package domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AirborneIdentificationMessageTest</code> contains tests for the class <code>{@link AirborneIdentificationMessage}</code>.
 *
 * @generatedBy CodePro at 24.05.15 21:19
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AirborneIdentificationMessageTest {
	/**
	 * Run the AirborneIdentificationMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testAirborneIdentificationMessage_1()
		throws Exception {
		String binarySentence = "";
		int messageTypeD = 1;
		int originator = 1;
		long time = 1L;

		AirborneIdentificationMessage result = new AirborneIdentificationMessage(binarySentence, messageTypeD, originator, time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
	}

	/**
	 * Run the String getAircraftID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testGetAircraftID_1()
		throws Exception {
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		String result = fixture.getAircraftID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testPrint_1()
		throws Exception {
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testPrint_2()
		throws Exception {
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
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
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
	}

	/**
	 * Run the String toJedisString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testToJedisString_2()
		throws Exception {
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
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
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testToString_2()
		throws Exception {
		AirborneIdentificationMessage fixture = new AirborneIdentificationMessage("", 1, 1, 1L);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at domain.AirborneIdentificationMessage.getAircraftID(AirborneIdentificationMessage.java:15)
		//       at domain.AirborneIdentificationMessage.toString(AirborneIdentificationMessage.java:24)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneIdentificationMessage.<init>(AirborneIdentificationMessage.java:11)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AirborneIdentificationMessageTest.class);
	}
}