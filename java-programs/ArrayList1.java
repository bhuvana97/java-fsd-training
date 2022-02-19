package JavaConceptsPrograms;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> str=new ArrayList<String>();
str.add("a");
str.add("b");
str.add("c");
System.out.println(str);

for(String str1:str) {
	System.out.println(str1);
}
System.out.println(str.get(0));
System.out.println("--------changed value--------");
System.out.println(str.set(0, "d"));
System.out.println(str);


Iterator itr=str.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("-----------------");
int sum=0;
ArrayList<Integer> num1=new ArrayList<Integer>();
num1.add(1);
num1.add(2);
num1.add(3);
System.out.println(num1);
for(Integer k:num1) {
	sum=sum+k;
}
System.out.println(sum);

	}

}
