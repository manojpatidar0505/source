package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestFirstNameLastName {
public static void main(String[] args) {
	FirstNameLastName firstNameLastName=new FirstNameLastName();
	ArrayList arrayList=new ArrayList();
	arrayList.add(new FirstNameLastName("anoj","atidar"));
	arrayList.add(new FirstNameLastName("Akash","Verma"));
	Collections.sort(arrayList,firstNameLastName);
	for(Object o:arrayList){
		System.out.println(o);
	}
	

}
}
