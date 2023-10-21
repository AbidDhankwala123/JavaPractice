package practice;

public class Smallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//int smallest = Integer.MAX_VALUE;
		
		int arr[] = {2,7,19,45,6,55,3,1};
		
		int smallest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		*/
		
		int arr[] = {2,7,19,45,6,55,3,1};
		int smallest=0;
		for(int i=0;i<arr.length;i++)
		{
			smallest=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < smallest)
				{
					smallest=arr[j];
				}
			}
			
		}
		System.out.println(smallest);
	}

}
