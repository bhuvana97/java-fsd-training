package practise_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Methods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fileReader=new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
BufferedReader bufferedReader=new BufferedReader(fileReader);

while(bufferedReader.ready()) {
//	System.out.println((char)bufferedReader.read());
	bufferedReader.skip(2);
	System.out.println(bufferedReader.readLine());
}

bufferedReader.close();
	}

}
