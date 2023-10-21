package test;

import java.util.ArrayList;
import java.util.List;

public class DisplayPrimeNumberUsingList {

	/**
	 * @param args
	 */
	// Method to fine if a number is Prime or not
	public static void main(String[] args) {

		/*
		int i;

		for(i=2;i<=100;i++)
		{
			boolean primeFound=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					primeFound=false;
					break;
				}

			}
			if (primeFound)
			{
				System.out.print(i + " ");	
			}
		}
	*/	
		
		//boolean result=isPrime(9);
		if(isPrime(5))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		List<Integer> displayPrimeList=populatePrimeNumbers(200);
		for(int i=0;i<displayPrimeList.size();i++)
		{
			System.out.print(displayPrimeList.get(i)+" ");
		}
		
		
	}
	
	
	private static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
		
		
	private static List<Integer> populatePrimeNumbers(int n)
	{
		List<Integer> primeList=new ArrayList<Integer>();
		
		for(int i=1;i<=n;i++)
		{
			boolean isPrime = true;	
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					
					isPrime = false;
					break;
				}
			}
			if(isPrime && i !=1 ) {
				primeList.add(i);
			}
			
		}
		return primeList;
	}
	

}
