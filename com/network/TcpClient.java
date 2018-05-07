package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("192.168.43.54", 1234);
		DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
		
			dataOutputStream.writeBytes("Hello Server Sunil Barfa \n");
		
		
		String greeting = dataInputStream.readLine();
		System.out.println(greeting);
		client.close();
	}
}
