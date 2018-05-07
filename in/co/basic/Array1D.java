package in.co.basic;

public class Array1D {
public static void main(String[] args) {
	int arr[]=new int[5];
	for(int i=0;i<5;i++){
		arr[i]=i;
	}
	for(int j=0;j<arr.length;j++){
		System.out.println(arr[j]);
	}
}
}
