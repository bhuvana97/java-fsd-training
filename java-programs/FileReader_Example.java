package practise_assignment;

import java.io.FileReader;
import java.io.IOException;
 
public class FileReader_Example
{
    public static void main(String[] args) throws IOException
    {
       
         
        FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\java_example.txt");
         
        try {
            char [] a = new char[2048];
            fileReader.read(a);   
               
            for(char c : a) {
                System.out.print(c);   
            }
        } finally {
            fileReader.close();
        }
    }
}