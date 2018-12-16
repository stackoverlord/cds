package cds.finals.s1FinalProgs_honors.Rect;

public class RectTest 
{
	
	public static void main(String[] args)
	{
		Rect rect = new Rect();
		rect.calcArea();
		rect.calcPerimeter();
		rect.calcDiagonal();
		System.out.println("Entered Values: " + rect.getLength() + " and " + rect.getWidth());
		System.out.println("The area is: " + rect.getArea());
		System.out.println("The perimeter is: " + rect.getPerimeter());
		System.out.printf("The length of a diagonal is: %2.2f%n", rect.getDiagonal());
	}
}
