package comgmailfredjhosnick;

import java.util.Scanner;

public class ConditionalTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);

		double number1;
		double number2;
		double number3;
		double number4;
		double max;

		System.out.println("Input the first number: ");
		number1 = con.nextDouble();

		System.out.println("Input the second number: ");
		number2 = con.nextDouble();

		System.out.println("Input the third number: ");
		number3 = con.nextDouble();

		System.out.println("Input the fouth number: ");
		number4 = con.nextDouble();

		max = number1;

		if (number2 > max) {

			max = number2;
		}
		if (number3 > max) {

			max = number3;
		}
		if (number4 > max) {

			max = number4;
		}

		System.out.println("Max is: " + max);

	}

}
