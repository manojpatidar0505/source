package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:/Users/Manoj/Desktop/File.txt");
		int ch=fileReader.read();
		char chr;
		while(ch!=-1){
			chr=(char)ch;
			System.out.print(chr);
			ch=fileReader.read();
		}
		fileReader.close();
	}
}
