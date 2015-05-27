package factory;

import org.junit.*;
import domain.Aircraft;
import static org.junit.Assert.*;
import exception.AircraftFactoryException;

/**
 * The class <code>AircraftFactoryTest</code> contains tests for the class <code>{@link AircraftFactory}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AircraftFactoryTest {
	/**
	 * Run the AircraftFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		AircraftFactory result = AircraftFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AircraftFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		AircraftFactory result = AircraftFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft message2Aircraft(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testMessage2Aircraft_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";

		Aircraft result = fixture.message2Aircraft(msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft message2Aircraft(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testMessage2Aircraft_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";

		Aircraft result = fixture.message2Aircraft(msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft message2Aircraft(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testMessage2Aircraft_3()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";

		Aircraft result = fixture.message2Aircraft(msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void updateIdentification(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testUpdateIdentification_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateIdentification(msg, aircraft);

		// add additional test code here
	}

	/**
	 * Run the void updateIdentification(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testUpdateIdentification_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateIdentification(msg, aircraft);

		// add additional test code here
	}

	/**
	 * Run the void updatePosition(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testUpdatePosition_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "11;4216371;01011000101010111100000011110101000101100000110000011111000010001111001011011100;1431889696816";
		Aircraft aircraft = new Aircraft(42);

		fixture.updatePosition(msg, aircraft);
		System.out.println(aircraft.toString());
		System.out.println(aircraft.toJedisString());
		assertEquals(aircraft.getID(),42);
	}

	/**
	 * Run the void updatePosition(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AdsMessageException.class)
	public void testUpdatePosition_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updatePosition(msg, aircraft);


	}


	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testUpdateVelocity_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
	}

	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testUpdateVelocity_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
	}

	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testUpdateVelocity_3()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
	}

	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.AircraftFactoryException.class)
	public void testUpdateVelocity_4()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AircraftFactoryTest.class);
	}
}