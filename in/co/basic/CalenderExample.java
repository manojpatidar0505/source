package in.co.basic;

import java.util.Calendar;
import java.util.Date;

public class CalenderExample {
	public static void main(String[] args) {
		Date date=new Date();
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DATE));
	}

}
