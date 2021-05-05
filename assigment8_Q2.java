package Assignment_8;

import java.util.Scanner;

public class assigment8_Q2 {

	public static void main(String[] args) {

		System.out.println("output:" + cube());
	}
	
	public static int cube () {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter numer:");
		int num=sc.nextInt();
		
		int cube = num*num*num;
		
		return cube;
	}

}
