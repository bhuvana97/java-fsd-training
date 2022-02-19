/*
 * 3.Write a program to input an array of integers according to the user , and also take a input of a 
particular integer and find out the occurence of the intger in the array.
 */
package assignment5;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int b = scanner.nextInt();
		int count=0;
		boolean flag=false;
		int[] a = new int[b];
	int[] c=new int[b];
		System.out.println("Enter the numbers");
		for (int i = 0; i < b; i++) {

			a[i] = scanner.nextInt();

		}
		
		System.out.println("Enter the integer you want to found");
		int num1=scanner.nextInt();
		for(int i=0;i<b;i++) {
			if(a[i]==num1) {
				count++;
			}
			else {
				System.out.println("no elemnts");
			}
		}
		System.out.println("The ocuurence of" +num1 +"is" +count);
	}

}
