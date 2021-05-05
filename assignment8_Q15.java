package Assignment_8;

public class assignment8_Q15 {

	public static void main(String[] args) {

		System.out.println(validateTask(false, 3, 2));

	}

	public static boolean validateTask(boolean listNotEmpty, int id, int task) {

		boolean validationPass = false;

		if (listNotEmpty == true && id == task + 1) {
			validationPass = true;
		} else {
			validationPass = false;
		}
		return validationPass;
	}

}
