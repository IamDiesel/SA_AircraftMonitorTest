package factory;

import org.junit.*;
import domain.AdsMessage;
import static org.junit.Assert.*;
import exception.AdsMessageFactoryException;

/**
 * The class <code>AdsMessageFactoryTest</code> contains tests for the class <code>{@link AdsMessageFactory}</code>.
 *
 * @generatedBy CodePro at 25.05.15 12:08
 * @author Matthias
 * @version $Revision: 1.0 $
 */
public class AdsMessageFactoryTest {
	/**
	 * Run the AdsMessageFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:08
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		AdsMessageFactory result = AdsMessageFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessageFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:08
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		AdsMessageFactory result = AdsMessageFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage sentence2Message(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:08
	 */
	@Test
	public void testSentence2Message_1()
		throws Exception {
		AdsMessageFactory fixture = AdsMessageFactory.getInstance();
		String sentence = "{\"subscribe\":[\"message\",\"ads.sentence\",\"1431889696.8169842!ADS-B*8D40563358ABC0F5160C1F08F2DC;\r\n\"]}";

		AdsMessage result = fixture.sentence2Message(sentence);

		System.out.println(result.toJedisString());
		assertNotNull(result);
		assertEquals(result.toJedisString(),"11;4216371;01011000101010111100000011110101000101100000110000011111000010001111001011011100;1431889696816");
	}

	/**
	 * Run the AdsMessage sentence2Message(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:08
	 */
	@Test(expected = exception.AdsMessageFactoryException.class)
	public void testSentence2Message_2()
		throws Exception {
		AdsMessageFactory fixture = AdsMessageFactory.getInstance();
		String sentence = "";

		AdsMessage result = fixture.sentence2Message(sentence);

		assertNotNull(result);
	}

	/**
	 * Run the AdsMessage sentence2Message(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 25.05.15 12:08
	 */
	@Test(expected = exception.AdsMessageFactoryException.class)
	public void testSentence2Message_3()
		throws Exception {
		AdsMessageFactory fixture = AdsMessageFactory.getInstance();
		String sentence = "{\"subscribe\":[\"message\",\"1431889696.8169842!ADS-B*8D40563358ABC0F5160C1F08F2DC;\r\n\"]}";
	
		AdsMessage result = fixture.sentence2Message(sentence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    exception.AdsMessageFactoryException: AdsMessageFactoryException No. 201: JSON Start identifier (*) or JSON End Identifier (;) not available in sentence at sentece2Message()-conversion--Begin Err Data--
		//       Sentence: a
		//       Payload:
		//       binarySentence:
		//       --End Err Data--
		//       at factory.AdsMessageFactory.sentence2Message(AdsMessageFactory.java:34)
		assertNotNull(result);
		assertEquals(result.toJedisString(),"11;4216371;01011000101010111100000011110101000101100000110000011111000010001111001011011100;1431889696816");
	}



	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 25.05.15 12:08
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
	 * @generatedBy CodePro at 25.05.15 12:08
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
	 * @generatedBy CodePro at 25.05.15 12:08
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AdsMessageFactoryTest.class);
	}
}