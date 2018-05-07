package in.co.exception;

import java.sql.DatabaseMetaData;

public class TryCatch {
	public static void main(String[] args) throws Exception {
		dad();
	}

	public static void dad() throws Exception {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Caught By Dad");

		}

	}

	public static void mom() throws Exception {
		son();
	}

	public static void son() throws Exception {
		Exception exception = new RuntimeException("Son");

		throw exception;
	}
}
