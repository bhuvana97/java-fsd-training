package practise_assignment;

import java.util.Scanner;

import AfternoonAssignment.double_sum;

public class Scanner_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		float c;
		long d;
		short e;
		byte f;
		char g;
		String h;
		System.out.println("enter integer");
		a = sc.nextInt();
		System.out.println(a + "is a integer");
		
		System.out.println("enter a double");
		b = sc.nextDouble();
		System.out.println(b + "is a double");

		System.out.println("enter a float");
		c = sc.nextFloat();
		System.out.println(c + "is a float");

		System.out.println("enter long");
		d = sc.nextLong();
		System.out.println(d + "is a long");

		System.out.println("enter a short");
		e = sc.nextShort();
		System.out.println(e + "is a short");

		System.out.println("enter a byte");
		f = sc.nextByte();
		System.out.println(f + "is a byte");

		System.out.println("enter a char");
		g = sc.next().charAt(0);
		System.out.println(g + "is a char");
		System.out.println("enter string");
		h = sc.next();
		System.out.println(h + "is a string");
	}

}
