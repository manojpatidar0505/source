package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Split {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("C:/Users/Manoj/Desktop/IO/File.txt");
		FileOutputStream fout=null;
		int c=fin.read();
		int i=0;
		while(c!=-1){
			int length=0;
			fout=new FileOutputStream("C:/Users/Manoj/Desktop/IO/File"+i+".txt");
			while(c!=-1&&length<10){
				fout.write(c);
				c=fin.read();
				length++;
			}
			i++;
		}
		fout.close();
		fin.close();
	}

}
