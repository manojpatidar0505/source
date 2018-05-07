package in.co.collection;

import java.util.ArrayList;

public class ArrayListEx1 {
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList();
	arrayList.add("A");
	arrayList.add(10);
	arrayList.add("A");
	arrayList.add(null);
	System.out.println("1******"+arrayList);
	arrayList.remove(2);
	System.out.println("2*******"+arrayList);
	arrayList.add(2,"m");
	arrayList.add("n");
	System.out.println("3********"+arrayList);
}
}
