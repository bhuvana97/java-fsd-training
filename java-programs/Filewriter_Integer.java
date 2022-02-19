package practise_assignment;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fWriter=new FileWriter("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
	int a=65;
	fWriter.write(a);
	fWriter.flush();
	fWriter.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("unexpected error");
}
System.out.println("success");
	}

}
