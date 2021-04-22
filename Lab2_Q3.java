package lecture_day20_StringManipulation_part2;

import java.util.Scanner;

public class Lab2_Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number bigger than 0:");
		int num = sc.nextInt();
		int sum=0;
		
		for (int i=1;i<=num;i++) {
			sum=sum+i;
		}	
		System.out.print("Sum of up to " + num + " is: " + sum);
	}

}
