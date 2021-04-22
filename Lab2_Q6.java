package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q6 {

	public static void main(String[] args) {

		/*
		Write a program that will ask the user to enter the amount of a purchase. 
		The program should then compute the state and county tax sales tax. 
		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		The program should display the amount of the purchase , the state sales tax, 
		the county sales tax, the total sales tax, 
		and the total of the sale (which is the sum of the amount of purchase plus the total sales tax) 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter purchase amount:$");
		double purchaseAmount = sc.nextDouble();
		
		double stateTax=purchaseAmount*0.04;
		double countyTax=purchaseAmount*0.02;
		double totalTax=stateTax+countyTax;
		double totalSale=purchaseAmount+totalTax;
		
		System.out.println("Amount of purchase:$" + purchaseAmount + ", state sales tax:$" + stateTax 
				+ ", county sales tax:$" + countyTax + ", total sales tax:$" + totalTax + ", total of the sale:$" + totalSale);
		
	}

}
