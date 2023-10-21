package missingnumber;

import java.util.ArrayList;
import java.util.List;


public class Merge2ArraysPractice {

	public static void main(String[] args) {
		
		int arr1[] = {50,30,10,80,100};
		int arr2[] = {70,40,20,60,90};
		
		//int resultArray[] = printInDescendingOrder(arr1, arr2);
		int resultArray[] = mergeWithoutList(arr1, arr2);
		for(int i=0;i<resultArray.length;i++)
		{
			//Arrays.sort(resultArray,Collections.reverseOrder()); //Integer wrapper class will be used instead int primitive type
			System.out.print(resultArray[i]+" ");
		}
		System.out.println();
		
		
		int resultArray2[] = mergeUsingList(arr1, arr2);
		for(int i=0;i<resultArray2.length;i++)
		{
			System.out.print(resultArray2[i]+" ");
		}
	}
	
	private static int[] mergeWithoutList(int[] arr1,int[] arr2)
	{
		int resultArray[] = new int[arr1.length + arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			resultArray[i]=arr1[i];
		}
		
		int startIndex=arr1.length;
		
		for(int i=0;i<arr2.length;i++)
		{
			resultArray[startIndex++] = arr2[i];
		}
		return resultArray;
	}
	
	private static int[] mergeUsingList(int arr1[],int arr2[])
	{
		
		List<Integer> list = new ArrayList<Integer>();
		
		putArrayElementsIntoList(arr1, list);
		putArrayElementsIntoList(arr2, list);
		
		int resultArray[] = new int[list.size()];
		{
			for(int i=0;i<list.size();i++)
			{
				resultArray[i] = list.get(i);
			}
		}
		return resultArray;
		
	}
	
	
	private static void putArrayElementsIntoList(int arr[], List<Integer> list)
	
	{
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
	}
	
	/*
	private static int[] printInDescendingOrder(int[] arr1,int[] arr2)
	{
		int resultArray[] = mergeWithoutList(arr1, arr2);
		int temp=0;
		
		for(int i=0;i<resultArray.length;i++)
		{
			for(int j=i+1;j<resultArray.length;j++)
			{
				if(resultArray[i]<resultArray[j])
				{
					temp=resultArray[i];
					resultArray[i]=resultArray[j];
					resultArray[j]=temp;
					
				}
			}
		}
	
		return resultArray;
	*/
	
}
