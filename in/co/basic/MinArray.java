package in.co.basic;

public class MinArray {
	public static void minimum(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		minimum(arr);
	}

}
