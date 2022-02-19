//2.Write Two program to implement Method overriding.Create Two parent classes with two methods each , which are overridden.

package assignment2;

public class Methodoverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----from parent class-----");

		Parent1 parent1 = new Parent1();

		parent1.k();
		parent1.l();

		Parent2 parent2 = new Parent2();

		parent2.k();
		parent2.l();
		System.out.println("-----From child class----");

		Parent1 child1 = new Child1();

		child1.k();
		child1.l();

		Parent1 child2 = new Child1();

		child2.k();
		child2.l();

	}

}

class Parent1 {
	void k() {
		System.out.println("k method in parent1 is called");

	}

	void l() {
		System.out.println("l method in parent1 is called");

	}

}

class Parent2 {
	void k() {
		System.out.println("k method in parent2 is called");

	}

	void l() {
		System.out.println("l method in parent2 is called");

	}

}

class Child1 extends Parent1 {

	void k() {
		System.out.println("k child1 class is called");

	}

	void l() {
		System.out.println("l child1 class is called");

	}

}

class Child2 extends Parent2 {

	void k() {
		System.out.println("k child2 class is called");

	}

	void l() {
		System.out.println("l child2 class is called");

	}

}