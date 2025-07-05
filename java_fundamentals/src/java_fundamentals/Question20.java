package java_fundamentals;
import java.util.Scanner;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String reverse = ""; 
	       String num = sc.nextLine(); 
	       int length = num.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + num.charAt(i);  
	      if (num.equals(reverse))  
	         System.out.println(num +" is a palindrome.");  
	      else  
	         System.out.println(num +"  is not a palindrome."); 

	}

}
