package exception;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AircraftFactoryExceptionTest</code> contains tests for the class <code>{@link AircraftFactoryException}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AircraftFactoryExceptionTest {
	/**
	 * Run the AircraftFactoryException(int,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAircraftFactoryException_1()
		throws Exception {
		int errNo = 1;
		String errDescription = "";
		String msg = "";

		AircraftFactoryException result = new AircraftFactoryException(errNo, errDescription, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMsg());
		assertEquals(null, result.getCause());
		assertEquals("exception.AircraftFactoryException: AircraftFactoryException No. 1: \n + msg: ", result.toString());
		assertEquals("AircraftFactoryException No. 1: \n + msg: ", result.getLocalizedMessage());
		assertEquals("AircraftFactoryException No. 1: \n + msg: ", result.getMessage());
	}

	/**
	 * Run the String getMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMsg_1()
		throws Exception {
		AircraftFactoryException fixture = new AircraftFactoryException(1, "", "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getMsg();

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(AircraftFactoryExceptionTest.class);
	}
}