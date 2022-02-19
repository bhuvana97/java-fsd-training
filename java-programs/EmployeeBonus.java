
/*
 * 5. Write a program to input the following details:
i)Employee Name
ii)Employee Salary
iii)Employee Year of joining

Calculate the Loyalty bonus of the Employee's by
a)if the year of their joining is on or before than 2017,and their Salary is more than 30000/-,
then the bonus will be 22% of the salary.
b)if the year of their joining is on or before than 2017,and their Salary is less than 30000/-,
then the bonus will be 33% of the salary.
c)if the year of their joining is on or before than 2012,
then the bonus will be 40% of the salary.
d)if the year of their joining is after 2017,and their Salary is less than 30000/-,
then the bonus will be 15% of the salary.
e)if the year of their joining is after 2017,and their Salary is more than 30000/-,
then the bonus will be 10% of the salary.

 */
package assignment5;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		int bonus,newsalary;
		int salary, year;
		System.out.println("Name");
		name = scanner.next();
		System.out.println("Salary");
		salary = scanner.nextInt();
		System.out.println("Year of joining");
		year = scanner.nextInt();
		if(year<2012) {
			bonus=(int) (.4*salary);
			newsalary =salary+bonus;
			System.out.println("the bonus is"+bonus);
			System.out.println("the added salary is "+newsalary);
		}
		
		else if(year<=2017 && salary>30000) {
			bonus=(int) (.22*salary);
			newsalary =salary+bonus;
			System.out.println("the bonus is"+bonus);
			System.out.println("the added salary is "+newsalary);
		}
		else if(year<=2017 && salary<30000) {
			bonus=(int) (.33*salary);
			newsalary =salary+bonus;
			System.out.println("the bonus is"+bonus);
			System.out.println("the added salary is "+newsalary);
		}
		else if(year>2017 && salary<30000) {
			bonus=(int) (.15*salary);
			newsalary =salary+bonus;
			System.out.println("the bonus is"+bonus);
			System.out.println("the added salary is "+newsalary);
		}
		
		else if(year>2017 && salary>30000)
		{
			bonus=(int) (.10*salary);
			newsalary =salary+bonus;
			System.out.println("the bonus is"+bonus);
			System.out.println("the added salary is "+newsalary);
		}
	}

}
