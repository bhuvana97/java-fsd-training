package Hashtable;

import java.util.*;

class RemovingMappingsFromHashtable {

	public static void main(String args[]) {

		Map<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "Geeks");
		ht.put(2, "For");
		ht.put(3, "Geeks");
		ht.put(4, "For");

		System.out.println("Initial map : " + ht);

		ht.remove(4);

		System.out.println("Updated map : " + ht);
	}
}
