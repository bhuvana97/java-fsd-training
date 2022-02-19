package practise_assignment;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_offsetLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fWriter=new FileWriter("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
	String string="Technology";
	fWriter.write(string, 4, 5);
	fWriter.flush();
	fWriter.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println("unexpected error occurred");
	e.printStackTrace();
}

System.out.println("success");
	}

}
