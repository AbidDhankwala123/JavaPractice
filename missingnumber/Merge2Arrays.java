package missingnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2Arrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8};
		
		int resultArr[] = mergeUsingList(arr1, arr2);
		System.out.println(Arrays.toString(resultArr));
		
		
		int resultArr2[] = mergeWithoutList(arr1, arr2);
		System.out.println(Arrays.toString(resultArr2));

	}

	private static int[] mergeWithoutList(int[] arr1, int[] arr2) {

		int resArray[] = new int[arr1.length + arr2.length];
		
		for(int i = 0; i< arr1.length; i++) {
			resArray[i] = arr1[i];
		}
		int startIndex = arr1.length;
		for(int i = 0; i< arr2.length; i++) {
			resArray[startIndex++] = arr2[i];
		}
		
		return resArray;
	}

	private static int[] mergeUsingList(int[] arr1, int[] arr2) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		putArrayElementsIntoList(arr1, list);
		putArrayElementsIntoList(arr2, list);
		
		int resArr[] = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			resArr[i] = list.get(i);
		}
		
		return resArr;
	}

	private static void putArrayElementsIntoList(int[] arr, List<Integer> list) {
		for(int i = 0; i< arr.length; i++) {
			list.add(arr[i]);
		}
	}

}
