package exception;

import org.junit.*;
import domain.AdsMessage;
import static org.junit.Assert.*;

/**
 * The class <code>AdsMessageExceptionTest</code> contains tests for the class <code>{@link AdsMessageException}</code>.
 *
 * @generatedBy CodePro at 24.05.15 21:19
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AdsMessageExceptionTest {
	/**
	 * Run the AdsMessageException(int,String,AdsMessage) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testAdsMessageException_1()
		throws Exception {
		int errNo = 1;
		String errText = "";
		AdsMessage msg = new AdsMessage("");

		AdsMessageException result = new AdsMessageException(errNo, errText, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No1: Jedis String not available at ctor.
		//       Message Content: --Begin--
		//       domain.AdsMessage@f49af98, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage getAdsMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testGetAdsMessage_1()
		throws Exception {
		AdsMessageException fixture = new AdsMessageException(1, "", new AdsMessage(""));
		fixture.addSuppressed(new Throwable());

		AdsMessage result = fixture.getAdsMessage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageException: AdsMessageException No1: Jedis String not available at ctor.
		//       Message Content: --Begin--
		//       domain.AdsMessage@4e892f4f, messageTypeD: 0, OriginatorD: 0, TimeStamp: null, binarySentence: null
		//       --End Msg Content--
		//       at domain.AdsMessage.<init>(AdsMessage.java:32)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AdsMessageExceptionTest.class);
	}
}