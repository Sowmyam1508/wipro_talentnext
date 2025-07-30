package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class StringLinkedListDemo {
	public static void printAll(LinkedList<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		LinkedList<String> stringList = new LinkedList<>();
		stringList.add("January");
		stringList.add("February");
		stringList.add("March");
		stringList.add("April");
		stringList.add("May");
		stringList.add("June");
		stringList.add("July");
		stringList.add("August");
		stringList.add("September");
		stringList.add("October");
		stringList.add("November");
		stringList.add("December");
		System.out.println("Months of the year:");
		printAll(stringList);
	}
}
