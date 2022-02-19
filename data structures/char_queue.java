package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class char_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Character> c= new LinkedList<>();
		Queue<Character> c1= new LinkedList<>();
		c.add('A');
		c.add('B');
		c.add('C');
		System.out.println("The eleemnts are"+c);
		c1.addAll(c);
		System.out.println("The eleemnts of c1 are"+c1);
		System.out.println("The element deleted from the head is: " +c.remove());
		System.out.println("The elements after deletion"+c);
		System.out.println("is str empty?"+c.isEmpty());
		System.out.println("is str contains 'B '"+c.contains('B'));
	
		int l=c.size();
		System.out.println("size is "+l);
	  Character head=c.peek();
		System.out.println("The head of the queue is: " + head);
		c1.clear();
		System.out.println("The eleemnts of d1 are"+c1);
	}

}
