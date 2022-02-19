
//1.a) Write a program to use a Ternary operator and find the greatest of three numbers.

package assignment3;

import java.util.Scanner;

public class TernaryoperatorGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		System.out.println("Enter 3 Numbers");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		d = (a > b) && (a > c) ? a : (b > c) && (b > a) ? b : c;

		System.out.println("The greatest is" + d);
	}

}
