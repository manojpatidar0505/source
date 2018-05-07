package in.co.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmailTest {
	public static void main(String[] args) throws IOException {
		String email = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		FileReader fileReader = new FileReader("C:/Users/Manoj/Desktop/File.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		while(line!=null){
			if(line.matches(email)){
				
				System.out.println(line);
			}
			line=bufferedReader.readLine();
		}
		fileReader.close();
	}
}
