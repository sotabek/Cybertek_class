package Assignment_8;

public class assignment8_Q12 {

	public static void main(String[] args) {

		System.out.println(hamletQuote(true, true));

	}

	public static boolean hamletQuote(boolean i, boolean j) {

		boolean a;

		if (i == true && j == false) {
			a = true;
		} else if (i == false && j == true) {
			a = true;
		} else if (i == true && j == true) {
			a = true;
		} else {
			a = false;
		}
		return a;
	}

}
