package practice;

import java.util.ArrayList;
import java.util.List;

public class PrintFreindsNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("Hi ");
		
		for(int i=args.length-1; i>=1; i--)
		{
			System.out.print(args[i]+" ");
		}
		
		System.out.println("and "+args[0]);
	}

}
