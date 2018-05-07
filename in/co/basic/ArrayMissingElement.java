package in.co.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMissingElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 7, 9, 8 };
		int arr1[] = { 6, 7, 8, 9 };

		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					flag = false;
				}
				break;
			}
			if (flag == true) {
				System.out.println(arr[i]);
			}
		}
	}

}
