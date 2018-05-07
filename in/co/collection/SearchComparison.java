package in.co.collection;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class SearchComparison {
	public static void main(String[] args) {
		Date date=new Date();
		
		ArrayList list=new ArrayList();
		for(int i=0;i<1000;i++){
			list.add(i);
		}
		System.out.println(date.getTime());
		LinkedList linkedList=new LinkedList();
		for(int i=0;i<100000;i++){
			linkedList.add(i);
		}
	long d=date.getTime();
		linkedList.get(10000);
		long d1=date.getTime();
		System.out.println(d+"----"+d1);
		System.out.println(d-d1);
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		
	}
	

}
