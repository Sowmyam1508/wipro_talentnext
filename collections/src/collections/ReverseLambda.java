package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseLambda {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("cherry");
		al.add("date");
		al.add("elderberry");
		al.add("fig");
		al.add("grape");
		al.add("honeydew");
		al.add("kiwi");
		al.add("lemon");
		Collections.reverse(al);
		al.forEach(word -> System.out.println(word));
	}
}
