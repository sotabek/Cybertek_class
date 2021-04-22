package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q2 {

	public static void main(String[] args) {
		
		/*
		 A bag of cookies holds 40 cookies. 
		 The calorie information on the bag claims that there are 10 serving in the bag 
		 and that a serving equals 300 calories. write a program that lets the user enter 
		 the number of cookies he or she actually ate 
		 and then reports the number of total calories consumed.
		 
		 */

		int bag=40;
		int serving=10;
		int BagCalory=300;
		
		double OneServing=bag/serving;
		double OneServingCalory=BagCalory/serving;
		double OneCookieCalory=OneServingCalory/OneServing;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Number of cookies you ate:");
		int cookies = sc.nextInt();
		System.out.println("1 cookie calory: " + OneCookieCalory);
		System.out.println("You have consumded " + (cookies*OneCookieCalory) + " calories.");
		
	}

}
