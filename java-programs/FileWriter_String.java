package practise_assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fileWriter=new FileWriter("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String: ");
	String str = sc.nextLine();
	fileWriter.write(str);
	
	if(fileWriter!=null) {
		fileWriter.flush();
		fileWriter.close();
	}
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("unexpected error ocurred");
}
System.out.println("success");
	}

}
