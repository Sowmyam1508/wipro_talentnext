package java_fundamentals;
import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		for(int n=10; n<=99; n++) {
			boolean isprime = true;
			if(n<=1) {
				isprime = false;
			}
			else {
				for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				isprime = false;
				break;
			     }
			}
		}
			if(isprime) {
				System.out.print(n + " ");
			}
		}
	}

}
