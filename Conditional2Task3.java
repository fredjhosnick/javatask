package comgmailfredjhosnick;

import java.util.Scanner;

public class Conditional2Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;
		int number;

		System.out.println("Input the number: ");
		number = sc.nextInt();

		if ((number / 1000 >= 0) && (number / 1000 <= 9)) {

			a = number / 1000;
			b = number % 1000 / 100;
			c = number % 100 / 10;
			d = number % 10;

			if ((a + b) == (c + d)) {

				System.out.println("The number is happy");

			} else {

				System.out.println("The number is not happy");
			}

		} else {
			System.out.println("the number does not exist");

		}

		sc.close();
	}

}
