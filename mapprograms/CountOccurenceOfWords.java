package mapprograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfWords {
	
	public static void main(String[] args) {
		
		String str = "india is my country india is beautiful i live in india";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String[] strArray = str.split(" ");
		
		/*for(int i=0; i< strArray.length; i++) {
			
		}*/
		
		for(String s : strArray) {
			
			if(map.containsKey(s)) {
				// if already in map, increment its count
				int count = map.get(s);
				count++;
				map.put(s, count);
			} else {
				//not in map, means new word
				// add in map
				map.put(s, 1);
			}
			
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}
		
	}

}
