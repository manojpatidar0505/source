package in.co.basic;

public class HarmonicSeries {
	public static void main(String[] args) {

		/*int n = 7;
		double sum = 0;
		for (int i = 1; i <= 7; i++) {
			sum = sum + (double) 1 / i;

		}
		System.out.println("Harmonic No :: " + sum);*/

		System.out.println("*********************************");
		
		String series = "1";
		double sum = 0;
		for (int i = 1; i <= 7; i++) {
			series = series + "+" + "(1/" + i + ")";
			 sum = sum + (double) 1 / i;
		}
		System.out.println(series);
		System.out.println(sum);
	}                             

}


