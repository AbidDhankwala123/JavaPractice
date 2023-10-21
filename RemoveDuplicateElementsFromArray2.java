import java.util.Arrays;


public class RemoveDuplicateElementsFromArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int arr[] = {1,1,2,2,4,5,3};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr[i]= "+arr[i]);
			for(int j=i+1;j<arr.length-1;j++)
			{
				
				System.out.println("arr[j]= "+arr[j]);
				if(arr[i] == arr[j]);
				{
					
					count++;
					System.out.print("count1= "+count);
				}
				System.out.println();
			}
		}
		System.out.println("count2= "+count);
		
		int resultArray[] = new int[count];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j]);
				{
					resultArray[i] = arr[j];
				}
			}
		}
		
		System.out.print(Arrays.toString(arr)+" ");
	}

}
