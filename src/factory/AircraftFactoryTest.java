package factory;

import org.junit.*;
import domain.Aircraft;
import static org.junit.Assert.*;

/**
 * The class <code>AircraftFactoryTest</code> contains tests for the class <code>{@link AircraftFactory}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class AircraftFactoryTest {
	/**
	 * Run the AircraftFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
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
	 * @generatedBy CodePro at 17.05.15 21:38
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
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testMessage2Aircraft_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";

		Aircraft result = fixture.message2Aircraft(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at factory.AircraftFactory.message2Aircraft(AircraftFactory.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the Aircraft message2Aircraft(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testMessage2Aircraft_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";

		Aircraft result = fixture.message2Aircraft(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at factory.AircraftFactory.message2Aircraft(AircraftFactory.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the void updateIdentification(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testUpdateIdentification_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateIdentification(msg, aircraft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at factory.AircraftFactory.updateIdentification(AircraftFactory.java:29)
	}

	/**
	 * Run the void updatePosition(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testUpdatePosition_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updatePosition(msg, aircraft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		//       at factory.AircraftFactory.updatePosition(AircraftFactory.java:41)
	}

	/**
	 * Run the void updatePosition(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testUpdatePosition_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updatePosition(msg, aircraft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at domain.AdsMessage.<init>(AdsMessage.java:30)
		//       at domain.AirbornePositionMessage.<init>(AirbornePositionMessage.java:12)
		//       at factory.AircraftFactory.updatePosition(AircraftFactory.java:41)
	}

	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testUpdateVelocity_1()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at factory.AircraftFactory.updateVelocity(AircraftFactory.java:35)
	}

	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testUpdateVelocity_2()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at factory.AircraftFactory.updateVelocity(AircraftFactory.java:35)
	}

	/**
	 * Run the void updateVelocity(String,Aircraft) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testUpdateVelocity_3()
		throws Exception {
		AircraftFactory fixture = AircraftFactory.getInstance();
		String msg = "";
		Aircraft aircraft = new Aircraft(1);

		fixture.updateVelocity(msg, aircraft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at factory.AircraftFactory.updateVelocity(AircraftFactory.java:35)
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
		new org.junit.runner.JUnitCore().run(AircraftFactoryTest.class);
	}
}