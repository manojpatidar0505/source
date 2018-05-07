package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(1234);
		Socket socket=serverSocket.accept();
		DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
		String greeting=dataInputStream.readLine();
		System.out.println(greeting);
		dataOutputStream.writeBytes("Hello client I am Server \n");
		socket.close();
		serverSocket.close();
	}

}
