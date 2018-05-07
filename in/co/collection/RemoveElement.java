package in.co.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("A");
		System.out.println(arrayList);
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()){
			if("A".equals(iterator.next())){
				iterator.remove();
			}
			
		}
System.out.println(arrayList);
	}
}
