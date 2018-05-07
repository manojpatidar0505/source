package in.co.exception;

import java.io.IOException;

public class ExceptionExample {
static int k;
	public static int divide(int i, int j){
		try {

		 k = i / j;
		 return k;

		} catch (ArrayIndexOutOfBoundsException |ArithmeticException| NullPointerException | NumberFormatException e) {
			 System.out.println(e.getMessage().toString()
					 );
			// System.out.println("Catch2----" + e.toString());
		}
		finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			finally {
				
			}
			return k;
		}
		
	}

	

	public static void main(String args[]) {
		System.out.println(divide(10, 0));
	}
}
