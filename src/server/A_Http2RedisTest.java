package server;

import org.junit.*;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;
import domain.AirborneVelocityMessage;
import factory.AdsMessageFactory;
import static org.junit.Assert.*;

/**
 * The class <code>A_Http2RedisTest</code> contains tests for the class <code>{@link A_Http2Redis}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class A_Http2RedisTest {
	/**
	 * Run the A_Http2Redis() constructor test.
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testA_Http2Redis_1()
		throws Exception {
		A_Http2Redis result = new A_Http2Redis();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testRun_1()
		throws Exception {
		
		Jedis jedClient = new Jedis("localhost");
		jedClient.flushAll();
		
	    A_Http2Redis fixture = new A_Http2Redis();
		Thread httpConverterServer = new Thread (fixture);
		// make sure redis-server is running
		
			JedisPubSub jedisSubscription = new JedisPubSub()
			{
					@Override
					public void onMessage(String channel, String message) {
						unsubscribe("ads.msg.identification", "ads.msg.velocity", "ads.msg.position");
						assertNotNull(message);
						
					}
		
					@Override
					public void onPMessage(String arg0, String arg1, String arg2) {}
		
					@Override
					public void onPSubscribe(String arg0, int arg1) {}
		
					@Override
					public void onPUnsubscribe(String arg0, int arg1) {}
		
					@Override
					public void onSubscribe(String arg0, int arg1) {}
		
					@Override
					public void onUnsubscribe(String arg0, int arg1) {}
			};
		httpConverterServer.start();
		jedClient.subscribe(jedisSubscription, "ads.msg.identification", "ads.msg.velocity", "ads.msg.position");
		httpConverterServer.join(10000);
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
		new org.junit.runner.JUnitCore().run(A_Http2RedisTest.class);
	}
}