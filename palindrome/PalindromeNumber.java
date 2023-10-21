package palindrome;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		

		int n=323;
		if(checkPalindromeNumber(n) && checkPrimeNumber(n))
		{
			System.out.println("number is both palindrome and prime");
		}
		else
		{
			System.out.println("number is nooott palindrome and prime");
		}
	}
	
	private static boolean checkPalindromeNumber(int n)
	{
		int sum=0;
		int rem=0;
		int temp = n;

		while (n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}

		return (temp==sum);
	}
	
	private static boolean checkPrimeNumber(int n)
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
}
