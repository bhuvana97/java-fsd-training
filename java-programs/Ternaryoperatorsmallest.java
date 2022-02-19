//b) Write a program to use a Ternary operator and find the smallest of three numbers.

package assignment3;

import java.util.Scanner;

public class Ternaryoperatorsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		d = (a < b) && (a < c) ? a : (b < c) && (b < a) ? b : c;
		System.out.println("The smallest is" + d);
	}

}
