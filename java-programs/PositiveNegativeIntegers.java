package assignment;

import java.util.Scanner;

public class PositiveNegativeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int sum=0;
		int size=sc.nextInt();
		
	int[] number=new int[size];
	for(int i=0;i<size;i++) {
		number[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		System.out.println(number[i]);
		if(number[i]>0) {
			sum=sum+number[i];
		}
	}
		System.out.println("sum of positive numbers"+sum);
		
	}

}
