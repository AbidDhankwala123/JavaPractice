package practice;

import java.util.Scanner;

public class CheckCharacterInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str=sc.nextLine();
		System.out.println("Enter character to search in string:");
		char search=sc.next().charAt(0);
		
		if(checkCharacterInString(str, search))
		{
			System.out.println("character found "+search+" in string "+str);
		}
		else
		{
			System.out.println("character not found "+search+" in string "+str);
		}
	}
	
	private static boolean checkCharacterInString(String str,char search)
	{
		boolean characterFound=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == search)
			{
				characterFound=true;
				break;
			}
		}
		return characterFound;
	}

}
