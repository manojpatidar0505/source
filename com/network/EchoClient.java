package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket socket=new Socket("localhost", 4444);
	PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String line=reader.readLine();
	while (line!=null) {
		printWriter.println(line);
		System.err.println("Echo...."+bufferedReader.readLine());
		if("bye".equals(line)){
			break;
			
		}
		line=reader.readLine();
		
	}
	printWriter.close();
	bufferedReader.close();reader.close();socket.close();
}
}
