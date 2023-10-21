package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[] = sortingLogic();
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static int[] takingInput()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();
		
		System.out.println("Enter elements in array: ");
		int arr[] = new int[arraySize];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	private static int[] sortingLogic()
	{
		int arr[] = takingInput();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
