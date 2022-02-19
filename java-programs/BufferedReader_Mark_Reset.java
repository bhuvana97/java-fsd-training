package practise_assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Mark_Reset {

	public static void main(String[] args)  {
		FileReader fileReader;
		try {
			fileReader = new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			try {
				fileReader.mark(2);
				int g= fileReader.read();
				char r=(char) g;
				System.out.println(r);
				fileReader.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
}
}