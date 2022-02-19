package assignment7;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter charcter");

String string=null;
try {
	
	try {
		System.out.println(string.length()); //null pointer exception

	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Null pointer exception");
		System.out.println(e);
	}
	
	
	try {
		int k=Integer.parseInt(string); //number format exception
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Numberformatexception");
		System.out.println(e);
	}
}
catch (Exception e) {
	// TODO: handle exception
	System.out.println("exception");
}
	}

}
