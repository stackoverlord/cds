package cds.finals.s1FinalProgs_honors.DigExtrac;
import javax.swing.JOptionPane;

public class DigExtrac 
{
	private String digits;
	private String firstNum;
	private String fifthNum;
	private String secondNum;
	private String thirdNum;
	private String fourthNum;

	public DigExtrac()
	{
		digits = JOptionPane.showInputDialog("Input 5 Digit Number");
	}
	public void calculate()
	{
		fifthNum = digits.substring(4, 5);
		fourthNum = digits.substring(3, 4);
		thirdNum = digits.substring(2, 3);
		secondNum = digits.substring(1, 2);
		firstNum = digits.substring(0, 1);
	}
	public void print()
	{
		System.out.println("Entered 5-Digit Number: " + digits);
		System.out.println("Reverse Order: " + fifthNum + " " + fourthNum + " " + thirdNum + " " + secondNum + " " + firstNum);
	}
	
}
