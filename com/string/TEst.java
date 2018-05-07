package com.string;

public class TEst {
	public static void main(String[] args) throws NumberFormatException
	{
		char ch = 'a';
		char ch1 = 'b';

		String s = "5878";
		String str = "12345";
		String str1 = "12345";
		int i = Integer.valueOf(str);
		int j = Integer.valueOf(str1);
		int z = Integer.parseInt(s);

		int l = Integer.valueOf(ch);
		int m = Integer.valueOf(ch1);
		System.out.println(i + j);
		System.out.println(l + m);
		System.out.println(z + i + j);

	}

}
