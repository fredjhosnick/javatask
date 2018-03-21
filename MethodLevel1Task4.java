package methods;

public class MethodLevel1Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 35, 36, 43, 2, 7 };

		System.out.println(element_in_array(array, 7));
		System.out.println(element_in_array(array, 8));

	}

	public static int element_in_array(int array[], int element) {

		int index = -1;
		for (int i = 0; i < array.length; i++) {

			if (element == array[i]) {
				index = i;
				break;

			}

		}
		return index;

	}

}
