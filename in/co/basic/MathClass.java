package in.co.basic;

public class MathClass {
public static void main(String[] args) {
	int i=0;
	double d=90;
	float f=2f;
	float f1=2.4f;
	System.out.println(Math.abs(i));
	System.out.println(Math.abs(f));
	System.out.println(Math.sin(d));
	System.out.println(Math.log10(i));
	System.out.println(Math.hypot(f, f1));
	System.out.println(Math.ulp(i));
	System.out.println(Math.round(f1));
	System.out.println(Math.ceil(f1));
}
}
