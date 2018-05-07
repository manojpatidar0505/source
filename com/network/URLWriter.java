package com.network;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {
public static void main(String[] args) throws IOException {
	URL  url=new URL("http://www.ask.com/web");
	String que="java";
	URLConnection connection=url.openConnection();
	connection.setDoOutput(true);
OutputStreamWriter out=new OutputStreamWriter(connection.getOutputStream());
out.write("q="+que);
out.close();
connection.connect();

InputStreamReader inputStreamReader=new InputStreamReader(connection.getInputStream());
Scanner scanner=new Scanner(inputStreamReader);
System.out.println("URL CONTENTS***************");
while (scanner.hasNext()) {
	String string=scanner.nextLine();
	System.out.println("eds");
	System.out.println(string);
	
}
}
}
