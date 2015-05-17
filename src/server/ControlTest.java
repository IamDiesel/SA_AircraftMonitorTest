package server;

import java.net.BindException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ControlTest</code> contains tests for the class <code>{@link Control}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class ControlTest {
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

		Control.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at redis.clients.jedis.Connection.connect(Connection.java:121)
		//       at redis.clients.jedis.BinaryClient.connect(BinaryClient.java:54)
		//       at redis.clients.jedis.BinaryJedis.connect(BinaryJedis.java:1657)
		//       at redis.clients.jedis.Jedis.subscribe(Jedis.java:1972)
		//       at server.Control.main(Control.java:24)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.05.15 21:38
	 */
	@Test(expected = java.net.BindException.class)
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		Control.main(args);

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
		new org.junit.runner.JUnitCore().run(ControlTest.class);
	}
}