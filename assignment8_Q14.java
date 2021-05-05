package Assignment_8;

public class assignment8_Q14 {

	public static void main(String[] args) {

		System.out.print(threeLocks(true, false, true));

	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {

		boolean i = false;

		if (a == true && b == true || c == true) {

			i = true;
		} else {
			i = false;
		}

		return i;

	}

}
