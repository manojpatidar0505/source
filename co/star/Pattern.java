package co.star;

public class Pattern {
public static void main(String[] args) {
	int count=5;
	for(int i=1;i<=5;i++){
		for(int j=5;j>=i;j--){
			System.out.print(count);
		}
		count--;
		System.out.println();
	}
}
}
