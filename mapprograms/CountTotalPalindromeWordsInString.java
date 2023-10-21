package mapprograms;

public class CountTotalPalindromeWordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Madam arora teaches Malayalam";
		
		int count = countPalindromeWords(str);
		System.out.println(count);
	}
	
	private static int countPalindromeWords(String str)
	{
		int count = 0;
		
		String strArray[] = str.split(" ");
		
		for(int i=0;i<strArray.length;i++)
		{
			String word=strArray[i];
			if(checkEachWordIsPalindromeOrNot(word))
			{
				count++;
			}
		}
		
		return count;
	}
	
	private static boolean checkEachWordIsPalindromeOrNot(String str)
	{
		String reverseStr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseStr = reverseStr + str.charAt(i);
		}
		
		return reverseStr.equalsIgnoreCase(str);
	}

}
