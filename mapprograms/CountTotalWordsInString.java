package mapprograms;

public class CountTotalWordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "India is my country India is beautiful is is is is";
		
		int count = countTotalWordsInString(str);
		System.out.println(count);
	}
	
	private static int countTotalWordsInString(String str)
	{
		int count = 0;
		
		String strArray[] = str.split(" ");
		
		for(String s:strArray)
		//for(int i=0;i<strArray.length;i++)
		{
			count++;
		}
		
		return count;
	}
}
