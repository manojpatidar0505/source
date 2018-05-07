package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
public static void main(String[] args) throws IOException {
	FileWriter fileWriter = new FileWriter("C:/Users/Manoj/Desktop/File.txt", true);
	BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
	bufferedWriter.write("Manoj Patidar");
	bufferedWriter.write("java ");
	bufferedWriter.write("/n");
	bufferedWriter.write("bs");	

	bufferedWriter.write("Aman Patidar");
	bufferedWriter.write("Raman Patidar");

	bufferedWriter.write("Anil Patidar");

	fileWriter.close();
}
}
