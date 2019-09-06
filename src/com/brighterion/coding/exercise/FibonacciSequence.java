package com.brighterion.coding.exercise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Char Sahota
 * 
 * This class is to provide a coding example of a Fibonacci Sequence.
 * 
 * A Fibonacci Sequence is a series of numbers where the next number is the sum of previous two numbers. 
 * For example 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 etc... 
 * 
 * In java there are a few possible solutions to write a fibonacci series program. For example:
 * 
 * 1. Without using recursion
 * 2. With using recursion
 * 3. In Java 8 we can use Stream.iterate with Lambda expression.
 * 
 * For this exercise I've decided to use the later as it's using Java 8.
 *
 */
public class FibonacciSequence {
	
	public static final String ERROR_EMPTY_ARG = "Empty argument, please provide a limit.";
	public static final String ERROR_INVALID_ARG = "Something went wrong, please try a valid number. For exmaple: 100";
	public static final String RESULT_PREFIX = "Series result : ";
	
	
	/**
	 * Private print method returning a sequence of Fibonacci numbers.
	 * 
	 * @param limit
	 */
	private static String print(String strLimit) {
		
		try {
			
			int limit = Integer.parseInt(strLimit);
			
			String series = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
	                .limit(limit)
	                .map(f -> f[0])
	                .map(String::valueOf) 
	                .collect(Collectors.joining(" "));
	
	       return RESULT_PREFIX.concat(series);
        
		} catch (Exception e) {
			
			return ERROR_INVALID_ARG;
		}
	}

	/**
	 * Public class print method to return Fibonacci sequence.
	 * - calls private print method to generate sequence.
	 * 
	 * @param args
	 * @return 
	 */
	public static String print(String[] args) {
		
		// Catch empty or null argument.
		if(args != null && args.length > 0) {
			
			return print(args[0]);
			
		} else {
			
			return ERROR_EMPTY_ARG;
		}
	}

	/**
	 * Class main method for command line execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(print(args));
			
	}


}
