package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class double_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Double> d= new LinkedList<>();
		Queue<Double> d1= new LinkedList<>();
		d.add(12.2222);
		d.add(144.444444);
		d.add(155.55555);
		System.out.println("The eleemnts are"+d);
		System.out.println("The eleemnts of d1  are"+d1.addAll(d));
		System.out.println("The element deleted from the head is: " +d.remove());
		System.out.println("The elements after deletion"+d);
		System.out.println("is d empty?"+d.isEmpty());
		System.out.println("is d contains '144.444444 '"+d.contains(144.444444));
		
		int l=d.size();
		System.out.println("size is "+l);
	   Double head=d.peek();
		System.out.println("The head of the queue is: " + head);
		d1.clear();
		System.out.println("The eleemnts of d1 are"+d1);
	}

}
