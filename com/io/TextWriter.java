package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("C:/Users/Manoj/Desktop/File.txt", true);
		fileWriter.write("Manoj Patidar");
		fileWriter.write("java ");
		fileWriter.write("/n");
		fileWriter.write("c");

		fileWriter.write("Aman Patidar");
		fileWriter.write("Raman Patidar");

		fileWriter.write("Anil Patidar");

		fileWriter.close();
	}
}
