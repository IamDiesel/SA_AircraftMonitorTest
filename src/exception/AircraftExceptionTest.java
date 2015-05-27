package exception;

import org.junit.*;
import domain.Aircraft;
import static org.junit.Assert.*;

/**
 * The class <code>AircraftExceptionTest</code> contains tests for the class <code>{@link AircraftException}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AircraftExceptionTest {
	/**
	 * Run the AircraftException(int,String,Aircraft) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAircraftException_1()
		throws Exception {
		int errNo = 1;
		String errText = "";
		Aircraft aircraft = new Aircraft(1);

		AircraftException result = new AircraftException(errNo, errText, aircraft);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		//assertEquals("exception.AircraftException: AircraftException No1: \nAircraft Content: --Begin--\ndomain.Aircraft@4cb725b1, velocity: -1.0, veloAngle: -1.0, lastOdd: 0, aircraftID: 1, latitude: -1.0, longitude: -1.0\n--End Msg Content--", result.toString());
		//assertEquals("AircraftException No1: \nAircraft Content: --Begin--\ndomain.Aircraft@4cb725b1, velocity: -1.0, veloAngle: -1.0, lastOdd: 0, aircraftID: 1, latitude: -1.0, longitude: -1.0\n--End Msg Content--", result.getLocalizedMessage());
		//assertEquals("AircraftException No1: \nAircraft Content: --Begin--\ndomain.Aircraft@4cb725b1, velocity: -1.0, veloAngle: -1.0, lastOdd: 0, aircraftID: 1, latitude: -1.0, longitude: -1.0\n--End Msg Content--", result.getMessage());
	}

	/**
	 * Run the Aircraft getAircraft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetAircraft_1()
		throws Exception {
		AircraftException fixture = new AircraftException(1, "", new Aircraft(1));
		fixture.addSuppressed(new Throwable());

		Aircraft result = fixture.getAircraft();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getID());
		assertEquals(null, result.getOdd());
		assertEquals("1", result.toJedisKey());
		assertEquals(null, result.getEven());
		assertEquals(0, result.getLastOdd());
		assertEquals(-1.0, result.getVelocity(), 1.0);
		assertEquals(-1.0, result.getVeloAngle(), 1.0);
		assertEquals("1,,-1.0,-1.0,-1.0,-1.0,0,,", result.toJedisString());
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
		new org.junit.runner.JUnitCore().run(AircraftExceptionTest.class);
	}
}