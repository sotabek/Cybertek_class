package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q2 {

	public static void main(String[] args) {

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
