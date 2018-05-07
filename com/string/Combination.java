package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Combination {
	public static void main(String args[]) throws IOException {
		Combination call = new Combination();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String : ");
		String n = br.readLine();
		call.comb("", n);
	}

	public void comb(String beg, String end) throws IOException {
		if (end.length() <= 1) {
			System.out.println(beg + end);
		} else {
			for (int i = 0; i < end.length(); i++) {
				String n = end.substring(0, i) + end.substring(i + 1);
				comb(beg + end.charAt(i), n);
			}
		}
	}
}
