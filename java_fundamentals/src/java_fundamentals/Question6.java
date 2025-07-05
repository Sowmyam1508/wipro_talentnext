package java_fundamentals;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s=="") {
			System.out.println("No values");
		}
		else {
			String[] words=s.split(" ");
			String result=String.join(",", words);
			System.out.println(result);
		}

	}

}