import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveDuplicateElementsFromArray {

	
	public static void main(String[] args) {
		
		
		//int arr[] = {2,5,7,8,2,4,5};
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		/*
		for(int i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
			}
		}
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		*/
		
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(1);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i) == list.get(j))
				{
					list.remove(j);
				}
			}
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
