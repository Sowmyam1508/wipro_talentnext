package collections;

import java.util.Scanner;
class MyNumber {
 public MyNumber(int num) {
     if (isPrime(num)) {
         System.out.println("Prime");
     } else {
         System.out.println("Not Prime");
     }
 }
 private boolean isPrime(int n) {
     if (n <= 1) return false;
     if (n == 2) return true;
     if (n % 2 == 0) return false;
     for (int i = 3; i <= Math.sqrt(n); i += 2) {
         if (n % i == 0) return false;
     }
     return true;
 }
}
@FunctionalInterface
interface NumberChecker {
 MyNumber check(int num);
}
public class ConstructorReferenceDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int input = scanner.nextInt();
     NumberChecker checker = MyNumber::new;
     checker.check(input);

     scanner.close();
 }
}