package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="India is my country";
		
		String strArray[]=str.split(" ");
		
		List<String> list=new LinkedList<String>();
		
		for(int i=0;i<strArray.length;i++)
		{
			list.add(strArray[i]);
		}
		System.out.println(list);
		String word = "India";
		
		boolean stringFound=false;
		for(int i=0;i<list.size();i++)
		{
			if(word.equals(list.get(i)))
			{
				stringFound=true;
				break;
			}
		}
		
		if(stringFound)
		{
			list.remove(word);
		}
		else
		{
			list.add(word);
		}
		
		
		/*
		if(list.contains(word))
		{
			list.remove(word);
		}
		
		else
		{
			list.add(word);
		}
		*/
		
		
		System.out.println(list);
	}

}
