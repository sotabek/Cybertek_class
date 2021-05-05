package Assignment_8;

public class assignment8_Q11 {

	public static void main(String[] args) {

		System.out.println(c_profit(20,2));

	}

	public static String c_profit(int i, int j) {

		if (j - i > 0) {
			return "profit";
		} else if (j - i < 0) {
			return "loss";
		} else {
			return "no loss";
		}

	}
}
