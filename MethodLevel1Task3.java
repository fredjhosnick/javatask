package methods;

public class MethodLevel1Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drawrectangle(8, 6, '*');

	}

	public static void drawrectangle(int h, int w, char symbol) {

		for (int i = 0; i < h; i++) {

			for (int j = 0; j < h; j++) {

				if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {

					System.out.print(symbol);
				} else {

					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

}
