package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectOddNumbersInArrayOrListAndCount {

	
	public static void main(String[] args) {
		
		int count=0;
		int arr[] ={0,1,2,3,4,5,6,7,8,9,10};
		
		//List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2!=0)
			{
				//list.add(arr[i]);
				count++;
			}
		}
		/*
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		*/
		System.out.println(count);
		int resultArray[] = new int[count];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2!=0)
			{
				resultArray[k++] = arr[i];
			}
		}
		
		System.out.print(Arrays.toString(resultArray)+" ");
	}

}
