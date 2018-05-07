package com.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
public static void main(String[] args) throws IOException {
	URL url=new URL("https://www.onlinesbi.com/personal/sbi_home.html");
	System.out.println("Protocol:"+url.getProtocol());
	System.out.println("host:"+url.getHost());
	System.out.println("Port:"+url.getPort());
	System.out.println("File:"+url.getFile());
	InputStream reader=url.openStream();
	Scanner scanner=new Scanner(reader);
	while (scanner.hasNext()) {
		String html = scanner.nextLine();
		System.out.println(html);
		
	}
	scanner.close();
}
}
