package oops;
import java.util.*;
public class Ncopies {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int n = str.length();
			String firstTwo = str.length() >=2 ?str.substring(0,2):str;
			
			StringBuilder  result = new StringBuilder();
			for(int i =0;i<n;i++) {
				result.append(firstTwo);
			}
			System.out.println(result.toString());
			sc.close();
	}

}
