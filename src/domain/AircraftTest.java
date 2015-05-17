package domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AircraftTest</code> contains tests for the class <code>{@link Aircraft}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class AircraftTest {
	/**
	 * Run the Aircraft(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_1()
		throws Exception {
		int aircraftID = 1;

		Aircraft result = new Aircraft(aircraftID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getID());
		assertEquals("1", result.toJedisKey());
		assertEquals(-1.0, result.getVeloAngle(), 1.0);
		assertEquals(-1.0, result.getVelocity(), 1.0);
		assertEquals(null, result.getOdd());
		assertEquals(null, result.getEven());
		assertEquals(0, result.getLastOdd());
		assertEquals("1,,-1.0,-1.0,-1.0,-1.0,0,,", result.toJedisString());
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_2()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_3()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_4()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_5()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_6()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_7()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_8()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_9()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_10()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_11()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_12()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testAircraft_13()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at domain.Aircraft.<init>(Aircraft.java:27)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testAircraft_14()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testAircraft_15()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testAircraft_16()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testAircraft_17()
		throws Exception {
		String jedisString = "";

		Aircraft result = new Aircraft(jedisString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AirbornePositionMessage getEven() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetEven_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		AirbornePositionMessage result = fixture.getEven();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the AirbornePositionMessage getEven() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetEven_2()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		AirbornePositionMessage result = fixture.getEven();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the int getID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetID_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		int result = fixture.getID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLastOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetLastOdd_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		int result = fixture.getLastOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0, result);
	}

	/**
	 * Run the AirbornePositionMessage getOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetOdd_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		AirbornePositionMessage result = fixture.getOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the AirbornePositionMessage getOdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetOdd_2()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		AirbornePositionMessage result = fixture.getOdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the double getVeloAngle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetVeloAngle_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		double result = fixture.getVeloAngle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getVelocity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testGetVelocity_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		double result = fixture.getVelocity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertEquals(0.0, result, 0.1);
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
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_2()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(-1);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_3()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_4()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_5()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(-1);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_6()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_7()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_8()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(-1);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_9()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_10()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(-1);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_11()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(-1);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_12()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_13()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(-1);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		fixture.print();

		// add additional test code here
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_14()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(-1);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_15()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(1.0);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
	}

	/**
	 * Run the void print() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testPrint_16()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(-1);
		fixture.setVelocity(-1);
		fixture.setLongitude(-1);
		fixture.setLastOdd(1);
		fixture.setLatitude(-1);

		fixture.print();

		// add additional test code here
	}

	/**
	 * Run the void setEvenMsg(AirbornePositionMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetEvenMsg_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		AirbornePositionMessage even = new AirbornePositionMessage("");

		fixture.setEvenMsg(even);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setFlightNo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetFlightNo_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		String no = "";

		fixture.setFlightNo(no);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setLastOdd(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetLastOdd_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		int i = 1;

		fixture.setLastOdd(i);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setLatitude(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetLatitude_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		double lat = 1.0;

		fixture.setLatitude(lat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setLongitude(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetLongitude_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		double lon = 1.0;

		fixture.setLongitude(lon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setOddMsg(AirbornePositionMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetOddMsg_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		AirbornePositionMessage odd = new AirbornePositionMessage("");

		fixture.setOddMsg(odd);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setVeloAngle(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetVeloAngle_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		double angle = 1.0;

		fixture.setVeloAngle(angle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the void setVelocity(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testSetVelocity_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);
		double velo = 1.0;

		fixture.setVelocity(velo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
	}

	/**
	 * Run the String toJedisKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testToJedisKey_1()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		String result = fixture.toJedisKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
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
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg((AirbornePositionMessage) null);
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

		String result = fixture.toJedisString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the String toJedisString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testToJedisString_2()
		throws Exception {
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg((AirbornePositionMessage) null);
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

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
		Aircraft fixture = new Aircraft(1);
		fixture.setEvenMsg(new AirbornePositionMessage(""));
		fixture.setOddMsg(new AirbornePositionMessage(""));
		fixture.setFlightNo("");
		fixture.setVeloAngle(1.0);
		fixture.setVelocity(1.0);
		fixture.setLongitude(1.0);
		fixture.setLastOdd(1);
		fixture.setLatitude(1.0);

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
		new org.junit.runner.JUnitCore().run(AircraftTest.class);
	}
}