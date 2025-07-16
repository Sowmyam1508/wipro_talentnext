package oops;
import java.util.Scanner;
public class LastShort_String {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			if(str1.length() <str2.length()) {
				System.out.println(str1 + str2 +str1);
			}
			else {
				System.out.println(str2 + str1 +str2);
			}
			sc.close();
			

		}

	}
