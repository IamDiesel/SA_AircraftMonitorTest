package exception;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SixBitASCIIExceptionTest</code> contains tests for the class <code>{@link SixBitASCIIException}</code>.
 *
 * @generatedBy CodePro at 24.05.15 21:19
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class SixBitASCIIExceptionTest {
	/**
	 * Run the SixBitASCIIException(int,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testSixBitASCIIException_1()
		throws Exception {
		int errNo = 1;
		String errDescription = "";
		String sixBitBinary = "";

		SixBitASCIIException result = new SixBitASCIIException(errNo, errDescription, sixBitBinary);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getSixBitBinaryCode());
		assertEquals(null, result.getCause());
		assertEquals("exception.SixBitASCIIException: SixBitASCIIException No. 1: \n --Begin sixBitBinary-Code--\n\n --Ebd sixBitBinary-Code--", result.toString());
		assertEquals("SixBitASCIIException No. 1: \n --Begin sixBitBinary-Code--\n\n --Ebd sixBitBinary-Code--", result.getLocalizedMessage());
		assertEquals("SixBitASCIIException No. 1: \n --Begin sixBitBinary-Code--\n\n --Ebd sixBitBinary-Code--", result.getMessage());
	}

	/**
	 * Run the String getSixBitBinaryCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testGetSixBitBinaryCode_1()
		throws Exception {
		SixBitASCIIException fixture = new SixBitASCIIException(1, "", "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getSixBitBinaryCode();

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(SixBitASCIIExceptionTest.class);
	}
}