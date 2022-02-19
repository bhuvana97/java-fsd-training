/*
 * 4.Write a program to input a String array and display it, and now to copy the elements into
another array in the reverse order and print the reverse_array elements.
 */

package assignment5;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
	size=scanner.nextInt();
String[] str1=new String[size];	
String[] str2=new String[size];
String[] str3=new String[size];

System.out.println("Enter array elemnts");
for(int i=0;i<size;i++) {
	str1[i]=scanner.next();
}
str2=str1; // copy array
for(int i=0;i<size;i++) {
	System.out.println(""+str1[i]);
}
System.out.println("The copies array is");
for(int i=0;i<size;i++) {
	System.out.println(""+str2[i]);
}
System.out.println("The reverse of array");

for(int i=str2.length-1;i>=0;i--) { 
	System.out.println(""+str2[i]);
}






	}
}
