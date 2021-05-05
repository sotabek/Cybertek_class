package Assignment_8;

public class assignment8_Q7_NumberPalindrome {

	public static void main(String[] args) {

		isPalindrome();

	}

	public static void isPalindrome() {

		int originalNum = 1001;
		int reverse = 0;
		int num = originalNum;

		do {
			reverse = reverse * 10 + num % 10;
			num = num / 10;

			if (originalNum == reverse) {
				break;
			}
		} while (num > 0);

		System.out.println(originalNum == reverse);

	}

}
