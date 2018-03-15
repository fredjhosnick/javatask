package homeworkarrayslevel1;

import java.util.Scanner;

public class ArrayLevel1Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Write the word: ");

		String t = sc.nextLine();

		char[] a = t.toCharArray();
		char s = 'b';
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == s) {
				sum++;

			}

		}

		System.out.println("The count of b is: " + sum);
		sc.close();
	}

}
