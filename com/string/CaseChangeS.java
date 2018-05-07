package com.string;

public class CaseChangeS {
	public static String smallString(String str) {

		String words[] = str.split("\\s");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return (capitalizeWord.trim());
	}
	public static String reverseStringAtPosition(String str){
		String words[]=str.split("\\s");
	
		for(int i=0;i<=words.length-1;i++){
			String letter=words[i];
			//System.out.println(letter.length());
			String www="";
			for(int j=letter.length()-1;j>=0;j--){
				www=www+letter.charAt(j);
			}
			System.out.print(www+" ");
			
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(smallString("i love india"));
reverseStringAtPosition("i love india");
	}

}
