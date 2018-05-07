package in.co.basic;

public class ArrayCopy {
public static void main(String[] args) {
	char ch[]={'a','b','c','d','e','f'};
	char ch1[]=new char[5];
	System.arraycopy(ch, 0,ch1, 0, 5);
System.out.println(ch1);
	
	
}
}
