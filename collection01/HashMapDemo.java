package collection07;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		
		map.put("Makarand", 9821225699L);
		map.put("Sachin", 9876543210L);
		map.put("Virat", 8765432109L);
		map.put("Mahendra", 8865432109L);
		
		System.out.println(map);
		
		map.put("Makarand", 1234567890L);
		
		System.out.println(map);
	}
}
