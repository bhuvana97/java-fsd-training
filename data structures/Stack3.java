package datastructures;


import java.io.*;
import java.util.*;

class Stack3 {

	
	public static void main(String[] args)
	{
		
	
		Stack<String> stack2 = new Stack<String>();

		boolean result = stack2.empty();  
		System.out.println("Elements in Stack: " + stack2);  
		result = stack2.empty();  
		System.out.println("Is the stack empty? " + result);  
		stack2.push("java");
		stack2.push("is");
		stack2.push("programming language");

	
		System.out.println("Elements in Stack: " + stack2);  
		result = stack2.empty();  
		System.out.println("Is the stack empty? " + result);  
	}
}
