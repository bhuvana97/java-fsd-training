
//3.Write a java program to implement an abstract class with two abstract methods and one non-abstract method.

package assignment3;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Watch a=new Watch();
//		a.brand();
		Sonata sonata = new Sonata();
		sonata.brand();
		sonata.price();// abstract method
		sonata.color();// non-abstract method
	}

}

abstract class Watch {

	abstract void price();

	abstract void brand();

	void color() {
		System.out.println("color is black");
	}
}

class Sonata extends Watch {

	void price() {
		// TODO Auto-generated method stub
		System.out.println("Price of Sonata is Rs.5000");
	}

	void brand() {
		// TODO Auto-generated method stub
		System.out.println("Name of brand:Sonata");
	}

}