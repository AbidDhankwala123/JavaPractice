package mapprograms;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersAndPrintUniqueCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabcbb";
		
		Map<Character, Integer> map=countCharacters(str);
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
				
			}
			
		}
		
		System.out.println(map.size());
	}
	private static Map<Character, Integer> countCharacters(String str)
	{
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			if(map.containsKey(c))
			{
				int count=map.get(c);
				count++;
				map.put(c, count);
			}
			else
			{
				map.put(c, 1);
			}
		}
		return map;
	}
}
