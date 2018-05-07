package in.co.basic;

public class Factorial {
public static void fact(int n){
	int facto=1;
	for (int i =1 ; i <=n; i++) {
		facto=facto*i;
		
	}
	System.out.println(facto);
}
public static void main(String[] args) {
	fact(0);
}
}
