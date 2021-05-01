package lecture_day25_ArrayCont;

public class PassElement {

	public static void main(String[] args) {

		int[] numbers = { 5, 10, 15, 20, 50, 30 };

		for (int value : numbers) {

			showValue(value);  // I am passing the value to the method below as an argument
		}

	}

	public static void showValue(int n) {  // n is getting the value from the above method value

		System.out.print(n + " ");

	}

}
