package comgmailfredjhosnick;

import java.util.Scanner;

public class Conditional2Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double x;
		double y;

		System.out.println("Input the x: ");
		x = sc.nextDouble();
		System.out.println("Input y: ");
		y = sc.nextDouble();

		if (y <= x && y <= -1.5 * x + 10 && y >= 1 / 6 * x) {
			System.out.println("The poin IS in the triangle");

		} else {

			System.out.println("The point is NOT in the triangle");
		}

		sc.close();

	}

}
