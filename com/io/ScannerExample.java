package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) throws IOException {
	FileReader fileReader=new FileReader("C:/Users/Manoj/Desktop/File.txt");
	Scanner scanner=new Scanner(fileReader);
	while(scanner.hasNext()){

		System.out.println(scanner.nextLine());
	}
	fileReader.close();
}
}
