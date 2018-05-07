package in.co.collection;

import java.util.Comparator;

import in.co.exception.TryCatch;

public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return -o1.name.compareTo(o2.name);
		
	}
	
	

}
