package in.co.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class HashSetEx {
	public static void main(String[] args) {
		/*
		 * Queue hashSet=new PriorityQueue(); hashSet.add("a");
		 * hashSet.add("a"); hashSet.add("A"); hashSet.add("abc");
		 * //hashSet.add(1); //hashSet.add(null);
		 * //System.out.println(hashSet.add(10));
		 * System.out.println(hashSet.offer());
		 * 
		 * Iterator iterator=hashSet.iterator(); while (iterator.hasNext()) {
		 * System.out.println("hash"+iterator.next());
		 * 
		 * }
		 * 
		 * System.out.println(hashSet);
		 * 
		 */
		/*
		 * PriorityQueue p = new PriorityQueue();
		 * 
		 * p.add(1);
		 * 
		 * p.add(2.3);
		 * 
		 * p.add(6);
		 * 
		 * p.add('A');
		 * 
		 * System.out.println(p);}
		 */
		// LinkedHashSet set=new LinkedHashSet();
		// HashSet set=new HashSet();
		// TreeSet set=new TreeSet();
		//HashMap map=new HashMap();
		Hashtable map=new Hashtable();
		map.put(1, 1);
		map.put("1", "1");/*map.put("2", "2");
		map.put("1", "3");
		*/
		
		/*System.out.println(map.put(null, 2));
		System.out.println(map.put(null, 3));
		System.out.println(map.put(null, 4));
		System.out.println(map.put(null, 5));
		System.out.println(map.put(null, 6));
		*/
		/*
		 * set.add("a"); System.out.println(set.add(null));
		 * System.out.println(set.add("a"));
		 */System.out.println(map);
	}
}
