package in.co.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExeceptionEx {
	public static void div(int i, int j) throws FileNotFoundException, EOFException, ArithmeticException {

		int m = j / j;
		PrintWriter printWriter = new PrintWriter("dsa/bcusb/bdsb.txt");
		throw new EOFException("not");

	};

	public static void main(String[] args) {
		try {
			div(10, 0);
		
	}
catch(EOFException|FileNotFoundException|RuntimeException e)
	{
	System.out.println(e.getMessage());

}
}}