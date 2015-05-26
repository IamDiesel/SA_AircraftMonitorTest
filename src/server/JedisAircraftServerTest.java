package server;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import domain.AirborneVelocityMessage;
import factory.AdsMessageFactory;
import redis.clients.jedis.Jedis;

/**
 * The class <code>JedisAircraftServerTest</code> contains tests for the class <code>{@link JedisAircraftServer}</code>.
 *
 * @generatedBy CodePro at 17.05.15 21:38
 * @author Dogma
 * @version $Revision: 1.0 $
 */
public class JedisAircraftServerTest {
	
	@Test
	public void testOnMessage_1()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();//sinnlos
		String channel = "ads.msg.velocity";
		String message = "{\"subscribe\":[\"message\",\"ads.sentence\",\"1431889752.7486506!ADS-B*8D4C01E39901CF9BC00716FF7A55;\r\n\"]}";
		//fixture.onMessage(channel, message);
		Thread serverThread = new Thread(new Runnable(){
		@Override
		public void run() {
			Jedis jedOne = new Jedis("localhost");
			JedisAircraftServer myAircraftServer = new JedisAircraftServer();
			jedOne.subscribe(myAircraftServer, "ads.msg.identification", "ads.msg.velocity", "ads.msg.position");
		}});
	
	Jedis jedTwo = new Jedis("localhost");
	jedTwo.flushAll();
	serverThread.start();
	jedTwo.publish(channel, ((AirborneVelocityMessage) AdsMessageFactory.getInstance().sentence2Message(message)).toJedisString());
	Thread.sleep(2000);
	
	boolean result = jedTwo.exists("4981219");
	assertEquals(result, true);
	}

	/**
	 * Run the JedisAircraftServer() constructor test.
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testJedisAircraftServer_1()
		throws Exception {
		JedisAircraftServer result = new JedisAircraftServer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_2()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.identification";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_3()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.position";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_4()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.velocity";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_5()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.identification";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_6()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.identification";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_7()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.identification";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_8()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.position";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_9()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.position";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_10()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.position";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_11()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.velocity";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_12()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.velocity";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_13()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "ads.msg.velocity";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_14()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_15()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_16()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onMessage(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnMessage_17()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String channel = "";
		String message = "";

		fixture.onMessage(channel, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at server.JedisAircraftServer.onMessage(JedisAircraftServer.java:22)
	}

	/**
	 * Run the void onPMessage(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnPMessage_1()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String arg0 = "";
		String arg1 = "";
		String arg2 = "";

		fixture.onPMessage(arg0, arg1, arg2);

		// add additional test code here
	}

	/**
	 * Run the void onPSubscribe(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnPSubscribe_1()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String arg0 = "";
		int arg1 = 1;

		fixture.onPSubscribe(arg0, arg1);

		// add additional test code here
	}

	/**
	 * Run the void onPUnsubscribe(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnPUnsubscribe_1()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String arg0 = "";
		int arg1 = 1;

		fixture.onPUnsubscribe(arg0, arg1);

		// add additional test code here
	}

	/**
	 * Run the void onSubscribe(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnSubscribe_1()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String arg0 = "";
		int arg1 = 1;

		fixture.onSubscribe(arg0, arg1);

		// add additional test code here
	}

	/**
	 * Run the void onUnsubscribe(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 24.05.15 21:19
	 */
	@Test
	public void testOnUnsubscribe_1()
		throws Exception {
		JedisAircraftServer fixture = new JedisAircraftServer();
		String arg0 = "";
		int arg1 = 1;

		fixture.onUnsubscribe(arg0, arg1);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JedisAircraftServerTest.class);
	}
}