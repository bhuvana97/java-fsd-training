package datastructures;



import java.io.*;
import java.util.*;

class stack4 {

	public static void main(String[] args)
	{
		
	
		Stack<Double> stack2 = new Stack<Double>();

		boolean result = stack2.empty();  
		System.out.println("Elements in Stack: " + stack2);  
		result = stack2.empty();  
		System.out.println("Is the stack empty? " + result);  
		stack2.push(122.2222);
		stack2.push(144.5555);
		stack2.push(166.777);

	
		System.out.println("Elements in Stack: " + stack2);  
		result = stack2.empty();  
		System.out.println("Is the stack empty? " + result);  
	}
}
