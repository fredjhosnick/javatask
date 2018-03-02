package comgmailfredjhosnick;

import java.util.Scanner;

public class ConditionalTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input first side:");
		double a = sc.nextDouble();
		System.out.println("Input second side:");
		double b = sc.nextDouble();
		System.out.println("Input third side:");
		double c = sc.nextDouble();

		if (a + b > c && b + c > a && c + a > b) {

			System.out.println("This is a triangle");

		} else {

			System.out.println("This is not a triangle");
		}

		sc.close();
	}

}
