package Assignment_8;

public class assignment8_Q16 {

	public static void main(String[] args) {

		// booked on 7/1/2018 - 7/8/2018

		System.out.print("Room can be booked: " + simpleRoomBook(true, 7, 2, 2018));

	}

	public static boolean simpleRoomBook(boolean available, int day, int month, int year) {

		boolean canBook = false;

		if (available == true && year == 2018 && month > 8 && month < 12) {
			canBook = true;
		} else if (available == true && year == 2018 && month < 8 && month >= 1 && day < 7) {
			canBook = true;
		} else {
			canBook = false;
		}
		return canBook;

	}

}
