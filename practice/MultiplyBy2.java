package practice;

import java.util.Arrays;

public class MultiplyBy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,3,4,5};
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = arr[i]*2;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
