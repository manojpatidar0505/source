package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TransientEx t = new TransientEx();
		FileOutputStream fos = new FileOutputStream("C:/Users/Manoj/Desktop/tra.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		t.setUser("manoj");
		t.setPwd("patidar");
		oos.writeObject(t);
		FileInputStream fileInputStream = new FileInputStream("C:/Users/Manoj/Desktop/tra.ser");
		ObjectInputStream ooi = new ObjectInputStream(fileInputStream);
		TransientEx ts = (TransientEx) ooi.readObject();
		System.out.println(ts.getUser());
		System.out.println(ts.getPwd());

	}
}
