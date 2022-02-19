package Hashtable;

import java.util.*;

class AddElementsToHashtable_Extends {
	public static void main(String args[]) {
		Map<Integer, String> hm = new HashMap<>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");

		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);

		System.out.println("Mappings of ht2 : " + ht2);
	}
}
