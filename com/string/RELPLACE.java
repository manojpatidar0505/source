package com.string;

public class RELPLACE {
	public static void main(String[] args) {
		String str="Hello";
		String rev=" ";
		
		
int i=0;
		for(i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
System.out.println(rev);
	}

}
