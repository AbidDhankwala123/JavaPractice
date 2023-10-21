package test;

public class AgainCheckPrime {

	
	public static void main(String[] args) {
		
		//check number is prime or not
		int n=19;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		//program to print prime numbers between 1 to 100
		for(int i=1;i<=100;i++)
		{
			int count1=0;
			
			for(int j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					count1++;
					
					
				}
			}
			
			if(count1==2)
			{
				
				System.out.print(i+" ");
			}
		}
	}

}
