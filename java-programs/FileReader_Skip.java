package practise_assignment;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Skip {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
FileReader fileReader=new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
fileReader.skip(2);
int i=fileReader.read();
char t=(char) i;

System.out.println(t);
fileReader.close();

	}

}
