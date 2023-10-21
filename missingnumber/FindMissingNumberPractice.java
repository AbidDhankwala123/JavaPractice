package missingnumber;

import java.util.Arrays;

public class FindMissingNumberPractice {

	
	public static void main(String[] args) {
		
		int n = 5;
		int arr[]={4,1,5,3,2,7};
		//int sum=findSumOfArray(arr);
		//System.out.println("Sum of array: "+sum);
		
		//int missingNumber=findMissingNumberUsingFormula(arr);
		//System.out.println("MissingNumberUsingFormula: "+missingNumber);
		
		//missingNumber=findMissingNumberUsingSort(arr);
		//System.out.println("MissingNumberUsingSort: "+missingNumber);
		
		int missingNumber=findMissingNumberWithoutUsingSort(arr);
		System.out.println("MissingNumberWithoutUsingSort: "+missingNumber);
	}
	
	private static int findSumOfArray(int arr[])
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	

	private static int findMissingNumberUsingFormula(int arr[])
	{
		int missingNumber=0;
		
		int n=5;
		
		int sum=findSumOfArray(arr);
		
		int actualSum=n*(n+1)/2;
		
		System.out.println("AgainFindMissingNumberUsingFormula: "+sum);
		
		System.out.println("FindActualSum: "+actualSum);
		
		missingNumber=actualSum-sum;
		
		
		
		
		return missingNumber;
	}
	
	
	private static int findMissingNumberUsingSort(int arr[])
	{
		
		int missingNumber=0;
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1]-arr[i]!=1)
			{
				missingNumber=arr[i]+1;
				break;
			}
		}
		
		return missingNumber;
		
	}
	
	private static int findMissingNumberWithoutUsingSort(int arr[])
	{
		int missingNumber=0;//{4,1,5,3,2,7}
		
		for(int i=0;i<arr.length;i++)
		{
			boolean missingNumberFound = true;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] + 1 == arr[j]) {
					missingNumberFound = false;
					break;
				}
			}
			if(missingNumberFound) {
				missingNumber = arr[i]+1;
				break;
			}
			
		}
		
		return missingNumber;
	}
	
	
}
