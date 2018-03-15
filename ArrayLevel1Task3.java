package homeworkarrayslevel1;

import java.util.Arrays;
import java.util.Random;

public class ArrayLevel1Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sc = new Random();
		int[] arrayone = new int[15];
		int[] arraytwo = new int[arrayone.length * 2];

		for (int i = 0; i < arrayone.length; i++) {
			arrayone[i] = sc.nextInt(30);
			arraytwo[i] = arrayone[i];
			arraytwo[i + arrayone.length] = arrayone[i] * 2;
		}

		System.out.print("The first array is:     ");
		System.out.println(Arrays.toString(arrayone));
		System.out.print("The second array is: ");
		System.out.println(Arrays.toString(arraytwo));
	}

}
