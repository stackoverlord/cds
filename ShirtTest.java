import java.util.Scanner;

public class ShirtTest {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);

// first shirt
	System.out.println("Testing the first constructor: ");
	System.out.print("Enter the collar size: ");
	int collarSize = console.nextInt();
	System.out.print("Enter the sleeve length: ");
	int sleeveLength = console.nextInt();
	
	Shirt myShirt = new Shirt(collarSize, sleeveLength);
	System.out.println("	collar size = " + myShirt.getCollarSize());
	System.out.println("	sleeve length = " + myShirt.getSleeveLength());
	System.out.println("	material = " + myShirt.getMaterial());

// second shirt
	System.out.println("Testing the second constructor: ");
	System.out.print("Enter the collar size: ");
	collarSize = console.nextInt();
	System.out.print("Enter the sleeve length: ");
	sleeveLength = console.nextInt();
	console.nextLine();
	System.out.print("Enter the material: ");
	String material = console.next();
	
	Shirt myShirt2 = new Shirt(collarSize, sleeveLength, material);
	System.out.println("	collar size = " + myShirt2.getCollarSize());
	System.out.println("	sleeve length = " + myShirt2.getSleeveLength());
	System.out.println("	material = " + myShirt2.getMaterial());
	
	console.close();
	}
}
