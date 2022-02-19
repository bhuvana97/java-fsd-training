package assignment;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		
		int size = sc.nextInt();
		
		
		
		int p[] = new int[size]; 
		int num, i = 0, j, count = 0, c = 0, a;

		for (num = 2; num < size; num++) {
			for (j = 1; j <= num; j++) {
				if (num % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				p[i] = num;
				i++;
				count++;

			}
			if (count == size) {
				break;
			}
			c = 0;
		}
		System.out.println("First 10 Prime nums are: ");
		System.out.print("[");
		for (a = 0; a < count; a++) {
			System.out.print(p[a]+",");

		}
		System.out.print("]");
	}
}