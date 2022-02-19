
package datastructures;

import java.util.PriorityQueue;

class PriorityQueue_Integer {
	public static void main(String[] args) {

		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		PriorityQueue<Integer> numbers1 = new PriorityQueue<>();

		numbers.add(1);
		numbers.add(6);
		numbers.add(5);
		numbers.add(2);
		System.out.println("PriorityQueue: " + numbers);

		numbers.offer(0);
		System.out.println("Updated PriorityQueue: " + numbers);
		int number = numbers.peek();

		System.out.println("Accessed Element: " + number);
		boolean result = numbers.remove(2);

		System.out.println("Is the element 2 removed? " + result); // using remove

		System.out.println("PriorityQueue after removal: " + numbers);

		System.out.println("eleemnts copied to numbers1 " + numbers1.addAll(numbers));
		numbers1.addAll(numbers);
		System.out.println("is element 3 present " + numbers1.contains(3));
		numbers1.contains(3);

		numbers1.clear();
		System.out.println("PriorityQueue after clear: " + numbers1);


	}
}
