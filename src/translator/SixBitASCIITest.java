package translator;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SixBitASCIITest</code> contains tests for the class <code>{@link SixBitASCII}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class SixBitASCIITest {
	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testBin2ASCII_1()
		throws Exception {
		String binString = "000100000001001110001001000101001100111111";
		System.out.println(SixBitASCII.bin2ASCII("000100000001001110001001000101001100111111"));
		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.SixBitASCIIException: SixBitASCIIException No. 400: Binary String size mismatch. String length % 6 should be 0 but is: 1
		//       --Begin sixBitBinary-Code--
		//       a
		//       --Ebd sixBitBinary-Code--
		//       at translator.SixBitASCII.bin2ASCII(SixBitASCII.java:26)
		assertEquals(result,"DANIEL?");
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test(expected = exception.SixBitASCIIException.class)
	public void testBin2ASCII_2()
		throws Exception {
		String binString = "12";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.SixBitASCIIException: SixBitASCIIException No. 400: Binary String size mismatch. String length % 6 should be 0 but is: 1
		//       --Begin sixBitBinary-Code--
		//       a
		//       --Ebd sixBitBinary-Code--
		//       at translator.SixBitASCII.bin2ASCII(SixBitASCII.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testBin2ASCII_3()
		throws Exception {
		String binString = "";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testBin2ASCII_4()
		throws Exception {
		String binString = "111111";

		String result = SixBitASCII.bin2ASCII(binString);

		assertNotNull(result);
		assertEquals(result,"?");
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testBin2ASCII_5()
		throws Exception {
		String binString = "000000";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		assertEquals("@", result);
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
		new org.junit.runner.JUnitCore().run(SixBitASCIITest.class);
	}
}