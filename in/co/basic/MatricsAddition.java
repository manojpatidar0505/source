package in.co.basic;

public class MatricsAddition {
	public static void main(String[] args) {
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] mat3 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat1[i][j] = i;
				mat2[i][j] = j;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("matrics1");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(mat1[i][j]);
			}
			System.out.println();
		}
		System.out.println("matrics2");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(mat2[i][j]);
			}
			System.out.println();
		}
		System.out.println("Summation");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(mat3[i][j]);
			}
			System.out.println();
		}
	}

}
