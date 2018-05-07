package in.co.basic;

public class Random {
	public static void main(String[] args) {
		int count = 0;
		while (count != 5) {
			int num = (int) (Math.random() * 300);
			if (num > 200 && num < 300) {
				System.out.println(num);
			
				count++;
			} 
		}

	}

}
