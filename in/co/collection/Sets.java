package in.co.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String args[]){

	    Set<Integer> A = new HashSet<Integer>();
	    A.addAll(Arrays.asList(2,4,6,8,10));

	    Set<Integer> B = new HashSet<Integer>();
	    B.addAll(Arrays.asList(1,2,3,4,5));
	 
	    Set<Integer> union = new HashSet<Integer>();
	    union.addAll(A);
	    union.addAll(B);

	    Set<Integer> intersection = new HashSet<Integer>();
	    intersection.addAll(A);
	    intersection.retainAll(B);

	    Set<Integer> difference = new HashSet<Integer>();
	    difference.addAll(A);
	    difference.removeAll(B);
	    Set<Integer> complement = new HashSet<Integer>();
	    complement.addAll(B);
	    complement.removeAll(A);

	    System.out.println("A: " + A);
	    System.out.println("B: " + B);
	    System.out.println("union: " + union);
	    System.out.println("intersection: " + intersection);
	    System.out.println("difference: " + difference);
	    System.out.println("complement: " + complement);
	   }

}
