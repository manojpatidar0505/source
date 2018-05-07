package in.co.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm//dd/yyyy");
		/*String s=simpleDateFormat.format("25/11/2017");
		System.out.println(s);
		*/Date d=simpleDateFormat.parse("25/11/2017");
		System.out.println(d);
	}

}
