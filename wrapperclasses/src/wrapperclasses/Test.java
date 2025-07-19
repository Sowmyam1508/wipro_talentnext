package wrapperclasses;
import java.util.*;
import java.util.Scanner;

public class Test {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer number: ");
	        int num = scanner.nextInt();

	        System.out.println("Given Number :" + num);
	        System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
	        System.out.println("Octal equivalent :" + Integer.toOctalString(num));
	        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num));

	        scanner.close();
	    }
	}

