package JavaConceptsPrograms;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size, temp;
		System.out.println("Enter the size");

		size = scanner.nextInt();
		int[] arr1 = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println("]");

		System.out.println("Sortes array is");

		
		for(int i=0;i<size-1;i++) {
			
			int min=i;
			for(int j=i+1;j<size;j++) {
				if(arr1[i]>arr1[j]) {
					min=j;
					temp=arr1[min];
					arr1[min]=arr1[i];
					arr1[i]=temp;
				}
				
			}
		}
		
		System.out.print("[");
		for(int i=0;i<size;i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.print("]");
	}

}
