package assignment7;

import java.util.Scanner;

public class StringindexoutOfbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] a=new String[5];
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a charcter");

try {
	char c=scanner.next().charAt(1);

	System.out.println(c);

}
catch(Exception e){
	System.out.println(e);
	System.out.println("exception");
}
	}

}
