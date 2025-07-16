package oops;
import java.util.Scanner;
public class CombinedString {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			String b = sc.nextLine();
			StringBuffer result = new StringBuffer();
			int i =0,j =0;
			while(i <a.length() && j <b.length()) {
				result.append(a.charAt(i++));
				result.append(b.charAt(j++));
			}
			while(i <a.length()) {
				result.append(a.charAt(i++));
			}
			while( j < b.length()) {
				result.append(b.charAt(j++));	
			}
			System.out.println(result.toString());
			sc.close();

		}

	}
