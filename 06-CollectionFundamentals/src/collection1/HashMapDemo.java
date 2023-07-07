package collection1;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		
		map.put("Makarand", 9821225699L);
		map.put("Sachin", 9876543210L);
		map.put("Virat", 8765432109L);
		map.put("Mahendra", 8865432109L);
		
		map.put("Makarand1", 9821225699L);
		map.put("Sachin1", 9876543210L);
		map.put("Virat1", 8765432109L);
		map.put("Mahendra1", 8865432109L);
		
		map.put("Makarand2", 9821225699L);
		map.put("Sachin2", 9876543210L);
		map.put("Virat2", 8765432109L);
		map.put("Mahendra2", 8865432109L);
		
		map.put("Makarand3", 9821225699L);
		map.put("Sachin3", 9876543210L);
		map.put("Virat3", 8765432109L);
		map.put("Mahendra3", 8865432109L);
		
		map.put("Makarand4", 9821225699L);
		System.out.println(map);
		
		map.put("Makarand", 1234567890L);
		
		System.out.println(map);
	}
}