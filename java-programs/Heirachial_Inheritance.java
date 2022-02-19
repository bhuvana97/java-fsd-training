package practise;

class parent2{
	void parent2method(){
		System.out.println("parent2 method body");
	}
}
class child2 extends parent2{
	void child2method(){
		System.out.println("calling child2 body");
	}
}
class child3 extends parent2{
	void child3method() {
		System.out.println("calling child3method body");
	}
}
class child4 extends parent2{
	void child4method() {
		System.out.println("calling child4method body");
	}
}
public class Heirachial_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child4 child4=new child4();
		child4.child4method();
		child4.parent2method();
		System.out.println("-------------------------------");
		child3 child3=new child3();
		child3.child3method();
		child3.parent2method();
		System.out.println("--------------------------------");
		child2 child2=new child2();
		child2.child2method();
		child2.parent2method();
		

		
		
	}

}
