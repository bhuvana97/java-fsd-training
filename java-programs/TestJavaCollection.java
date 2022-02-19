package collections;

import java.util.*;

class TestJavaCollection {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
//Traversing list through Iterator  
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("");
		
		
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr1=al.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		
		System.out.println("");
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr2=v.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
		
		System.out.println("");
		
		
		
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr3=stack.iterator();  
		while(itr3.hasNext()){  
		System.out.println(itr3.next());  
		}  
		
		
		
		
		System.out.println("");
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr4=queue.iterator();  
		while(itr4.hasNext()){  
		System.out.println(itr4.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr5=queue.iterator();  
		while(itr5.hasNext()){  
		System.out.println(itr5.next());  
		}  
		
		System.out.println("");
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		System.out.println("");
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr6=set.iterator();  
		while(itr6.hasNext()){  
		System.out.println(itr6.next());  
		}  
		
		
		
		System.out.println("");
		LinkedHashSet<String> sett=new LinkedHashSet<String>();  
		sett.add("Ravi");  
		sett.add("Vijay");  
		sett.add("Ravi");  
		sett.add("Ajay");  
		Iterator<String> itr7=sett.iterator();  
		while(itr7.hasNext()){  
		System.out.println(itr7.next());  
		}  
		
		
		
		TreeSet<String> set1=new TreeSet<String>();  
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi");  
		set1.add("Ajay");  
		//traversing elements  
		Iterator<String> itr8=set1.iterator();  
		while(itr8.hasNext()){  
		System.out.println(itr8.next());  
		}  
		
	}
}