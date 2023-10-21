import java.util.ArrayList;
import java.util.List;

import pojo.EvenOddList;


public class Test {

	public static void main(String[] args) {

		int n=20;
		EvenOddList evenOddList = getEvenOddList(n);
		//Print
		List<Integer> evenList=evenOddList.getEvenList();
		List<Integer> oddList=evenOddList.getOddList();
		
		
		//Populate List from 50 to 60
		int start = 50;
		int end = 60;
		populateEvenOddList(start, end, evenList, oddList);
		
		
		start = 90;
		end = 120;
		populateEvenOddList(start, end, evenOddList);
		
		System.out.print("Even values=");
		printList(evenList);
		System.out.println();
		System.out.print("Odd values=");
		printList(oddList);
	}

	private static void populateEvenOddList(int start, int end, EvenOddList evenOddList) {
		
		List<Integer> evenList=evenOddList.getEvenList();
		List<Integer> oddList=evenOddList.getOddList();
		
		/*for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
			else
			{
				oddList.add(i);
			}
		}*/
		populateEvenOddList(start, end, evenList, oddList);
	}

	private static void populateEvenOddList(int start, int end, List<Integer> evenList, List<Integer> oddList) {
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
			else
			{
				oddList.add(i);
			}
		}
		
	}

	private static EvenOddList getEvenOddList(int n) {
		
		EvenOddList eoList=new EvenOddList();
		
		List<Integer> evenList=new ArrayList<Integer>();
		List<Integer> oddList=new ArrayList<Integer>();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
			else
			{
				oddList.add(i);
			}
		}
		
		eoList.setEvenList(evenList);
		eoList.setOddList(oddList);
		
		
		return eoList;
	}
	
	
	private static void printList(List<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i) + ",");
		}
	}
}
