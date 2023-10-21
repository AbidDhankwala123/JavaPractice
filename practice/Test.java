package practice;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str[] ={"abc","def","ghi"};
		
		String s="ghi";
		
		boolean stringFOund=false;
		for(int i=0;i<str.length;i++)
		{
			if(s.equals(str[i]))
			{
				stringFOund=true;
				break;
			}
			
		}
		if(stringFOund)
		{
			System.out.println("exist");
		}
		else
		{
			System.out.println("not exist");
		}
		
	}

}
