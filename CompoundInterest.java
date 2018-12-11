
import java.math.*;

public class CompoundInterest {


// variables
	private double p; // principal
	private double r; // rate in whole percents
	private int n; // number of years

public CompoundInterest	(double pP, int pR, int pN ) {
	p = pP;
	r = (double)(pR)/100.00; // cast int to double before dividing 
	n = pN;
}
		
// methods 
    // returns a String that evaluates to a = p * (1+r)^n 
	public String getAmount() {
		double a; 
		a = p * Math.pow(1 + r, (double)n); // must cast n to double b/c .pow takes 2 doubles
	    String str = String.format("$%1.2f", a); 
	    return str;
	}
	
	// adds 1 to the instance field n
	public void incrementYear() {
		n++;
	}
	
}
