package homeworkloops;

import java.util.Scanner;

public class LoopsLevel1Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input width: ");
		int y = sc.nextInt();
		System.out.println("Input heigth: ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {

				if (i == 1 || i == x) {
					System.out.print("*");

				} else {
					if (j == 5 || j == y) {
						System.out.print("*");
					} else {
						System.out.print("");
					}

				}
			}
			System.out.println();
			sc.close();
		}

	}

}
