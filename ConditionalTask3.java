package comgmailfredjhosnick;

import java.util.Scanner;

public class ConditionalTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int year;

		System.out.println("Input the year: ");

		year = sc.nextInt();

		if ((year % 4 == 0) && (year % 100 == 0)) {

			System.out.println("In year " + year + " 365 days");

		} else if (year % 400 != 0) {

			System.out.println("In year " + year + " 365 days");

		} else {
			System.out.println("In year " + year + " 366 days");

		}

		sc.close();

	}

}
