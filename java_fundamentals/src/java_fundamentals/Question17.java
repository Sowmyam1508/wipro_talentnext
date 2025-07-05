package java_fundamentals;
import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		for(int temp=num;temp>0;temp/=10) {
			int digit = temp%10;
			sum+=digit;
		}
		System.out.println(sum);
	}

}
