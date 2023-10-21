package string;

import java.util.ArrayList;
import java.util.List;

public class StringPrograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		String str="Today its very hot";
		String[] newStr = str.split(" ");
		
		for(int i=newStr.length-1;i>=0;i--)
		{
			System.out.println(newStr[i]);
		}
		
		*/
		
		
		List<String> printWords=collectWords("India is my country");
		
		for(int i=0;i<printWords.size();i++)
		{
			System.out.println(printWords.get(i));
		}
		
	}
	
	/*private static List<String> collectWords(String str)
	{
		List<String> words = new ArrayList<String>();
		
		String[] newStr=str.split(" ");
		
		for(int i=0;i<newStr.length;i++)
		{
			words.add(newStr[i]);
		}
		
		return words;
		
		
	}*/
	
	
	
	private static List<String> collectWords(String str)
	{
		List<String> collectWordsInList = new ArrayList<String>();
		
		String newString="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				collectWordsInList.add(newString);
				newString="";
			}
			
			else
			{
				newString = newString + str.charAt(i);
			}
			
			if(i==str.length()-1)
			{
				collectWordsInList.add(newString);
				newString="";
			}
		}
		
		return collectWordsInList;
	}
}
