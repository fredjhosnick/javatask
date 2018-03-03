package comgmailfredjhosnick;

import java.util.Scanner;

public class Conditional2Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r;
		r = 4;
		System.out.println("Input x: ");
		double x = sc.nextDouble();
		System.out.println("Input y: ");
		double y = sc.nextDouble();

		if (x * x + y * y <= r * r) {

			System.out.println("The point is in the circle");

		} else {
			System.out.println("The point is not  in the circle");
		}

		sc.close();

	}

}
