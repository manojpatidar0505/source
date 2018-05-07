package com.string;


public class ReverseString {

	public static void main(String[] args) {
		String a="HEllo";
		for(char ch: a.toCharArray()) {
		       if(ch >= 'A' && ch <= 'Z')
		          ch += 'a' - 'A';
		       System.out.print(ch);
		    }
		System.out.println("---------------");
		for(char ch: a.toCharArray()) {
		       if(ch >= 'a' && ch <= 'z')
		          ch += 'A' + 'a';
		       System.out.print(ch);
		    }
}
}