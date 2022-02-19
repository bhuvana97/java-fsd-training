package assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class FileCreate_Write
{
	public static void main(String[] args)
	{
		try
		{
			File f1=new File("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");

			if(f1.createNewFile())
			{
				System.out.println("a new file named "+f1.getName()+" has been created");
			}
			else
			{
				System.out.println("File already exists");
			}
			try
			{
				FileWriter obj1=new FileWriter("C:\\Users\\User\\Desktop\\Java_Training\\FileCreate2.txt");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string");
				String a=sc.nextLine();
				obj1.write(a);
				obj1.close();
				System.out.println("Content has been written to the file successfully");
			}
			catch(IOException e)
			{
				System.out.println("Some unexpected error has occured");
				System.out.println(e);
			}

		}
		catch(IOException e)
		{
			System.out.println("an unexpected error has occured");
			System.out.println(e);
		}
	}
}