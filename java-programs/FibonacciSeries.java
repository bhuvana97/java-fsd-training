package assignmentt;


import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

	    int n = 34, firstTerm = 0, secondTerm = 1,nextTerm=0;
	    System.out.println("Fibonacci Series ");
	    System.out.println(firstTerm);
	    System.out.println(secondTerm);
	   
	    nextTerm = firstTerm + secondTerm;

	    while (nextTerm <= n) {
	    	 System.out.println(nextTerm);
	    	 firstTerm = secondTerm;
	    	 secondTerm = nextTerm;
	    	 nextTerm = firstTerm + secondTerm;
	      }

	  }

}
