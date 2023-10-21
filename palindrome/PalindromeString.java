package palindrome;

public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = checkStringIsPalindromeOrNot("Madam");
		if(flag)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
	private static boolean checkStringIsPalindromeOrNot(String originalStr)
	{
		String reverseStr = reverseString(originalStr);
		
		return reverseStr.equalsIgnoreCase(originalStr);
	}

	private static String reverseString(String originalStr) {
		String reverseStr="";
		for(int i=originalStr.length()-1;i>=0;i--)
		{
			reverseStr=reverseStr+originalStr.charAt(i);
		}
		return reverseStr;
	}
}
