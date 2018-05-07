package in.co.basic;

public class Fabonacci {
	public static void fabo(int i){
		int n3=0;
		int sum=0;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int m=2;m<=i;m++){
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		fabo(5);
	}

}
