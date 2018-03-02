package comgmailfredjhosnick;

import java.util.Scanner;

public class ConditionalTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);

		System.out.println("Input Number of apartament: ");

		double apartament = con.nextInt();

		if (apartament < 1 || apartament > 144) {

			System.out.println("There isn't this apartament");

		} else {

			int floor = (int) (Math.ceil(apartament % 36) / 4);
			int entrance = (int) (Math.ceil(apartament / 36));
			int apartamentnew = (int) (apartament);
			System.out.println(
					"Apartament " + apartamentnew + " is in the entrance " + entrance + " on the floor " + floor);

		}
		con.close();

	}

}
