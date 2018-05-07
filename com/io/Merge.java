package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge {
public static void main(String[] args) throws IOException {
	File dir = new File("C:/Users/Manoj/Desktop/IO/");
	String []list=dir.list();
	PrintWriter pw=new PrintWriter("C:/Users/Manoj/Desktop/IO/merge.txt");
	BufferedReader br=null;
	for(String s:list){
		File file=new File(dir, s);
		FileReader fr=new FileReader(file);
		br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
	}
	br.close();
	pw.close();
}
}
