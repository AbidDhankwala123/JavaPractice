package practice;

import java.util.Arrays;


public class CommonValuesInStringArray {

	
	public static void main(String[] args) {

		String arr1[] = {"abc","def","ghi"};
		String arr2[] = {"xyz","ghi","abc", "monop"};
		//output -> ghi, abc
		
		int countCommonWords = 0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					countCommonWords++;
				}
			}
		}
		
		System.out.println(countCommonWords);
		
		String resultArray[] = new String[countCommonWords];
		
		int k=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					resultArray[k++] = arr1[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(resultArray));
	}
}
