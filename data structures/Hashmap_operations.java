package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		HashMap<Integer, String> b = new HashMap<>(10);
		HashMap<Integer, String> c = new HashMap<Integer, String>(5, 0.5f);
		HashMap<Integer, String> d = new HashMap<Integer, String>(6, 0.75f);
		Map<Integer, String> e = new HashMap<>();

//		a.put(1, "Python");
//		a.put(2, "Flutter");
//		System.out.println(a.keySet());
//		System.out.println(a.values());
//		System.out.println("mappings of a " + a.entrySet());
//		System.out.println("");

		b.put(1, "javascript");
		b.put(2, "Go");
		b.put(3, "Dart");
		b.put(4, "R");

		System.out.println(b.keySet());
		System.out.println(b.values());
		

		System.out.println(b.entrySet());
		System.out.println("");
		b.put(2, "AI");
		System.out.println("updated keyvalue" + b.entrySet());
		System.out.println("");
		b.remove(3);
		System.out.println("updation after removal keyvalue" + b.entrySet());
		System.out.println("");
		
		
		
		//traversal
		
		for (Map.Entry<Integer, String> traverse : b.entrySet()) {
			traverse.getValue();
			traverse.getKey();
			System.out.println("Key=" + traverse.getKey() + " " + "value=" + traverse.getValue());

		}

		System.out.println("");
		
		
		
		System.out.println("mappings with capacity and float:");
		c.put(1, "Java");
		c.put(2, "c++");
		System.out.println("mappings of c" + c.entrySet());
		System.out.println("");

		

		e.put(1, "AWS");
		e.put(2, "Azure");
		HashMap<Integer, String> g = new HashMap<Integer, String>(e);
		System.out.println("E:" + e);
		System.out.println("G:" + g);
	}

}
