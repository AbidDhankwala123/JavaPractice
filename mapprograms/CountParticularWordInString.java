package mapprograms;

public class CountParticularWordInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India is my country india";
		
		int count = countParticularWord(str);
		System.out.println(count);
	}
	
	private static int countParticularWord(String str)
	{
		int count = 0;
		
		String strArray[] = str.split(" ");
		
		String word="India";
		
		for(String s:strArray)
		//for(int i=0;i<strArray.length;i++)
		{
			if(word.equalsIgnoreCase(s))
			{
				count++;
			}
		}
		
		return count;
	}

}
