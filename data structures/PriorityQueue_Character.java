package datastructures;

import java.util.PriorityQueue;

public class PriorityQueue_Character {


	public static void main(String[] args) {

		PriorityQueue<Character> numbers = new PriorityQueue<>();
		PriorityQueue<Character> numbers1 = new PriorityQueue<>();

		numbers.add('A');
		numbers.add('B');
		numbers.add('C');
		numbers.add('D');
		System.out.println("PriorityQueue: " + numbers);

		numbers.offer('E');
		System.out.println("Updated PriorityQueue: " + numbers);
		Character number = numbers.peek();

		System.out.println("Accessed Element: " + number);
		boolean result = numbers.remove('C');

		System.out.println("Is the element C removed? " + result); // using remove

		System.out.println("PriorityQueue after removal: " + numbers);

		System.out.println("eleemnts copied to numbers1 " + numbers1.addAll(numbers));
		numbers1.addAll(numbers);
		System.out.println("is element A present " + numbers1.contains('A'));

		numbers1.clear();
		System.out.println("PriorityQueue after clear: " + numbers1);


	}

}
