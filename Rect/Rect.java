package cds.finals.s1FinalProgs_honors.Rect;
import javax.swing.JOptionPane;

public class Rect 
{
	public Rect()
	{
		String str1 = JOptionPane.showInputDialog("Input Length");
		l = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Input Width");
		w = Integer.parseInt(str2);
	}
	
	public void calcArea()
	{
		a = l * w;
	};
	
	public void calcPerimeter()
	{
		p = 2 * l + 2 * w;
	}
	
	public void calcDiagonal()
	{
		d = Math.sqrt((Math.pow(l, 2) + Math.pow(w, 2)));
	}
	
	public int getLength()
	{
		return l;
	}
	
	public int getWidth()
	{
		return w;
	}
	
	public double getArea()
	{
		return a;
	}
	
	public double getPerimeter()
	{
		return p;
	}
	public double getDiagonal()
	{
		return d;
	}
	
	private int l;
	private int w;
	private double a;
	private double p;
	private double d;
}
