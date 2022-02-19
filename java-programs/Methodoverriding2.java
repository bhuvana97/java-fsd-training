//2.Write Two program to implement Method overriding.Create Two parent classes with two methods each , which are overridden.

package assignment2;

public class Methodoverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----from parent class-----");
Watch a= new Watch();
a.brand();
a.price();

//Bag b=new Bag();
//b.brand();
//b.price();
//System.out.println("-----From child class----");

Watch r=new Sonata();
r.brand();
r.price();


//Bag t = new Caprese();
//t.brand();
//t.price();
	}

}


class Watch{
	
	void brand() {
		System.out.println("Titan");
	}
	
	void price() {
		System.out.println("Rs.2000");
	}
	
	
}

//class Bag{
//	
//	void brand() {
//		System.out.println("Lavie");
//		
//	}
//	void price() {
//		System.out.println("Rs.2000");
//	}
//}



class Sonata extends Watch{
	
	void brand() {
		System.out.println("Sonata");
	}
	
	void price() {
		System.out.println("Rs.10000");
	}
}



//class Caprese extends Bag{
//	
//	void brand() {
//		System.out.println("Caprese");
//	}
//	
//	void price() {
//		System.out.println("Rs.5000");
//	}
//}