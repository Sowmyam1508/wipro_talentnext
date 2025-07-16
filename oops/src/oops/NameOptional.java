package oops;

import java.util.Optional;

public class NameOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = new String[5];
		// names[0] = "Srujana";
		Optional<String> optionalName = Optional.ofNullable(names[0]);

		if (optionalName.isPresent()) {
			System.out.println("Length: " + optionalName.get().length());
		} else {
			System.out.println("Value is null, cannot get length.");
		}
	}

}
