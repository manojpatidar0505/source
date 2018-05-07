package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:/Users/Manoj/Desktop/File.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		// System.out.println(line);
		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		fileReader.close();
	}

}
