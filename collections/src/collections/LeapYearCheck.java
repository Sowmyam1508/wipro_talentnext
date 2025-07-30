package collections;

import java.time.Year;

public class LeapYearCheck {
	public static void main(String[] args) {
		int currentYear = Year.now().getValue();
		boolean isLeap = (currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0);
		System.out.println("Current year: " + currentYear);
		if (isLeap) {
			System.out.println(currentYear + " is a Leap Year.");
		} else {
			System.out.println(currentYear + " is Not a Leap Year.");
		}
	}
}
