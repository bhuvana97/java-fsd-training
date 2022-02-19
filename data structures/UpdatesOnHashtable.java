package Hashtable;

import java.util.*;

class UpdatesOnHashtable {
	public static void main(String args[]) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "Geeks");
		ht.put(2, "Geeks");
		ht.put(3, "Geeks");

		System.out.println("Initial Map " + ht);

		ht.put(2, "For");

		System.out.println("Updated Map " + ht);
	}
}
