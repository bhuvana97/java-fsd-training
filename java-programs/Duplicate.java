//1.Write a program to input an array of integers according to the users, and display the duplicate array elements.
package assignment5;

import java.util.Scanner;

public class Duplicate {

	
	
	public int DuplicateElemt() {
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int b = scanner.nextInt();
	
		int[] a = new int[b];
	int[] c=new int[b];
		System.out.println("Enter the numbers");
		for (int i = 0; i < b; i++) {

			a[i] = scanner.nextInt();

		}
		System.out.println("the array elemnts are");
		for(int i=0;i<b;i++) {
			System.out.println(a[i]);
		}
System.out.println("Duplicate elemnts are");
		
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
				if(a[i]==a[j]) {
					System.out.println(""+a[i]);
					
				}
				
				
			}
			
		}
		


	}
}
