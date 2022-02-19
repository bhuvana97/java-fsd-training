package practise_assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_charoffset {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
		
		char[] a = new char[2048];
		
		try {
			fileReader.read(a, 4, 5);
			for(char c:a) {
				System.out.print(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		finally {
			fileReader.close();
	
		}
	
	}

}
