package exception;
import java.util.Scanner;

class InvalidCountryException extends Exception {

	public InvalidCountryException() {
		super();
	}

	public InvalidCountryException(String message) {
		super(message);
	}

	public InvalidCountryException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCountryException(Throwable cause) {
		super(cause);
	}
}

class UserRegistration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		} else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration registration = new UserRegistration();
		System.out.println("Enter username:");
		String username = sc.nextLine();

		System.out.println("Enter user country:");
		String userCountry = sc.nextLine();

		try {
			registration.registerUser(username, userCountry);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
