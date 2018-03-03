package comgmailfredjhosnick;

import java.util.Scanner;

public class Conditional2Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int number;
		System.out.println("Input the number: ");
		number = sc.nextInt();

		if ((number / 100000 >= 1) && (number / 100000 <= 9)) {

			f = number / 100000;
			e = number % 100000 / 10000;
			d = number % 10000 / 1000;
			c = number % 1000 / 100;
			b = number % 100 / 10;
			a = number % 10;

			if ((c == d) && (b == e) && (a == f)) {

				System.out.println("This number is palindrome");

			} else {
				System.out.println("This number IS NOT palindrome");
			}

		} else {

			System.out.println("This number is NOT CORRECT");

		}

		sc.close();

	}

}
