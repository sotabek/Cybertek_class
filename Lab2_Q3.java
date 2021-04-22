package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q3 {

	public static void main(String[] args) {
		
		/*
		 Write a program that asks the user for a positive nonzero integer value. 
		 The program should use a loop to get 
		 the sum of all the integers from 1 up to the number entered. 
		 */

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number bigger than 0:");
		int num = sc.nextInt();
		int sum=0;
		
		for (int i=1;i<=num;i++) {
			sum=sum+i;
		}	
		System.out.print("Sum up to " + num + " is: " + sum);
	}

}
