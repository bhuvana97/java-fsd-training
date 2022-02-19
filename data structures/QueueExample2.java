package datastructures;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {

	public static void main(String[] args) throws IllegalStateException {
		
		Queue<Double> q = new LinkedList<>();
		Queue<Double> q1 = new LinkedList<>();
		for (double i = 0; i < 5; i++)
	                 q.add(i);
		
		q1.addAll(q);
		
		System.out.println("Elements of queue q1 " + q1);
		
	
		System.out.println("is q1 contains element 2? " +q1.contains(2));
		
		
		System.out.println("is q1 empty? " +q1.isEmpty());

		
		q1.clear();
		
		System.out.println("Elements of queue q1 after clear " + q1);
		
		System.out.println("Elements of queue " + q);
		double removedele = q.remove();
		System.out.println("removed element-" + removedele);
		System.out.println(q);
		double head = q.peek();
		System.out.println("head of q-  " +head);
		double size = q.size();
		System.out.println("Size of queue-" + size);

	}
}