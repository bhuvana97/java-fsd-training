package datastructures;

import java.util.PriorityQueue;

public class PriorityQueue_Double {

	public static void main(String[] args) {

		PriorityQueue<Double> numbers = new PriorityQueue<>();
		PriorityQueue<Double> numbers1 = new PriorityQueue<>();

		numbers.add(12.2222);
		numbers.add(144.444444);
		numbers.add(155.55555);
		
		System.out.println("PriorityQueue: " + numbers);

//		numbers.offer(116.88888);
		System.out.println("Updated PriorityQueue: " + numbers);
		Double number = numbers.peek();

		System.out.println("Accessed Element: " + number);
		boolean result = numbers.remove(53.44444444);

		System.out.println("Is the element 53.44444444 removed? " + result); // using remove

		System.out.println("PriorityQueue after removal: " + numbers);

		System.out.println("eleemnts copied to numbers1 " + numbers1.addAll(numbers));
		numbers1.addAll(numbers);
		System.out.println("is element 22.122222222 present " + numbers1.contains(22.122222222));
		numbers1.contains(22.122222222);

		numbers1.clear();
		System.out.println("PriorityQueue after clear: " + numbers1);


	}

}
