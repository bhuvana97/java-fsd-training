package Hashtable;

import java.util.*;

public class AddElementsToHashtable_Size {
	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("vishal", 10);
		ht.put("sachin", 30);
		ht.put("vaibhav", 20);

		System.out.println("Size of map is:- " + ht.size());
		System.out.println(ht);

		if (ht.containsKey("vishal")) {
			Integer a = ht.get("vishal");
			System.out.println("value for key" + " \"vishal\" is:- " + a);
		}
	}
}
