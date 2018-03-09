package homeworkloops;

import java.util.Scanner;

public class LoopsLevel1Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = sc.nextInt();
		int m = number;

		if (4 < number && number < 16) {

			for (int i = number - 1; i >= 1; i--) {

				m = m * i;
			}
			System.out.println("!" + number + " = " + m);
		} else {
			System.out.println("You need a 4<number<16");
			sc.close();
		}

	}

}
