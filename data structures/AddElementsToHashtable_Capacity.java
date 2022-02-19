package Hashtable;

import java.util.*;

class AddElementsToHashtable_Capacity {
	public static void main(String args[]) {

		Hashtable<Integer, String> ht1 = new Hashtable<>(4);

		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");

		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}
