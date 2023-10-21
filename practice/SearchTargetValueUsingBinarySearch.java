package practice;

public class SearchTargetValueUsingBinarySearch {

	
	public static void main(String[] args) {
		
		
		int arr[] ={1,4,6,8,9};
		
		int search=9;
		int li=0;
		int hi=arr.length-1;
		while(li<=hi)
		{
			int mi=(li+hi)/2;
			
			if(arr[mi]==search)
			{
				System.out.println("element found at "+mi+" position");
				break;
			}
			else if (arr[mi] < search) {
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
		}
		if(li>hi)
		{
			System.out.println("element not found");
		}
	}

}
