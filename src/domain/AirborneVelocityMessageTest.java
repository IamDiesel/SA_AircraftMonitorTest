package domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AirborneVelocityMessageTest</code> contains tests for the class <code>{@link AirborneVelocityMessage}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AirborneVelocityMessageTest {
	/**
	 * Run the AirborneVelocityMessage(String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAirborneVelocityMessage_1()
		throws Exception {
		String binarySentence = "";
		int messageTypeD = 1;
		int originatorD = 1;
		long time = 1L;

		AirborneVelocityMessage result = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertNotNull(result);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getAirspeed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getAirspeed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getAirspeed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_4()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getAirspeed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_5()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getAirspeed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the int getDeltaBaroAltoAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetDeltaBaroAltoAttitude_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getDeltaBaroAltoAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getDeltaBaroAltoAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetDeltaBaroAltoAttitude_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getDeltaBaroAltoAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getDeltaBaroAltoAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetDeltaBaroAltoAttitude_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getDeltaBaroAltoAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getDeltaBaroAltoAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetDeltaBaroAltoAttitude_4()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getDeltaBaroAltoAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getEastWestVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetEastWestVelocity_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getEastWestVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getEastWestVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetEastWestVelocity_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getEastWestVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getEastWestVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetEastWestVelocity_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getEastWestVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getGeoGreaterBaroAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetGeoGreaterBaroAttitude_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getGeoGreaterBaroAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetGeoGreaterBaroAttitude_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getGeoGreaterBaroAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetGeoGreaterBaroAttitude_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getGeoGreaterBaroAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetGeoGreaterBaroAttitude_4()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getHeadingDegrees();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getHeadingDegrees();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getHeadingDegrees();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_4()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getHeadingDegrees();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_5()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getHeadingDegrees();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_6()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getHeadingDegrees();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the boolean getHeadingStatusAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingStatusAvailable_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getHeadingStatusAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getHeadingStatusAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingStatusAvailable_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getHeadingStatusAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the int getMessageSubType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMessageSubType_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getMessageSubType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMessageSubType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMessageSubType_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getMessageSubType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getMovingEast() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingEast_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingEast();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingEast() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingEast_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingEast();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingEast() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingEast_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingEast();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingSouth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingSouth_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingSouth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingSouth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingSouth_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingSouth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingSouth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingSouth_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingSouth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingWest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingWest_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingWest();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingWest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingWest_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingWest();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getMovingWest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingWest_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getMovingWest();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_4()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_5()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_6()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_7()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		double result = fixture.getNavigationAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the int getNorthSouthVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNorthSouthVelocity_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getNorthSouthVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNorthSouthVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNorthSouthVelocity_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getNorthSouthVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNorthSouthVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNorthSouthVelocity_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getNorthSouthVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getTrueAirspeedType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetTrueAirspeedType_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getTrueAirspeedType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean getTrueAirspeedType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetTrueAirspeedType_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		boolean result = fixture.getTrueAirspeedType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertTrue(result);
	}

	/**
	 * Run the int getVerticalRate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRate_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getVerticalRate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRate_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getVerticalRate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRate_3()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getVerticalRateSign() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRateSign_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRateSign();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getVerticalRateSign() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRateSign_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRateSign();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getVerticalRateSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRateSource_1()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRateSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
	}

	/**
	 * Run the int getVerticalRateSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRateSource_2()
		throws Exception {
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		int result = fixture.getVerticalRateSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
		assertEquals(0, result);
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
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
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
		AirborneVelocityMessage fixture = new AirborneVelocityMessage("", 1, 1, 1L);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Calendar.setTime(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.SimpleDateFormat.format(Unknown Source)
		//       at java.text.DateFormat.format(Unknown Source)
		//       at domain.AdsMessage.toString(AdsMessage.java:66)
		//       at domain.AirborneVelocityMessage.toString(AirborneVelocityMessage.java:214)
		//       at exception.AdsMessageException.<init>(AdsMessageException.java:14)
		//       at domain.AdsMessage.<init>(AdsMessage.java:23)
		//       at domain.AirborneVelocityMessage.<init>(AirborneVelocityMessage.java:14)
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
		new org.junit.runner.JUnitCore().run(AirborneVelocityMessageTest.class);
	}
}