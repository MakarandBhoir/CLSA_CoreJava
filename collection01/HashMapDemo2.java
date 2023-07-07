package collection07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		
		map.put("Makarand", 9821225699L);
		map.put("Sachin", 9876543210L);
		map.put("Virat", 8765432109L);
		map.put("Mahendra", 8865432109L);
		
		System.out.println(map);
		
		map.put("Makarand", 1234567890L);
		
		Set<Entry<String, Long>> set =  map.entrySet();
		Iterator<Entry<String, Long>> itr = set.iterator();
		
		while( itr.hasNext() ) {
			Entry<String, Long> entry = itr.next();
			if(entry.getKey().startsWith("M")) {
				System.out.println(entry.getKey().toUpperCase() + " : "+entry.getValue());
			}
			
		}
		
	}
}
