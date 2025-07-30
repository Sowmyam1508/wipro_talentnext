package collections;

import java.util.Iterator;
import java.util.Vector;

public class StringVectorDemo {
	public static void printAll(Vector<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		Vector<String> stringVector = new Vector<>();
		stringVector.add("January");
		stringVector.add("February");
		stringVector.add("March");
		stringVector.add("April");
		stringVector.add("May");
		stringVector.add("June");
		stringVector.add("August");
		stringVector.add("September");
		stringVector.add("October");
		stringVector.add("November");
		stringVector.add("December");
		System.out.println("Months of the year :");
		printAll(stringVector);
	}
}


