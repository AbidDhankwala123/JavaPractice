package practice;

import java.util.Random;

public class RandomNumber2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		int a=r.nextInt(6);
		System.out.println(a);
		int b=r.nextInt(6);
		System.out.println(b);
		if(a!=0 && b!=0)
		{
			int sum=a+b;
			System.out.println(sum);
		}
		
		int max=6,min=1;
        System.out.println("Generated numbers are within "+min+" to "+max);
        int c=r.nextInt(max - min + 1) + min;
        System.out.println(c);
        int d=r.nextInt(max - min + 1) + min;
        System.out.println(d);
        int sum2=c+d;
        System.out.println(sum2);
        //System.out.println(r.nextInt(max - min + 1) + min);
        //System.out.println(r.nextInt(max - min + 1) + min);
		
	}

}
