package datastructures;

import java.util.Stack;

public class stack6 {
	  public static void printNextGreaterElement(int[] input) {
		        Stack<Integer> stack = new Stack<Integer>();
		       int inputSize = input.length;
		        stack.push(input[0]);
		          for (int i = 1; i < inputSize; i++) {
		              while (!stack.isEmpty() && stack.peek() < input[i]) {
		                  System.out.println("Next greater element for " 
		                                      + stack.pop() + "\t = "  + input[i]);
		              }
		              stack.push(input[i]);
		            
		         }
		          while (!stack.isEmpty()) {
    	              int top = (int) stack.pop();
    	              System.out.println("Next greater element for "  + top + "\t = "  +"- 1");
    	          }
		      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] input = {11, 13, 21, 3
};
		        printNextGreaterElement(input);
	}

}
