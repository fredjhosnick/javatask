package methods;

public class MethodLevel1Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StringLenght("The best moment "));

	}

	public static int StringLenght(String text) {

		if (text.length() == 0) {

			return 0;
		}
		String[] word = text.split("[ ,.!?-]");

		return word.length;
	}

}
