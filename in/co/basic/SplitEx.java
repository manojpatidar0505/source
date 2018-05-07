package in.co.basic;

public class SplitEx {
public static void main(String[] args) {
	String string="Java";
	String ch[]=string.split("a");
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
}
}
