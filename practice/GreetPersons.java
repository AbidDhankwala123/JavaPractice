package practice;

public class GreetPersons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abid,salman,sajid,naresh,umar,haresh";
		String strArray[] =str.split(",");
		for(String s:strArray)
		{
			if(s.equals("naresh") || s.equals("haresh"))
			{
				System.out.println("Welcome "+s);
			}
		}
		String str2[]={"abid","salman","sajid","haresh","umar","naresh"};
		for(int i=0;i<str2.length;i++)
		{
			if(str2[i]=="salman" || str2[i].equals("umar"))
			{
				System.out.println("Welcome "+str2[i]+" at "+i);
			}
		}
	}

}
