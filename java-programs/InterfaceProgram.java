//2.Write a java program to implement an interface with two methods.

package assignment3;

public class InterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technology technology = new Technology();
		technology.cpp();
		technology.java();
	}

}

interface Programming {
	void cpp();

	void java();
}

class Technology implements Programming {

	public void cpp() {
		// TODO Auto-generated method stub
		System.out.println("c++ is programming language");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java is programming language");
	}

}