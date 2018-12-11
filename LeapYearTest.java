import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("src/Dates.dat");
		Scanner file = new Scanner(reader);
		
		LeapYear.yearcalc(file.nextInt());
		LeapYear.yearcalc(file.nextInt());
		LeapYear.yearcalc(file.nextInt());
		LeapYear.yearcalc(file.nextInt());
		LeapYear.yearcalc(file.nextInt());

		file.close();
	}

}
