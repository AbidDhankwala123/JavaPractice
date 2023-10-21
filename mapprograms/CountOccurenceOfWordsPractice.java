package mapprograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfWordsPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "india is my country india is beautiful i live in india";
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String strArray[] = str.split(" ");
		
		for(String s:strArray)
		{
			if(map.containsKey(s))
			{
				int count=map.get(s);
				count++;
				map.put(s, count);
			}
			
			else
			{
				map.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
		
		
	}

}
