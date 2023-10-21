package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TakeInputNumberAndPrintItInAscendingOrder {

	
	public static void main(String[] args) {
		
		//Using List
		long n=758;
		
		long rem=0;
		long answer=0;
		List<Long> list=new ArrayList<Long>();
		
		while(n>0)
		{
			rem=n%10;
			list.add(rem);
			n=n/10;
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			answer=answer*10+list.get(i);
		}
		System.out.println(answer);
		
		/* Using Array
		int n=759;
		int a=String.valueOf(n).length();
		int arr[] = new int[a];
		int rem=0;
		int answer=0;
		int i=0;
		while(n>0)
		{
			rem=n%10;
			arr[i++]=rem;
			n=n/10;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int numbers:arr)
		{
			answer=answer*10+numbers;
		}
		
		System.out.println(answer);
		
		*/
	}

}
