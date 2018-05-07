package in.co.collection;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentSkipListMap;

public class ArrayEx {
	public static void main(String[] args) {
		/*
		 * String [] abc={"Manoj","Rahul","Manish","Varun","Karan","Ganesh"};
		 * for(int i=0;i<abc.length;i++){ System.out.println(abc[i]); }
		 * System.out.println("................."); Arrays.sort(abc); for(int
		 * i=0;i<abc.length;i++){ System.out.println(abc[i]); } String
		 * str=Arrays.toString(abc); System.out.println(str);
		 */
		ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap();
		concurrentSkipListMap.put("a", "b");
		concurrentSkipListMap.put("ab", "c");
		concurrentSkipListMap.put("abc", "b");
		concurrentSkipListMap.put("aa", "b");
		concurrentSkipListMap.put("a", "b");
		System.out.println(concurrentSkipListMap);
		Hashtable hashtable = new Hashtable();
		hashtable.put("a", "b");

		hashtable.put("a", "b");
		hashtable.put("b", "b");
		hashtable.put("z", "b");
		hashtable.put("m", "b");
		hashtable.put("u", "b");
		System.out.println(hashtable);
	}
}
