package oops;
import java.util.*;
public class First_last {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if(str.length()>1) {
				String res = str.substring(1,str.length()-1);
				System.out.println(res);
			}
			else {
				System.out.println("Invalid input");
			}
			sc.close();
		}

	}

