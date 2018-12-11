// leap years:
// 
public class LeapYear {

	public static void yearcalc(int year) {
		//before the Gregorian calendar on October 15, 1582,
		//a leap year is any year if it is divisible by 4
		if (year <= 1582) { 
			if (year % 4 == 0) {
				System.out.println(year + " is a leap year.");
			} else {
				System.out.println(year + " is not a leap year.");
			}
		} else {
			// after October 15, 1582, a leap year is any year not divisible
			// by 100 except divisible by 400
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} else {
				if (year % 4 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			}
		}
	}
}
