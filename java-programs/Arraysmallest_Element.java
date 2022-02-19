package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysmallest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int sum = 0;
		int size = sc.nextInt();

		int[] number = new int[size];
		int[] copynumber = new int[size];
		for (int i = 0; i < size; i++) {
			number[i] = sc.nextInt();
		}
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(number[i] + ",");

		}
		System.out.print("]");
		System.out.println(" ");


		int min = number[0];
	
		for (int i = 0; i < size; i++) {
			
			if (number[i] < min)
				min = number[i];
		}
		System.out.println("Smallest element present in given array: " + min);

		float[] t = new float[size];
	
		for (int i = 0; i < size; i++) {

			try {

				t[i] = (float)number[i] / min;
if(min==0) {
	throw new ArithmeticException();
}
				System.out.print(t[i] + ","); // throw Exception

			}

			catch (ArithmeticException e) {
				// Exception handler
				System.out.println("Divided by zero operation cannot possible");
				break;
			} catch (NullPointerException e) {
				System.out.print("Caught NullPointerException");
			}

		}

	}

}
