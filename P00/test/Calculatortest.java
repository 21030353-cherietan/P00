import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest {
int a, b;
Calculator01 cal;

	@Before
	public void setUp() throws Exception {
		
		a=4321;
		b=1234;
		cal=new Calculator01();
	}


	@Test
	public void testadd() {
		//arrange
		int a=4321;
		int b=1234;
		Calculator01 cal=new Calculator01();
		
		//act 
		int actual=cal.add(a,b);
		int expected=5555;
		
		// assertion
		assertEquals(expected,actual);
	}
	
	@Test
	public void testsub() {
		int actual=cal.sub(a,b);
		int expected=3087;
		
		// assertion
		assertEquals(expected,actual);
	}
	
	@Test
	public void testmul() {
		int actual=cal.mul(a,b);
		int expected=5332114;
		
		
		// assertion
		assertEquals(expected,actual);
	}
	
	@Test
	public void testdiv() {
		//arrange
		Calculator01 cal = new Calculator01();
		
		// act
		int actual=cal.div(a,b);
		int expected=3;
		
		// assertion
		assertEquals(expected,actual);
	}
		
	
	
	}
	@After
	public void tearDown() throws Exception {
	}


}


