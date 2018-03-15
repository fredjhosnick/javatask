package homeworkarrayslevel1;

public class ArrayLevel1Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First way:");
		int suma = 0;

		int[] arrayone = { 0, 5, 2, 4, 7, 1, 3, 19 };

		for (int i : arrayone) {

			if (i % 2 != 0) {

				suma++;

			}

		}
		System.out.println(suma);

		System.out.println("-----------------------------------");
		System.out.println("Second way:");

		for (int i = 0; i < arrayone.length; i++) {

			if ((arrayone[i] % 2) / 2 != 0) {

				suma++;

			}

		}
		System.out.println(suma);
	}

}
