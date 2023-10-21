package missingnumber;

import java.util.ArrayList;
import java.util.List;

public class Merge2Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(40);
		list1.add(20);
		list1.add(10);
		list1.add(30);
		list1.add(50);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(90);
		list2.add(60);
		list2.add(80);
		list2.add(70);
		list2.add(100);
		
		List<Integer> resultList=mergeTwoLists(list1, list2);
		System.out.println(resultList);
	}
	private static List<Integer> mergeTwoLists(List<Integer> list1,List<Integer> list2)
	{
		List<Integer> resultList=new ArrayList<Integer>();
		
		putOneListElementIntoSecondList(list1, resultList);
		putOneListElementIntoSecondList(list2, resultList);
		
		return resultList;
	}
	private static void putOneListElementIntoSecondList(List<Integer> list1,List<Integer> list2)
	{
		for(int i=0;i<list1.size();i++)
		{
			list2.add(list1.get(i));
		}
	}
	
}
