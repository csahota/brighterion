package test.com.brighterion.coding.exercise;

import org.junit.Test;

import com.brighterion.coding.exercise.FibonacciSequence;

/**
 * @author Char Sahota
 * 
 * JUnit test for testing the class FibonacciSequence.
 *
 */
public class FibonacciSequenceTest {

	/**
	 * Testing to make sure null arguments are caught.
	 */
	@Test
	public void testNullArg() {
		
		String result = FibonacciSequence.print(null);
		
		assert result.equalsIgnoreCase(FibonacciSequence.ERROR_EMPTY_ARG); 
		
	}
	
	/**
	 * Testing to make sure a valid argument is caught.
	 */
	@Test
	public void testInvalidArg() {
		
		String result = FibonacciSequence.print(new String[]{"abc"});
		
		assert result.equalsIgnoreCase(FibonacciSequence.ERROR_INVALID_ARG); 
	}
	
	/**
	 * Testing a valid Fibonacci Sequence is returned.
	 */
	@Test
	public void testValidArg() {
		
		String result = FibonacciSequence.print(new String[]{"10"});
		
		assert result.indexOf(FibonacciSequence.RESULT_PREFIX) > -1; 
		
	}

}
