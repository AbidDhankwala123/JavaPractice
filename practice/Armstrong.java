package practice;


public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1634;
		
		int numberOfDigits=String.valueOf(number).length();
		
		int sum=0;
		int rem=0;
		
		int temp=number;;
		
		while(number>0)
		{
			rem=number%10;
			sum=sum+getPower(rem,numberOfDigits);
			number=number/10;
		}
		
		if(sum==temp)
		{
			System.out.println(temp+" is an armstrong number");
		}
		else
		{
			System.out.println(temp+" is not an armstrong number");
		}
	}

	private static int getPower(int rem, int numberOfDigits) {
		int temp=1;
		for(int i=0;i<=numberOfDigits;i++)
		{
			temp=temp*rem;
		}
		return temp;
	}

}
