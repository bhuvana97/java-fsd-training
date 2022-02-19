
//4. Write a java program to evaluate two statements each using Logical OR and Logical And operator.
package assignment3;

public class EvaluatelogicalOR_logicalAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20;
		boolean c = true;
		boolean d = true;
		boolean e = true;
		boolean g = true;

		c = (a < b) && (b == 20);
		System.out.println("The result is" + c);

		d = (a > b) && (b == 20);
		System.out.println("The result is" + d);
		e = (a < b) || (b == 10);
		System.out.println("The result is" + e);
		g = (a > b) || (b == 10);
		System.out.println("The result is" + g);

	}

}
