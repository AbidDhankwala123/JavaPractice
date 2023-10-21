package practice;

public class PowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		int num=Integer.parseInt(args[0]);//command line argument
		int temp=1;
		for(int i=1;i<=num;i++)
		{
			//System.out.println(Math.pow(2, i));
			
			temp = temp * 2 ;
			
			System.out.println(temp);
		}
		//System.out.println(temp);
		
	}

}
