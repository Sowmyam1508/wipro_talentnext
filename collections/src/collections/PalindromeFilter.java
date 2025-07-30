package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PalindromeFilter {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("madam");
		words.add("hello");
		words.add("racecar");
		words.add("world");
		words.add("level");
		words.add("java");
		words.add("noon");
		words.add("python");
		words.add("civic");
		words.add("robot");
		Predicate<String> isPalindrome = word -> {
			String reversed = new StringBuilder(word).reverse().toString();
			return word.equalsIgnoreCase(reversed);
		};
		List<String> palindromes = words.stream().filter(isPalindrome).collect(Collectors.toList());
		System.out.println("Palindrome words:");
		palindromes.forEach(System.out::println);
	}
}