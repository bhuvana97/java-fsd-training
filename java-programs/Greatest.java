//2.Write a program to input an array of integers according to the users, and find the greatest value of them.
package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int b = scanner.nextInt();
		int[] a = new int[b];
		int max=a[0];
		System.out.println("Enter the numbers");
		for (int i = 0; i < b; i++) {

			a[i] = scanner.nextInt();

		}
		
		for(int i=0;i<b;i++) {
			for(int j=0;j<b;j++) {
				if(max<a[i]) {
					max=a[i];
				}
			}
			
		}
		System.out.println("Greatest elemnt in array is"+max);

	}

}
