package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class string_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> str= new LinkedList<>();
		Queue<String> str1= new LinkedList<>();
		str.add("java");
		str.add("programming");
		str.add("language");
		System.out.println("The eleemnts are"+str);
		str1.addAll(str);
		System.out.println("The eleemnts of str1 are"+str1);
		System.out.println("The element deleted from the head is: " +str.remove());
		System.out.println("The elements after deletion"+str);
		System.out.println("is str empty?"+str.isEmpty());
		System.out.println("is str contains 'programming '"+str.contains("programming"));
		str.contains("java");
		
		int l=str.size();
		System.out.println("size is "+l);
	    String head=str.peek();
		System.out.println("The head of the queue is: " + head);
		str.clear();
		System.out.println("The eleemnts of str1 are"+str);
	}

}
