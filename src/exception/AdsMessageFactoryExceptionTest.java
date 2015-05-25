package exception;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AdsMessageFactoryExceptionTest</code> contains tests for the class <code>{@link AdsMessageFactoryException}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AdsMessageFactoryExceptionTest {
	/**
	 * Run the AdsMessageFactoryException(int,String,String,String,String,int,int,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testAdsMessageFactoryException_1()
		throws Exception {
		int errNo = 1;
		String errDescription = "";
		String sentence = "";
		String payload = "";
		String binarySentence = "";
		int messageType = 1;
		int originator = 1;
		long time = 1L;

		AdsMessageFactoryException result = new AdsMessageFactoryException(errNo, errDescription, sentence, payload, binarySentence, messageType, originator, time);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1L, result.getTimeStamp());
		assertEquals("", result.getPayload());
		assertEquals(1, result.getMessageType());
		assertEquals("", result.getBinarySentence());
		assertEquals(1, result.getOriginator());
		assertEquals("", result.getSentence());
		assertEquals(null, result.getCause());
		assertEquals("exception.AdsMessageFactoryException: AdsMessageFactoryException No. 1: --Begin Err Data--\nSentence: \nPayload: \nbinarySentence: \n--End Err Data--", result.toString());
		assertEquals("AdsMessageFactoryException No. 1: --Begin Err Data--\nSentence: \nPayload: \nbinarySentence: \n--End Err Data--", result.getLocalizedMessage());
		assertEquals("AdsMessageFactoryException No. 1: --Begin Err Data--\nSentence: \nPayload: \nbinarySentence: \n--End Err Data--", result.getMessage());
	}

	/**
	 * Run the String getBinarySentence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetBinarySentence_1()
		throws Exception {
		AdsMessageFactoryException fixture = new AdsMessageFactoryException(1, "", "", "", "", 1, 1, 1L);
		fixture.addSuppressed(new Throwable());

		String result = fixture.getBinarySentence();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getMessageType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMessageType_1()
		throws Exception {
		AdsMessageFactoryException fixture = new AdsMessageFactoryException(1, "", "", "", "", 1, 1, 1L);
		fixture.addSuppressed(new Throwable());

		int result = fixture.getMessageType();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getOriginator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetOriginator_1()
		throws Exception {
		AdsMessageFactoryException fixture = new AdsMessageFactoryException(1, "", "", "", "", 1, 1, 1L);
		fixture.addSuppressed(new Throwable());

		int result = fixture.getOriginator();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getPayload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetPayload_1()
		throws Exception {
		AdsMessageFactoryException fixture = new AdsMessageFactoryException(1, "", "", "", "", 1, 1, 1L);
		fixture.addSuppressed(new Throwable());

		String result = fixture.getPayload();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSentence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetSentence_1()
		throws Exception {
		AdsMessageFactoryException fixture = new AdsMessageFactoryException(1, "", "", "", "", 1, 1, 1L);
		fixture.addSuppressed(new Throwable());

		String result = fixture.getSentence();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the long getTimeStamp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetTimeStamp_1()
		throws Exception {
		AdsMessageFactoryException fixture = new AdsMessageFactoryException(1, "", "", "", "", 1, 1, 1L);
		fixture.addSuppressed(new Throwable());

		long result = fixture.getTimeStamp();

		// add additional test code here
		assertEquals(1L, result);
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
		new org.junit.runner.JUnitCore().run(AdsMessageFactoryExceptionTest.class);
	}
}