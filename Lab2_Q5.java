package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q5 {

	public static void main(String[] args) {

		/*
		 Write a program that computes the tax and tip on a restaurant bill. 
		 The program should ask the user to enter the charge for the meal. 
		 The tax should be 6.75 percent of the meal charge. 
		 The tip should be 20 percent of the total after adding tax. 
		 Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Meal costs:$");
		double charge = sc.nextDouble();
		
		double tax = charge*0.0675;
		double tip = (charge+tax)*0.2;
		double totalBill=charge+tax+tip;
		
		System.out.println("Meal charge:$" + charge + ", tax amount:$" + tax + ", tip amount:$" + tip + ", total bill:$"  + totalBill);
		
	}

}
