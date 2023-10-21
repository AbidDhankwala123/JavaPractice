package practice;

public class CountSumOfArrayZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6,-2,3,-1,1};
		//int arr[] = {5,1,2,3,-4};
		int count=countSumOfZero(arr);
		System.out.println(count);
	}
	
	private static int countSumOfZero(int arr[])
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum==0)
				{
					count++;
				}
			}
		}
		
		return count;
	}
}
