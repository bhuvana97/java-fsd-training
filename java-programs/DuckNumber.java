package assignmentt;


import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * duck number:
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		String a = scanner.nextLine();
		char ch;
		int count = 0;
		int length = a.length();
		char initial = a.charAt(0);
		for (int i = 0; i < length; i++) {
			ch = a.charAt(i);
			if (ch == '0') {
				count++;
			}

		}
		if (initial != '0' && count > 0) {
			System.out.println(a + "is a duck number");
		} else {
			System.out.println(a + "it is not duck number");
		}

	}
	}

