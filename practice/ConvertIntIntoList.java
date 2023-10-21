package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ConvertIntIntoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2468;
		int sum=0;
		int rem=0;
		int j=0;
		List<Integer> list=new ArrayList<Integer>();
		
		while(n>0)
		{
			rem=n%10;
			list.add(rem);
			n=n/10;
		}
		System.out.println(list);
		
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		Collections.reverse(list);
		System.out.println(list);
	}

}
