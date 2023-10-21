package test;

public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(5);
		//printPattern(75);
	}
	
	private static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*
	private static void printPattern(int n)
	{
		for(int i=65;i<=n;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
	*/
}
