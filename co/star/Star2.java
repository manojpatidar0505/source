	package co.star;

public class Star2 {
	public static void star1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

		}
	}

	public static void star2() {
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int j = 5; j >= i; j--) {

				System.out.print("*");
			}
		}
	}

	public static void star3() {
		int i, j, k;

		for (i = 1; i <= 8; i++) {
			for (j = 8; j >= i; j--) {
				System.out.print("   ");
			}

			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print(" * ");

			}
			System.out.println("");
		}
	}

	public static void star4() {

		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star5() {
		int number = 5;
		int count = number - 1;
		for (int k = 1; k <= number; k++) {
			for (int i = 1; i <= count; i++)
				System.out.print(" ");
			count--;
			for (int i = 1; i <= 2 * k - 1; i++)
				System.out.print("*");
			System.out.println();
		}
		count = 1;
		for (int k = 1; k <= number - 1; k++) {
			for (int i = 1; i <= count; i++)
				System.out.print(" ");
			count++;
			for (int i = 1; i <= 2 * (number - k) - 1; i++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("-----------------STAR1----------------------");
		star1();
		System.out.println();
		System.out.println("-----------------END----------------------");
		System.out.println("-----------------STAR2----------------------");
		star2();
		System.out.println();
		System.out.println("-----------------END----------------------");
		System.out.println("-----------------STAR3----------------------");
		star3();
		System.out.println();
		System.out.println("-----------------END----------------------");
		System.out.println("-----------------STAR4----------------------");
		star4();
		System.out.println();
		System.out.println("-----------------END----------------------");
		System.out.println("-----------------STAR5----------------------");
		star5();
	}

}
