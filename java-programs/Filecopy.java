package assignment;

import java.io.*;

public class Filecopy {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {

			fis = new FileInputStream("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");

			fos = new FileOutputStream("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate4.txt");

			int c;

			while ((c = fis.read()) != -1) {

				fos.write(c);
			}

			System.out.println("copied the file successfully");
		}

		finally {

			if (fis != null) {

				fis.close();
			}
			if (fos != null) {

				fos.close();
			}
		}
	}
}
