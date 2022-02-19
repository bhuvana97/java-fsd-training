package practise_assignment;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fWriter=new FileWriter("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");

	char[] a=new char[5];
	a[0]='a';
	a[1]='b';
	a[2]='c';
	a[3]='d';
	a[4]='e';
	fWriter.write(a);
	
	fWriter.flush();
	fWriter.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("unexpected error ocurred");
}
System.out.println("success");
	}

}
