package in.co.basic;

import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

public class Armstrong {
	public static void arm(int i) {
		int mm = i;
		int temp = i;
		int num = 0;
		int sum = 0;
		int digit = 0;
		while (temp > 0) {
			digit++;
			temp = temp / 10;
		}

		while (i > 0) {
			num = i % 10;
			i = i / 10;
			sum = sum + power(num, digit);
			// System.out.println(sum);
		}
		if (sum == mm) {
			System.out.println("Number Is Armstrong : "+mm);
		} else {
			System.out.println("Number  Is Not Armstrong : "+mm);
		}

	}

	public static int power(int n, int r) {
		int c, p = 1;

		for (c = 1; c <= r; c++)
			p = p * n;

		return p;
	}

	public static void main(String[] args) {
		System.out.println("Enter A no");
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		arm(input);
	}
}
