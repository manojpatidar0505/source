package com.string;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String rev="";
	for ( int i = A.length(); i >= 0; i-- ){
	         rev = rev + A.charAt(i);
	}
	 if(A.equals(rev)){
		 
	     System.out.println("Yes");
	 }
	    else{
	        System.out.println("No");
	    }
	        
	     
	}

}
