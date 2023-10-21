package practice;

public class SquareRootUsingBinarySearch {

	
	public static void main(String[] args) {
		
		int n=36;
		checkSquareRoot(n);
		checkSquareRootUsingBinarySearch(n);
	}
	
	private static boolean checkSquareRoot(int n)
	{
		boolean squareRootFound=false;
		for(int i=0;i<n;i++)
		{
			if(i*i==n)
			{
				
				squareRootFound=true;
				System.out.println("Square root of "+n+" is "+i);
				break;
			}
			
		}
		
		if(squareRootFound==false)
		{
			
			System.out.println("Square root of "+n+" is not available");
			
		}
		return squareRootFound;
	}
	
	private static void checkSquareRootUsingBinarySearch(int n)
	{
			int lowerIndex=1;
			int higherIndex=n;
			
			while(lowerIndex<=higherIndex)
			{
				int middleIndex=(lowerIndex+higherIndex)/2;
				
				if(middleIndex*middleIndex==n)
				{
					System.out.println("sq. rt. found "+middleIndex);
					break;
				}
				else if(middleIndex*middleIndex>n)
				{
					higherIndex=middleIndex-1;
				}
				else
				{
					lowerIndex=middleIndex+1;
				}
				
			}
		if(lowerIndex>higherIndex)
		{
			System.out.println("sq. rt. not found");
		}
	}
}
