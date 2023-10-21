package practice;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		
		int num1 = generateRandomNo(6);
		int num2 = generateRandomNo(6);
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2;
		System.out.println(sum);
	}

	private static int generateRandomNo(int n) {
		Random r = new Random();
		int value = r.nextInt(n);
		return value != 0 ? value : generateRandomNo(6);
	}

}
