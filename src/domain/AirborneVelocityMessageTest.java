package domain;

import java.sql.Timestamp;

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
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		double airspeed = 456.7450054461461;
		double headingDegrees = 70.29554640032657;
		
		AirborneVelocityMessage result = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		assertNotNull(result);
		assertEquals(result.toJedisString(),"19;4901205;10011001010000001001101100110101111000000101000000011010010011101000001011100110;"+time+";"+airspeed+";"+headingDegrees);
	}

	/**
	 * Run the double getAirspeed() method test.
	 * Testing for Type 3/4 (also for Type 1/2) throws an error when airspeed data is 0
	 * airspeed 0 indicates that no airspeed data is availabe. This will throw an exception while parsing the data.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetAirspeed_1()
		throws Exception {
		String airspeed = "0000000000"; //bit 25..34
		String sType = "011"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"01000000100110110"+airspeed+"000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "10011"+sType+"01000000100110110"+airspeed+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		double result = fixture.getAirspeed();
		assertEquals(0, result, 0.1);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_2()
		throws Exception {
		String airspeed = "1111111111"; //bit 25..34
		String sType = "011"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"01000000100110110"+airspeed+"000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "10011"+sType+"01000000100110110"+airspeed+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		double result = fixture.getAirspeed();

		assertEquals(1023.0 - 1.0 , result, 1023.1 - 1.0);
	}

	/**
	 * Run the double getAirspeed() method test.
	 * This is the testing for type 1/2. Data has to be interpreted in a different way than type 3/4
	 * For this calculation of speed east west and north south velocity are combined.
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAirspeed_3()
		throws Exception {
		String norSouthVelo = "0000000001"; //bit 25..34 North-South Velocity
		String easWestVelo  = "0000000001"; //bit 14..23 East-West Velocity
		String s = "0"; 					//bit 24	 Indicates movement direction: 0..Moving North 1..Moving South
		String w = "0";						//bit 13	 Indicates movement direction: 0..Moving East 1..Moving West
		String sType = "001"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"01000"+w+easWestVelo+s+norSouthVelo+"000000101000000011010010011101000001011100110";

		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		double result = fixture.getAirspeed();


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
		String norSouthVelo = "1111111111"; //bit 25..34 North-South Velocity
		String easWestVelo  = "1111111111"; //bit 14..23 East-West Velocity
		String s = "0"; 					//bit 24	 Indicates movement direction: 0..Moving North 1..Moving South
		String w = "0";						//bit 13	 Indicates movement direction: 0..Moving East 1..Moving West
		String sType = "001"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"01000"+w+easWestVelo+s+norSouthVelo+"000000101000000011010010011101000001011100110";

		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getAirspeed();

		assertEquals(1445.0, result, 1445.9);
	}

	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetAirspeed_5()
		throws Exception {
		String norSouthVelo = "1111111111"; //bit 25..34 North-South Velocity
		String easWestVelo  = "1111111111"; //bit 14..23 East-West Velocity
		String s = "0"; 					//bit 24	 Indicates movement direction: 0..Moving North 1..Moving South
		String w = "0";						//bit 13	 Indicates movement direction: 0..Moving East 1..Moving West
		String sType = "111"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"01000"+w+easWestVelo+s+norSouthVelo+"000000101000000011010010011101000001011100110";

		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getAirspeed();

		assertEquals(0.0, result, 0.1);
	}
	
	/**
	 * Run the double getAirspeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetAirspeed_6()
		throws Exception {
		String norSouthVelo = "0000000000"; //bit 25..34 North-South Velocity
		String easWestVelo  = "0000000001"; //bit 14..23 East-West Velocity
		String s = "0"; 					//bit 24	 Indicates movement direction: 0..Moving North 1..Moving South
		String w = "0";						//bit 13	 Indicates movement direction: 0..Moving East 1..Moving West
		String sType = "111"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"01000"+w+easWestVelo+s+norSouthVelo+"000000101000000011010010011101000001011100110";

		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getAirspeed();

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

		String b = "1";
		String delta = "0000001";

		
		String binarySentence =  "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+delta+"010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getDeltaBaroAltoAttitude();

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
		String b = "0";
		String delta = "1111111";

		
		String binarySentence =  "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+delta+"010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		assertEquals(3150, result);
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
		String b = "1";
		String delta = "1111111";

		
		String binarySentence =  "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+delta+"010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		assertEquals(-3150, result);
	}

	/**
	 * Run the int getDeltaBaroAltoAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetDeltaBaroAltoAttitude_4()
		throws Exception {
		String b = "0";
		String delta = "0000000";

		
		String binarySentence =  "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+delta+"010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getDeltaBaroAltoAttitude();

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
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "1";
		String eastWestDirection = "1";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getEastWestVelocity();

		assertEquals(3-1, result);
	}


	@Test
	public void testGetGeoGreaterBaroAttitude_1()
		throws Exception {
		String b = "0";
		String binarySentence = "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+"0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		String b = "1";
		String binarySentence = "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+"0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		assertFalse(result);
	}

	/**
	 * Run the boolean getGeoGreaterBaroAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetGeoGreaterBaroAttitude_3()
		throws Exception {
		String b = "";
		String binarySentence = "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+"0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		assertTrue(result);
	}

	/**
	 * Run the boolean getGeoGreaterBaroAttitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetGeoGreaterBaroAttitude_4()
		throws Exception {
		String b = "11";
		String binarySentence = "10001101010010101100100101010101100110010100000010011011001101011110000001010000"+b+"0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		boolean result = fixture.getGeoGreaterBaroAttitude();

		assertTrue(result);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *
	 * @throws Exception
	 *
	 *Subtype 		  5..7 = 			38..40
	 *EastWestDirection = 13+33=		46
	 *EastWestVelo = 14..23 = 			47..56
	 *northSouthDirection = 24+33 = 	57
	 *northSouthVelo = 25..34 = 		58..67
	 *		
	 *
	 *Test1: Both directions have the same speed. moving south west. --> degrees = 225°
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_1()
		throws Exception {
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "1";
		String eastWestDirection = "1";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		double result = fixture.getHeadingDegrees();

		assertEquals(224.9, result, 225.1);
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
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "0";
		String eastWestDirection = "0";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(44.9, result, 45.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *Moving North
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_3()
		throws Exception {
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"1111111111"; 
		String eastWestVelo = 		"0000000010"; 
		String northSouthDirection = "0";
		String eastWestDirection = "0"; //1moving west
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(89.9, result, 90.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *Moving South
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_4()
		throws Exception {
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"1111111111";
		String eastWestVelo = 		"0000000010"; 
		String northSouthDirection = "1";
		String eastWestDirection = "0"; //1moving west
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(269.9, result, 270.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *Moving West
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_5()
		throws Exception {
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000010";
		String eastWestVelo = 		"1111111111"; 
		String northSouthDirection = "0";
		String eastWestDirection = "1"; //1moving west
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(179.9, result, 180.1);
	}

	/**
	 * Run the double getHeadingDegrees() method test.
	 *Moving East
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_6()
		throws Exception {
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000010";
		String eastWestVelo = 		"1111111111"; 
		String northSouthDirection = "0";
		String eastWestDirection = "0"; //1moving west
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(0.0, result, 0.1);
	}
	
	/**
	 * Run the double getHeadingDegrees() method test.
	 *Moving East
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetHeadingDegrees_7()
		throws Exception {
		String sT = "011"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String h = "1"; //Heading data available
		String headingDeg =		"0000000001";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+h+headingDeg+"00110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(0.35, result, 0.36);
	}
	
	/**
	 * Run the double getHeadingDegrees() method test.
	 *Moving East
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetHeadingDegrees_8()
		throws Exception {
		String sT = "011"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String h = "0"; // 1..Heading data available 0..not
		String headingDeg =		"0000000001";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+h+headingDeg+"00110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getHeadingDegrees();

		assertEquals(0.35, result, 0.36);
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
		String h = "1"; //bit 13  0..Heading Data not available  1..data available
		String binarySentence = "100011010100101011001001010101011001100101000"+h+"001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		boolean result = fixture.getHeadingStatusAvailable();

		assertEquals(result,true);
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
		String h = "0"; //bit 13  0..Heading Data not available  1..data available
		String binarySentence = "100011010100101011001001010101011001100101000"+h+"001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		assertEquals(result,false);
	}

	/**
	 * Run the int getMessageSubType() method test.
	 *Subtypes are:
	 *Value		Type
	 *0			reserverd
	 *1			velocity over ground (normal)
	 *2			velocity over ground (supersonic)
	 *3			airspeed and heading information when velocity over ground info is not available. conditions are normal (non supersonic)
	 *4			airspeed and heading information when velocity over ground info is not available. conditions are normal (supersonic)
	 *5..7		reserved
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMessageSubType_1()
		throws Exception {
		String sT = "001"; //bit 13  subtype see subtypetest1 description
		String binarySentence = "1000110101001010110010010101010110011"+sT+"010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		int result = fixture.getMessageSubType();

		assertEquals(1, result);
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
		String sT = "111"; //bit 13 subtype see subtypetest1 description
		String binarySentence = "1000110101001010110010010101010110011"+sT+"010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getMessageSubType();

		assertEquals(7, result);
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
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "1";
		String eastWestDirection = "0";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		boolean result = fixture.getMovingEast();


		assertEquals(result,true);
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
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "1";
		String eastWestDirection = "1";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);
		
		boolean result = fixture.getMovingEast();
		assertEquals(result,false);
	}


	/**
	 * Run the boolean getMovingSouth() method test.
	 *Tests the south direction movement.
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMovingSouth_1()
		throws Exception {
		String s = "1"; //bit 48  0..moving north 1..moving south
		String sType = "001"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"0100000010011011"+s+"01101011110000001010000X0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		String s = "0"; //bit 48  0..moving north 1..moving south
		String sType = "001"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"0100000010011011"+s+"01101011110000001010000X0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		assertFalse(result);
	}

	/**
	 * Run the boolean getMovingSouth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetMovingSouth_3()
		throws Exception {
		String s = ""; //bit 48  0..moving north 1..moving south
		String sType = "001"; //bit 5..7
		String binarySentence = "1000110101001010110010010101010110011"+sType+"0100000010011011"+s+"01101011110000001010000X0011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "1";
		String eastWestDirection = "1";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		boolean result = fixture.getMovingWest();

		assertEquals(result,true);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *acc	navigation Accuracy [m/s]
	 *0		Error
	 *1		10 
	 *2		3
	 *3		1
	 *4		0.3
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetNavigationAccuracy_1()
		throws Exception {
		String acc = "001";
		String binarySentence = "100011010100101011001001010101011001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "1001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getNavigationAccuracy();

		assertEquals(9.9, result, 10.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetNavigationAccuracy_2()
		throws Exception {
		String acc = "000";
		String binarySentence = "100011010100101011001001010101011001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "1001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getNavigationAccuracy();

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
		String acc = "100";
		String binarySentence = "100011010100101011001001010101011001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "1001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getNavigationAccuracy();

		assertEquals(0.2, result, 0.4);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetNavigationAccuracy_4()
		throws Exception {
		String acc = "111";
		String binarySentence = "100011010100101011001001010101011001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "1001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getNavigationAccuracy();

		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetNavigationAccuracy_5()
		throws Exception {
		String acc = "";
		String binarySentence = "100011010100101011001001010101011001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "1001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		double result = fixture.getNavigationAccuracy();

		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getNavigationAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetNavigationAccuracy_6()
		throws Exception {
		String acc = "1000000000";
		String binarySentence = "100011010100101011001001010101011001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		String binarySentence2=                                 "1001100101"+acc+"0001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		String sT = "001"; //subtype 1..2: calculation with MovingSouth/West and angle subtype 3/4: calculation with bit 14..23
		String northSouthVelo =		"0000000011";
		String eastWestVelo = 		"0000000011";
		String northSouthDirection = "1";
		String eastWestDirection = "1";
		String binarySentence = "1000110101001010110010010101010110011"+sT+"01000"+eastWestDirection+eastWestVelo+northSouthDirection+northSouthVelo+"000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		assertEquals(3-1, result);
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
		String t = "1"; //bit 24  0..indicated airspeed (IAS) 1..true airspeed (TAS)
		String binarySentence = "10001101010010101100100101010101100110010100000010011011"+t+"0110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		boolean result = fixture.getTrueAirspeedType();

		assertEquals(result,true);
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
		String t = "0"; //bit 24  0..indicated airspeed (IAS) 1..true airspeed (TAS)
		String binarySentence = "10001101010010101100100101010101100110010100000010011011"+t+"0110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		boolean result = fixture.getTrueAirspeedType();

		assertEquals(result,false);
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
		String vR = "000000001";
		String binarySentence = "100011010100101011001001010101011001100101000000100110110011010111100"+vR+"0000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRate();

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
		String vR = "111111111";
		String binarySentence = "100011010100101011001001010101011001100101000000100110110011010111100"+vR+"0000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRate();

		assertEquals(32640, result);
	}

	/**
	 * Run the int getVerticalRate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testGetVerticalRate_3()
		throws Exception {
		String vR = "000000000";
		String binarySentence = "100011010100101011001001010101011001100101000000100110110011010111100"+vR+"0000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRate();

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
		String v = "0";//bit 36
		String binarySentence = "10001101010010101100100101010101100110010100000010011011001101011110"+v+"0000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRateSign();

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
		String v = "1";//bit 36
		String binarySentence = "10001101010010101100100101010101100110010100000010011011001101011110"+v+"0000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRateSign();

		assertEquals(1, result);
	}

	/**
	 * Run the int getVerticalRateSource() method test.
	 *bit 35 vertical rate source
	 *0...geometric source 1...barometric source
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetVerticalRateSource_1()
		throws Exception {
		String v = "1"; //0...geometric source 1...barometric source
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111"+v+"00000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRateSource();

		assertEquals(1, result);
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
		String v = "0"; //0...geometric source 1...barometric source
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111"+v+"00000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;

		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		int result = fixture.getVerticalRateSource();

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
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		double airspeed = 456.7450054461461;
		double headingDegrees = 70.29554640032657;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

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
		assertEquals(result,"19;4901205;10011001010000001001101100110101111000000101000000011010010011101000001011100110;"+time+";"+airspeed+";"+headingDegrees);
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
		String binarySentence = "1000110101001010110010010101010110011001010000001001101100110101111000000101000000011010010011101000001011100110";
		int messageTypeD = 19;
		int originatorD = 4901205;
		long time = 1431508173375L;
		double airspeed = 456.7450054461461;
		double headingDegrees = 70.29554640032657;
		
		AirborneVelocityMessage fixture = new AirborneVelocityMessage(binarySentence, messageTypeD, originatorD, time);

		String result = fixture.toString();

		assertNotNull(result);
		assertEquals(result,"messageTypeD: 19, originatorD: 4901205, time: Mittwoch, 13.05.2015, 11:09:33.375, binarySentence: 10011001010000001001101100110101111000000101000000011010010011101000001011100110, Airsp.: 456.7450054461461, H-Degr: 70.29554640032657");

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