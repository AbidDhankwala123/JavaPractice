package oops;

public class CalculateArea {

public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle();
		
		r1.setDim(3, 4);
		
		double area = r1.getArea();
		
		System.out.println(area);
		
		Rectangle r2 = new Rectangle();
		
		r2.setDim(5, 6);
		
		double area2 = r2.getArea();
		
		System.out.println(area2);
		
		if(area > area2)
		{
			System.out.println("r1 is highest");
		}
		else
		{
			System.out.println("r2 is highest");
		}
	}
}
