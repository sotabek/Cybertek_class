package Assignment_8;

import java.util.Scanner;

public class assigment8_Q1 {
	
	public static void main(String arg[]) {
		
		plus();
		
	}

	public static void plus() {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		int total = num1+num2;
		
		System.out.println("result:" + total);

	}

}
