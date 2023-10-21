package searchproblems;

public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,3,8,6,9,1};
		foundNumberByLinearSearch(arr);
		/*
		if(foundNumberByLinearSearch(arr))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		*/
	}
	/*
	private static boolean foundNumberByLinearSearch(int arr[])
	{
		int search=10;
		
		for(int i=0;i<arr.length;i++)
		{
			if(search==arr[i])
			{
				return true;
			}
		}
		return false;
	}
	*/
	private static void foundNumberByLinearSearch(int arr[])
	{
		boolean numberFound=false;
		int search=10;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				numberFound=true;
				System.out.println(search+" found at "+i+" position");
				break;
			}
			
		}
		if(!numberFound)
		{
			
			{
				System.out.println(search+" not found");
				
			}
		}
	}
}
