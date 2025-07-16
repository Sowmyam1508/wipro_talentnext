package oops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value: ");
		String s = sc.nextLine();
		String rev ="";
		for(int i =s.length() -1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("It is a palindrome.");
		}
		else {
			System.out.println("It is not a palindrome.");
		}
		sc.close();
	}

}