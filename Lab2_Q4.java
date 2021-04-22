package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q4 {

	public static void main(String[] args) {
		/*
		 Write a program that asks user for the number of males and 
		 the number of females registered in a class. 
		 The program should display the percentage of males and females in the class.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of males:");
		int males = sc.nextInt();
		
		System.out.print("Number of females:");
		int females = sc.nextInt();
		
		int total = males+females;
		
		System.out.println("% of males in the class: " + (males*100/total) + "%");
		
		System.out.println("% of females in the class: " + (females*100/total) + "%");
		
	}

}
