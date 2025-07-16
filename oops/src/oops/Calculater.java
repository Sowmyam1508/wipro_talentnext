package oops;
import java.util.*;
public class Calculater {
	public static int powerInt(int num1, int num2 ) {
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, double num2) {
		return (double) Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers: ");
		 int intnum1 = sc.nextInt();
		 int intnum2 = sc.nextInt();
		 System.out.println(powerInt(intnum1,intnum2));
		 System.out.println("Enter Double: ");
		 double doublenum1 = sc.nextDouble();
		 double doublenum2 = sc.nextDouble();
		 System.out.println(powerDouble(doublenum1, doublenum2));
		 sc.close();
	}

}
