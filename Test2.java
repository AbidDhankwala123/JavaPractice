
public class Test2 {

	public static void main(String[] args) {
		
		// enter n elements into an array
		int n = 20;
		
		int arr[]=returnOneArray(n);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		

	}
	
	
	private static int[] returnOneArray(int n)
	{
		int j=0;
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=++j;
		}
		
		return arr;
		
	}

}
