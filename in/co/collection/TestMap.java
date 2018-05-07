package in.co.collection;

import java.util.HashMap;
import java.util.HashSet;

public class TestMap {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put(1, "A");
	map.put(50, "z");
	map.put(null, null);
	map.put(null, null);

	map.put("3", "M");
	map.put(11, "z");
	map.put(4, "D");
	map.put(2, "B");
	System.out.println(map);
	System.out.println(map.keySet());
	System.out.println(map.entrySet());
	System.out.println(map.values());
}
}
