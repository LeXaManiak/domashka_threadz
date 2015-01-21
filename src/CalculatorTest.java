import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void testCalculator() {
		
		System.out.println("Calculator()");
        int maxnumber=0;
       // Calculator.Calculator(maxnumber);
        int result=Calculator.getMaxnumber();
        
        
        System.out.println("maxnumber"+maxnumber);
        System.out.println("result"+result);
        		
        
        assertEquals(maxnumber, result);
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
		
		
		
		
		
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testCalculate() {
		
		
		
		
		
		
		fail("Not yet implemented");
	}

}
