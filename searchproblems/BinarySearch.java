package searchproblems;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,7,10,25,30,48,50};
		
		numberToSearch(arr);
		
		
	}
	private static void numberToSearch(int arr[])
	{
		int searchElement = 48;
		
		int lowerIndex = 0;
		
		int higherIndex = arr.length-1;
		
		while(lowerIndex <= higherIndex)
		{
			int middleIndex = (lowerIndex+higherIndex)/2;
			
			
			if(arr[middleIndex] == searchElement)
			{
				System.out.println("element found at "+middleIndex+" position");
				break;
			}
			else if(arr[middleIndex] < searchElement)
			{
				lowerIndex = middleIndex+1;
			}
			else
			{
				higherIndex = middleIndex-1;
			}
		}
		
		if(lowerIndex > higherIndex)
		{
			System.out.println("element not found");
		}
	}

}
