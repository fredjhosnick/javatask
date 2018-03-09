package homeworkloops;

import java.util.Scanner;

public class LoopsLevel1Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the number: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= number; j++) {

				if (j % 2 == 0) {

					System.out.print("+++");

				} else {

					System.out.print("***");
				}
			}
			System.out.println();
		}

	}

}
