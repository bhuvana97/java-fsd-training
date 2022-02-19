package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Filestream_Operations {
	public static void main(String args[]) throws Exception {

		FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");
		fout.write(70);
		fout.close();

		System.out.println("writing to file successful");

		FileInputStream fin = new FileInputStream("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");
		int i = fin.read();
		System.out.println("charcter in file is " + " " + (char) i);

		fin.close();

		FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Welcome");
		buffer.close();
		System.out.println("writing to file using bufferedwriter is Successful");

		FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");
		BufferedReader br = new BufferedReader(fr);

		int j;
		System.out.print("reading file using bufferedreader Successful :");
		while ((j = br.read()) != -1) {
			System.out.print((char) j);
			break;
		}
		br.close();
		fr.close();

	}
}