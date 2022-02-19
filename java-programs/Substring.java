/*
 * 1.Write a program to take take two strings as an input from the user and check
if the second one is a substring of the first.

 */
package assignment6;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter String1");
		s1 = scanner.next();
		System.out.println("Enter string2");
		s2 = scanner.next();
		if (s1.contains(s2)) {
			System.out.println("it is substring");
		} else {
			System.out.println("not a substring");
		}
	}

}
