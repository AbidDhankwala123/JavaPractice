package practice;

public class SumOfMultiplesOf3And5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
