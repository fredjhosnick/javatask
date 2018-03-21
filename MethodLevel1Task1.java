package methods;

public class MethodLevel1Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 39, 14, 18, 34, 20 };

		System.out.println("The max index in array is: " + max(array));

	}

	public static int max(int array[]) {

		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {

				max = array[i];
			}

		}

		return max;
	}

}
