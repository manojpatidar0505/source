package in.co.basic;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a = { 10, 50, 4, 5, 6, 6, 9, 9, 10 };
		int largestNo = a[0];
		int secondNo = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largestNo) {
				secondNo = largestNo;
				
				largestNo = a[i];
					}
			/*if (a[i] < largestNo && a[i] > secondNo) {
				System.out.println("sec"+secondNo);
				secondNo = a[i];
			}*/
		}
		System.out.println(secondNo);
	}

}
