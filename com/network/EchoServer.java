package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(4444);
		System.out.println("sefrver Started");
		Socket socket = null;
		boolean flag = true;
		while (flag) {
			socket = serverSocket.accept();
			talk(socket);
		}
		serverSocket.close();
		System.out.println("server stopped");
	}
	static void talk(Socket socket) throws IOException{
		PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line=bufferedReader.readLine();
		while (line!=null) {
			System.out.println("Server Received :"+line);
			printWriter.println(line+"......."+line);
			if(line.equals("bye")){
				break;
				
			}line=bufferedReader.readLine();
			
		}
		printWriter.close();
		bufferedReader.close();
		socket.close();
	}
}
