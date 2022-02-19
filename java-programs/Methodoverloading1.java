//1.Write Two program to implement Method overloading in different ways.Create atleast 4 methods in one program through which method overloading can be implemented.
package assignment2;




public class Methodoverloading1 {

	public int add(int a,int b) {
		return a+b; 
		
	}
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public float add (int a,float b) {
		return a+b;
		
	}
	
	public float add(float a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading1 k=new Methodoverloading1();
		
k.add(2,4);
k.add(5, 6,8);
k.add(2, 1.0f);
k.add(2.4f, 8);

System.out.println(k.add(2,4));
System.out.println(k.add(5, 6,8));
System.out.println(k.add(2, 1.0f));
System.out.println(k.add(2.4f, 8));





	}

}

