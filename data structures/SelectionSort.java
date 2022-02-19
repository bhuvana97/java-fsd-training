package datastructures;

import java.util.Scanner;

class SelectionSort
{
	void sort(int arr[])
	{  					
		int n = arr.length; 

		
		for (int i = 0; i < n-1; i++) 
		{
			
			int min = i;
			for (int j = i+1; j < n; j++) 
				{
				if (arr[j] > arr[min])
					min = j;
			}

		
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	
	void printArray(int arr[])
	{
		int n = arr.length;
		System.out.print("[");
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+",");
		System.out.print("]");
	}

	
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size;
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
//		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
