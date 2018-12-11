import java.util.Scanner;

public class CompoundInterestTest {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the principal: ");
		double p = console.nextDouble();
		
		
		System.out.print("Enter the rate as an integer: ");
		int r = console.nextInt();
		
		System.out.print("Enter the time in years: ");
		int n = console.nextInt();
		
		CompoundInterest moneyBags = new CompoundInterest(p, r, n);
		
		System.out.println("The amount of the investment after " + n + " years is " + moneyBags.getAmount());
		moneyBags.incrementYear();
		System.out.println("The amount of the investment after " + ++n + " years is " + moneyBags.getAmount());
		moneyBags.incrementYear();
		System.out.println("The amount of the investment after " + ++n + " years is " + moneyBags.getAmount());
		moneyBags.incrementYear();
		System.out.println("The amount of the investment after " + ++n + " years is " + moneyBags.getAmount());

	}
}