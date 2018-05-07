package com.io;

import java.io.File;

public class ReadFileList {
	public static void main(String[] args) {
		File file=new File("G:/phone/Pictures/my phone pics");
		String [] fileList=file.list();
		for(String s:fileList){
			System.out.println(s);
			
		}
	}

}
