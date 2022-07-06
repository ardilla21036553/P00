import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		//arrange 
		int a = 1234;
		int b = 8765;
		
		//act
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		//assert
		int expected = 9999;
		assertEquals (expected, actual);
		
		
	}
	
	@Test
	public final void testSubtract() {
		//arrange 
		int a = 9876;
		int b = 4321;
		
		//act
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		//assert
		int expected = 5555;
		assertEquals (actual, expected);
	}
	
	@Test
	public final void testMultiple() {
		//arrange 
		int a = 1234;
		int b = 8765;
		
		//act
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		//assert
		int expected = 10816010;
		assertEquals (actual, expected);
	}

	@Test
	public final void testDivide() {
		//arrange 
		int a = 20;
		int b = 2;
		
		//act
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		//assert
		int expected = 10;
		assertEquals (actual, expected);
	}
	
	@Test
	public final void testDivideWith0Denominator() {
		int a = 20;
		int c = 2;
		//fail ("Not yet implemented");
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a, c);
			fail ("Expected an IllegalArguementException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage() );
		}catch(Throwable t) {
			assertEquals("Expected an IllegalArguementException to be thrown", t.getMessage());;
		}
	}
}
