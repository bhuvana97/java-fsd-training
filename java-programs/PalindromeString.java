package assignmentt;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a,b="",temp;
		System.out.println("Enter a String");
		
		a=scanner.next();
		int length=a.length();
		temp=a;
	for(int i=length-1;i>=0;i--) {
		b=b+a.charAt(i);
	}

		if(b.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
