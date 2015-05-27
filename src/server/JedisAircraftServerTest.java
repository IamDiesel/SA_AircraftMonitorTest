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
	Thread.sleep(3000);
	
	boolean result = jedTwo.exists("4981219");
	assertEquals(result, true);
	}

	/**
	 * Run the JedisAircraftServer() constructor test.
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testJedisAircraftServer_1()
		throws Exception {
		JedisAircraftServer result = new JedisAircraftServer();
		assertNotNull(result);
		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JedisAircraftServerTest.class);
	}
}