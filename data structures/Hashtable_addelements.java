package Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable_addelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Hashtable<Integer, Character> h1 = new Hashtable<Integer, Character>();
		h1.put(111, 'A');
		h1.put(121, 'B');
		System.out.println("keys:" + h1.keySet());
		System.out.println("values" + h1.values());
		System.out.println(h1);
		System.out.println(h1.entrySet());
		System.out.println(" ");
		Hashtable<Integer, Character> h2 = new Hashtable<Integer, Character>();
		h2.put(1, 'C');
		h2.put(2, 'D');
		System.out.println(h2);
		System.out.println(h2.entrySet());

		Map<Integer, Character> h4 = new Hashtable<>();
		h4.put(12001, 'E');
		h4.put(12002, 'G');
		h4.put(12003, 'M');
		h4.put(12004, 'N');
		System.out.println("");

		Hashtable<Integer, Character> h6 = new Hashtable<>(h4);
		System.out.println(h6);

		h4.put(12002, 'H');
		System.out.println("");
		System.out.println("updated hashtable:" + h4);
		System.out.println("");
		h4.remove(12001);
		System.out.println("after removal :" + h4);
	}

}
