package com.io;

import java.io.File;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) throws IOException {
	File file=new File("C:/Users/Manoj/Desktop/File.txt");
if(file.exists()){System.out.println("hello");
	System.out.println("File Name   "+file.getName());
	System.out.println("Absolute Path   "+file.getAbsolutePath());
	System.out.println("CanonicalPath    "+file.getCanonicalPath());
	System.out.println("Path   "+file.getPath());
	System.out.println("Absolute Path   "+file.getAbsolutePath());

}
}
}
