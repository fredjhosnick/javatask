package homeworkarrayslevel1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLevel1Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the lenght of array:");

		int lenght = sc.nextInt();

		int[] arrayone = new int[lenght];

		for (int i = 0; i < arrayone.length; i++) {
			System.out.println("Input the number in the  position " + i);
			arrayone[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(arrayone));
		sc.close();
	}

}
