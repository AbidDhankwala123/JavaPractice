package test;

public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=70;
		
		for(int i=n;i>=65;i--)
		{
			
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			
			for(int l=i;l>65;l--)
			{
				System.out.print((char)(l-1));
			}
			System.out.println();
			
			
		}
		int n1=5;
		for(int i=1;i<=n1;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n1;j>=i;j--)
			{
				System.out.print("*");
			}
			
			for(int l=i;l<n1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
