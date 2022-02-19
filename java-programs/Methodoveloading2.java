//1.Write Two program to implement Method overloading in different ways.Create atleast 4 methods in one program through which method overloading can be implemented.
package assignment2;

public class Methodoveloading2 {

	void record(int id, String name) {

		System.out.println("id and name is" + id + name);

	}

	void record(int id, String name, String designation) {

		System.out.println("id name designation is" + id + name + designation);

	}

	void record(int id, int salary) {

		System.out.println("id and salary is" + id + salary);

	}

	void record(String place, String Manager) {
		System.out.println("place Manager" + place + Manager);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoveloading2 d=new Methodoveloading2();
		d.record(1001, 50000);
		d.record("Paris","Scott");
		d.record(10002, "William","Ux Designer");
		d.record(10005, "Elli");
	}

}
