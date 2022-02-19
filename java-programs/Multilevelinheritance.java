package practise;


class Parent1{
	 void parentmethod() {
		 System.out.println("calling parent method");
	 }
}

class Child11 extends Parent1{
	void childmethod() {
		System.out.println("calling child method");
	}
}

class Babychild extends Child11{
	
	void Babychildmethod() {
		System.out.println("calling babychild method");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babychild babychild=new Babychild();
		babychild.Babychildmethod();
		babychild.childmethod();
		babychild.parentmethod();

	}

}
