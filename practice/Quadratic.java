package practice;

public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=4,c=3;
		
		double delta = b*b - 4*a*c;
		System.out.println("delta: "+delta);
		
		double root1x = (-b + Math.sqrt(delta))/(2*a);
		System.out.println("root 1 of x: "+root1x);
		
		double root2x = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("root 2 of x: "+root2x);
		
	}

}
