package mapprograms;

import java.util.HashMap;
import java.util.Map;

public class PairingDummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abbccddaeeeef";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
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
		
		boolean characterFound = false;
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()%2 != 0)
			{
				
				characterFound = true;
				System.out.println("Pairing is not possible");
				break;
				
			}
		}
		
		if(!characterFound)
		{
			System.out.println("Pairing is possible");
		}
	}

}
