package oops;

import java.util.ArrayList;
import java.util.StringJoiner;

public class SJoiner {
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		StringJoiner s1 = new StringJoiner(",", "{", "}");
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("Apple");
		s2.add("Mango");
		s2.add("Orange");
		s2.add("Banana");
		s2.forEach(element -> s1.add(element));
		System.out.println(s1);

	}

}
