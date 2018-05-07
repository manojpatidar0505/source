package in.co.basic;

public class ReverseNumber {
	public static void reverse(int i) {
		int temp = i;
		int sum = 0;
		while (i > 0) {

			sum = sum * 10 + (i % 10);
			i = i / 10;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("Number is palindrome");

		} else {
			System.out.println("not palimndrome");
		}
	}

	public static void main(String[] args) {
		reverse(121);
	}
}
