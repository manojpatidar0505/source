package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransExtenizableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TransExternalizable t = new TransExternalizable();
		FileOutputStream fos = new FileOutputStream("C:/Users/Manoj/Desktop/tra1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		t.setName("manoj");
		t.setPhysics(10);
		t.setMaths(20);
		t.setChemistry(60);
		t.setTemp(45);
		oos.writeObject(t);
		FileInputStream fileInputStream = new FileInputStream("C:/Users/Manoj/Desktop/tra1.ser");
		ObjectInputStream ooi = new ObjectInputStream(fileInputStream);
		TransExternalizable ts = (TransExternalizable) ooi.readObject();
		System.out.println(ts.getName());
		System.out.println(ts.getTemp());
	}
}
