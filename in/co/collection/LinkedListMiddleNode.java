package in.co.collection;

import java.util.LinkedList;

public class LinkedListMiddleNode {
public static void main(String[] args) {
	LinkedList list=new LinkedList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	list.add("F");
	System.out.println(list);
	int size=list.size();
	int size1=size/2;
	if(size%2==0){
		System.out.println(list.get(size1-1));
	}else{
		System.out.println(list.get(size1));
	}
	
}
}
