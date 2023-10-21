package practice;

public class InputMonth {
	
	public static void main(String[] args) {

		String s = "3"; //input, regex
		int i = 0;
		try {
			i = Integer.parseInt(s);
		}catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid input. Please enter number between 1 to 12");
		}
		
		if(i < 1 || i > 12) {
			throw new IllegalArgumentException("Invalid input. Please enter number between 1 to 12");
		}
		
		System.out.println("Valid month : " + i);

	}

}
