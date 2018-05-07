package in.co.basic;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompaireDate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("10-10-2016");
		Date date2 = sdf.parse("2017-11-11");
		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(date2));
		if (date2.compareTo(date1) > 0) {
			System.out.println("11");

		} else {
			System.out.println("21");

		}
		System.out.println(date1.after(date2));

	}

}
