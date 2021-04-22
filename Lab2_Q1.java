package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q1 {

	public static void main(String[] args) {

		/*
		 Write a program with a loop that lets the user enter 
		 a series of integer numbers. 
		 After all the numbers have been entered, 
		 the program should display the largest 
		 and smallest numbers entered.
		 */
		
	int max;
	int min;
	
	label1:do {
		
		System.out.print("Enter your first number:");
		Scanner sc = new Scanner (System.in);
		int num1=sc.nextInt();
		
		System.out.print("Enter your next number:");
		int num2=sc.nextInt();
		
		if (num1>num2) {
			max=num1;
			min=num2;
		} else {
			max=num2;
			min=num1;
		}
		
		label2:do {
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			int num3=sc.nextInt();
			if (num3==1) {
				System.out.print("Enter your next number:");
				int num4=sc.nextInt();
				if (num4>max) {
					max=num4;
				}else if (num4<min) {
					min=num4;
				}
			} else if (num3==0) {
				break label2;
			} else {
				System.out.println("Invalid command");
			}
			}while (true);
		System.out.println("Smallest number is: " + min);
		System.out.println("Largest number is: " + max);
			break label1;
		
	}while (true);
}

	}