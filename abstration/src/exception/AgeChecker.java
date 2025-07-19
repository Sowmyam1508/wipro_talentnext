package exception;

public class AgeChecker {
	public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
	}

	public static void main(String[] args) {
	    if (args.length != 2) {
	       System.err.println("Error: Please provide both name and age as command-line arguments.");
	       System.exit(1);
	    }
	    String name = args[0];
        int age;

        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Age must be an integer.");
            System.exit(1); 
            return;  
        }

        try {
            validateAge(age);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
	public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        if (age >= 60) {
            throw new InvalidAgeException("Age must be less than 60.");
        }
    }
}