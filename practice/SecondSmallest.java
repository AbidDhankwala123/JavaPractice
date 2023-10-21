package practice;

import java.util.Arrays;

public class SecondSmallest {

	
	public static void main(String[] args) {
		

		int arr[] = {4,9,10,7,2,3,1,0};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		
		
		int largest=0;
		int secondLargest=0;
		int thirdLargest=0;
		//int smallest = Integer.MAX_VALUE;
		//int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				//secondSmallest = smallest;
				thirdLargest=secondLargest;
				secondLargest = largest;
				largest = arr[i];
			}
			//else if (arr[i] < secondSmallest) {
				//secondSmallest = arr[i];
			//}
		}
		
		System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(thirdLargest);
		//System.out.println(smallest);
		//System.out.println(secondSmallest);
	}

}
