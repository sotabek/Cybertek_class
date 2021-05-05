package Assignment_8;

public class assignment8_Q17 {

	public static void main(String[] args) {

		System.out.println("I have a drink: " + getThunderBlazz(false, true, 9, 7, 3));

	}

	public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2,
			int ingredient3) {

		boolean haveDrink = false;

		if (available == true || gift == true) {
			haveDrink = true;

		} else if ((ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3)
				|| (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2)) {
			haveDrink = true;
		} else {
			haveDrink = false;
		}
		return haveDrink;
	}

}
