package practise_assignment;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Integer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
FileReader fileReader=new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
int c=0;
while((c=fileReader.read())!=-1) {
	char d=(char) c;
	System.out.println(d);
}
	}

}
