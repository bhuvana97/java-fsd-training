package assignmentt;


import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a number");
int a,b,c,sum = 0,temp;
Scanner scanner=new Scanner(System.in);
a=scanner.nextInt();
temp=a;
while(temp!=0) {
	b=temp%10;
	int fact=1;
	for(int i=b;i>=1;i--) 
	
	fact=fact*i;
	
	
	sum=sum+fact;
	temp=temp/10;
	
}



if(sum==a) {
	System.out.println("strong number");
}
else {
	System.out.println("not strong number");
}

	}

}
