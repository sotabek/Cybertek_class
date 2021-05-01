package lecture_day25_ArrayCont;

public class ReturnArray {

	public static void main(String[] args) {

		double[] values;

		values = getArray();

		for (double num : values) {

			System.out.print(num + " ");
		}
	}

	public static double[] getArray() {     // whenever this method is called, the array is returned.

		double[] array = { 1.2, 2.3, 4.4, 5.6 };

		return array;

	}

}
