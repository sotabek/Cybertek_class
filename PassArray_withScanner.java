package lecture_day25_ArrayCont;

import java.util.Scanner;

public class PassArray_withScanner {

	public static void main(String[] args) {

		// create an array
		int[] numbers = new int[4];   // values are assigned in the below method with Scanner

		// pass the array to the getValues method
		getValues(numbers);

		System.out.println("Here are the numbers that you entered");

		// pass the array to showArray method
		showArray(numbers);

	}

	public static void getValues(int[] array) {   // this method is to assign values to the array above

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of " + array.length + " numbers");

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number " + (i + 1) + " :");
			array[i] = sc.nextInt();
		}

	}

	public static void showArray(int[] array) {

		for (int value : array) {

			System.out.println(value);
		}
	}

}
