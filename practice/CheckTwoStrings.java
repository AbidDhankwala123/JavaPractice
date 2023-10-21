package practice;

public class CheckTwoStrings {

	
	public static void main(String[] args) {
		
		String s1 = "abid";
		String s2 = "abcd";
		
		System.out.println(checkString(s1, s2));
		
		

	}
	
	private static int checkString(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return -1;
		}
		else if (s1.equals(s2)) {
			return 0;
		}
		else
		{
			
			for(int i=0;i<s1.length();i++)
			{
				
				
					if(s1.charAt(i) != s2.charAt(i))
					{
						return i;
					}
				
			}
			
		}
		return -1;
	}

}
