package JavaConceptsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b,sum = 0;
		System.out.println("enter numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(a);
list.add(b);
Iterator itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

for(Integer s:list) {
	
//	System.out.println(s);
	sum=sum+s;

}
System.out.println("the sum is"+sum);

	}


}
