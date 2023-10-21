package missingnumber;

import java.util.Arrays;

public class FIndMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,5,4,2,3,7};
		int missingNumber = searchNumberUsingSort(arr);
		System.out.println(missingNumber);
		
		
		
		
		int sum = findSum(arr);
		
		//Math formula
		int n = 7;
		int actualSum = n*(n+1)/2;
		
		System.out.println(sum);
		System.out.println(actualSum);
		
		missingNumber = actualSum - sum;
		System.out.println(missingNumber);
	}

	private static int findSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}

	private static int searchNumberUsingSort(int arr[])
	{
		Arrays.sort(arr);
		
		int missingNumber=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]+1 != arr[i+1])
			{
				missingNumber=arr[i+1] - 1;
				break;
			}
			
		}
		return missingNumber;
		
	}

}
