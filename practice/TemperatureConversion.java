package practice;

import java.util.Scanner;

public class TemperatureConversion {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter fahrenhit: ");
		double fahrenhit = sc.nextDouble();
		
		fahrenhit = (fahrenhit - 32) * 5/9;
		
		System.out.println("fahrenhit: "+fahrenhit);
		
		System.out.println("ENter celsius: ");
		double celsius = sc.nextDouble();
		
		celsius = (celsius * 9/5) + 32;
		
		System.out.println("celsius: "+celsius);
		
		System.out.println("enter choice to check celsius or fahrenhit:");
		char choice=sc.next().charAt(0);
		
		switch (choice) {
		case 'C':
		{
			System.out.println("Enter celsius value: ");
			double celsius2=sc.nextDouble();
			celsius2 = (celsius2 * 9/5) + 32;
			System.out.println("celsius2: "+celsius2);
			break;
		}
			
		case 'F':
			System.out.println("Enter fahrenhit value: ");
			double fahrenhit2=sc.nextDouble();
			fahrenhit2 = (fahrenhit2 - 32) * 5/9;
			System.out.println("fahrenhit2: "+fahrenhit2);
			break;
		default:
			System.out.println("enter wrong choice");
			break;
		}
	}

}
