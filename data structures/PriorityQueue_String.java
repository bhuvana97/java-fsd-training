package datastructures;

import java.util.PriorityQueue;

public class PriorityQueue_String {

	public static void main(String[] args) {

		PriorityQueue<String> numbers = new PriorityQueue<>();
		PriorityQueue<String> numbers1 = new PriorityQueue<>();

		numbers.add("anna");
		numbers.add("abuela");
		numbers.add("maragaret");
		numbers.add("alice");
		System.out.println("PriorityQueue: " + numbers);

		numbers.offer("abey");
		System.out.println("Updated PriorityQueue: " + numbers);
	String number = numbers.peek();

		System.out.println("Accessed Element: " + number);
		boolean result = numbers.remove("anna");

		System.out.println("Is the element C removed? " + result); // using remove

		System.out.println("PriorityQueue after removal: " + numbers);

		System.out.println("eleemnts copied to numbers1 " + numbers1.addAll(numbers));
		numbers1.addAll(numbers);
		System.out.println("is element A present " + numbers1.contains("abey"));

		numbers1.clear();
		System.out.println("PriorityQueue after clear: " + numbers1);


	}

}
