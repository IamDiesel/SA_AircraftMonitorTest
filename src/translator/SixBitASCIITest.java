package translator;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SixBitASCIITest</code> contains tests for the class <code>{@link SixBitASCII}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class SixBitASCIITest {
	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testBin2ASCII_1()
		throws Exception {
		String binString = "a";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		assertEquals("404 Plane not Found (SIXBIT ERROR)", result);
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testBin2ASCII_2()
		throws Exception {
		String binString = "a";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		assertEquals("404 Plane not Found (SIXBIT ERROR)", result);
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
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
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testBin2ASCII_4()
		throws Exception {
		String binString = "a";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		assertEquals("404 Plane not Found (SIXBIT ERROR)", result);
	}

	/**
	 * Run the String bin2ASCII(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testBin2ASCII_5()
		throws Exception {
		String binString = "";

		String result = SixBitASCII.bin2ASCII(binString);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		SixBitASCII.main(args);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SixBitASCIITest.class);
	}
}