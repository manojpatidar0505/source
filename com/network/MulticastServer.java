package com.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MulticastServer {
	public static void main(String[] args) throws Exception {
		String[] qoutes = { "Bura Mat Dekho", "Bura Mat Suno", "Bura Mat Kaho" };
		DatagramSocket socket = new DatagramSocket(4447);
		InetAddress groupIp = InetAddress.getByName("202.0.202.0");
		int groupPort=3326;
		byte[]msg=null;
		DatagramPacket packet=null;
		for(int i=0;i<qoutes.length;i++){
			msg=qoutes[i].getBytes();
			packet=new DatagramPacket(msg, msg.length,groupIp,groupPort);
			
			socket.send(packet);
		}
socket.close();
	}
}
