package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

import com.sun.net.httpserver.HttpServer;

/**
 * The class <code>WebServerTest</code> contains tests for the class <code>{@link WebServer}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:07
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class WebServerTest {
	/**
	 * Run the WebServer() constructor test.
	 *
	 * @generatedBy CodePro at 25.05.15 12:07
	 */
	@Test
	public void testWebServer_1()
		throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(3333), 0); 
	    server.createContext( "/map.basic", new WebServer.MapBasic());
	    server.createContext( "/active.kml", new WebServer.ActiveKML());
	    server.setExecutor(null); // create a default executor
	    server.start();
	    
		Thread redisDataThread = new Thread(new Runnable(){
			@Override
			public void run() {
				Jedis client = new Jedis("localhost");
				client.set("3958349", "3958349,DLH6EN,465.3815638806505,133.7811247648687,49.28489685058594,9.735788198617788 ,0,11;3958349;01011000011100111101000011011011010010100001110000000011000100001001110011111111;1431505863126,11;3958349;01011000011100111100010001001111010110100000111000001001000111000100100101000000;1431505862026");
				}});
	    
		redisDataThread.start();
		/*URL url = new URL("localhost:5000/active.kml");
		URLConnection con = url.openConnection();
		BufferedReader buff = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
	    while ((inputLine = buff.readLine()) != null) 
            System.err.println(inputLine);
        buff.close();*/
        
      
		
		
		
		
		
		//assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(WebServerTest.class);
	}
}