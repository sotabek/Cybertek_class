package Assignment_8;

import java.util.Scanner;

public class assignment8_Q5_Scan_CallMethod {

	public static void main(String[] args) {

		sign();
	}

	public static void sign() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int sign = sc.nextInt();

		if (sign > 0) {
			System.out.println("1");
		} else if (sign == 0) {
			System.out.println("0");

		} else {
			System.out.println("-1");

		}

	}

}
