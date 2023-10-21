package practice;

import java.util.Arrays;

public class CharacterConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		int ascii = ch;
		System.out.println(ascii); // char to ascii
		
		char ch2='Z';
		int castAscii = (int) ch2;
		System.out.println(castAscii); // char to ascii
		
		int num=66;
		char cc=(char) num;
		System.out.println(cc); // ascii to char
		
		int num2=70;
		System.out.println((char)num2); // ascii to char
		
		//char to ascii
		String str="abid";
		int arr[] = new int[str.length()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = str.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
