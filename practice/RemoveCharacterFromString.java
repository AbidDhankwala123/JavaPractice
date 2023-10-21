package practice;

public class RemoveCharacterFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India ! is ! my ! country !";
		String newStr=removeCharacter(str);
		System.out.println(newStr);
		
	}
	
	private static String removeCharacter(String str)
	{
		String reverseStr="";
		//char c='!';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != '!')
			{
				reverseStr = reverseStr+str.charAt(i);
			}
		}
		
		return reverseStr;
	}

}
