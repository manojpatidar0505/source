package in.co.basic;

public class Array2D {
	public static void array() {
		int[][] arr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = i + j;
			}
		}
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		array();
	}

}
