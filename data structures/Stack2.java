package datastructures;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args)   
	{  
	
	Stack<Character> stk= new Stack<Character>();  
	
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	
	stk.push('A');  
	stk.push('B');  
	stk.push('C');  
	stk.push('D');  
	  
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	}


}
