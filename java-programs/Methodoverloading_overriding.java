package assignment;


class addition {
	public int add(int a, int b) {
		System.out.println("add(int a, int b) is called  from addition class");
		return a + b;
	}

}

public class Methodoverloading_overriding extends addition {
	public int add(int a, int b) {
		System.out.println("add(int a, int b) is called  from Methodoverloading_overriding class");
		return a + b;
	}
	public int add(int a, int b,int c) {
		System.out.println("add(int a, int b,int c ) is called ");
		return a + b+c;
	}
	public int add(String a, String b) {
		System.out.println("add(String a, String b) is called");
		return Integer.parseInt(a) + Integer.parseInt(b);
	}

	
	public double add(int a, double b) {
		System.out.println("add(int a, double b) is called");
		return a + b;
	}

	

	public static void main(String[] args) {
		Methodoverloading_overriding calc = new Methodoverloading_overriding();
		System.out.println(calc.add(4, 8));
		System.out.println(calc.add(4, 8,9));
		System.out.println(calc.add(4, 8.5));
		System.out.println(calc.add("25", "85"));
		
	}

}