package in.co.basic;

public class IntegerSum {
	public static void sum(int i,int j){
		int sum=0;
		for(int k=i;k<j;k++){
		if(k%7==0){
			sum=sum+k;
		}
		}
		System.out.println(sum);
	}
public static void main(String[] args) {
	sum(0, 15);
}
}
