package exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URL;
import java.net.URLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>Http2RedisExceptionTest</code> contains tests for the class <code>{@link Http2RedisException}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class Http2RedisExceptionTest {
	/**
	 * Run the Http2RedisException(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testHttp2RedisException_1()
		throws Exception {
		int errNo = 1;
		String errDescription = "";

		Http2RedisException result = new Http2RedisException(errNo, errDescription);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBuffer());
		assertEquals(null, result.getMessageString());
		assertEquals(null, result.getURLConnection());
		assertEquals(null, result.getCause());
		assertEquals("exception.Http2RedisException: Http2RedisException No. 1: ", result.toString());
		assertEquals("Http2RedisException No. 1: ", result.getLocalizedMessage());
		assertEquals("Http2RedisException No. 1: ", result.getMessage());
	}

	/**
	 * Run the Http2RedisException(int,String,byte[],URLConnection,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testHttp2RedisException_2()
		throws Exception {
		int errNo = 1;
		String errDescription = "";
		byte[] buffer = new byte[] {};
		URLConnection con = new URL("http://www.google.de").openConnection();
		String message = "";

		Http2RedisException result = new Http2RedisException(errNo, errDescription, buffer, con, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at exception.Http2RedisException.<init>(Http2RedisException.java:14)
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getBuffer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetBuffer_1()
		throws Exception {
		URLConnection url = new URL("http://www.google.de").openConnection();
		
		Http2RedisException fixture = new Http2RedisException(1, "Fehler", new byte[] {0,0,0,0},url, "a");
		fixture.addSuppressed(new Throwable());

		byte[] result = fixture.getBuffer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at exception.Http2RedisException.<init>(Http2RedisException.java:14)
		assertNotNull(result);
	}

	/**
	 * Run the String getMessageString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetMessageString_1()
		throws Exception {
		Http2RedisException fixture = new Http2RedisException(1, "", new byte[] {}, new URL("http://www.google.de").openConnection(), "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getMessageString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at exception.Http2RedisException.<init>(Http2RedisException.java:14)
		assertNotNull(result);
	}

	/**
	 * Run the URLConnection getURLConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testGetURLConnection_1()
		throws Exception {
		Http2RedisException fixture = new Http2RedisException(1, "", new byte[] {}, new URL("http://www.google.de").openConnection(), "");
		fixture.addSuppressed(new Throwable());

		URLConnection result = fixture.getURLConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at exception.Http2RedisException.<init>(Http2RedisException.java:14)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(Http2RedisExceptionTest.class);
	}
}