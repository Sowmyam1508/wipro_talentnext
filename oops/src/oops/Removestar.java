package oops;
import java.util.Scanner;
public class Removestar {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String s =sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i =0;i<s.length();i++) {
				if(s.charAt(i) =='*') continue;
				if((i > 0 && s.charAt(i -1) == '*')|| (i <s.length() -1 && s.charAt(i + 1)=='*')) continue;
				sb.append(s.charAt(i));
			}
			System.out.println(sb);
			sc.close();
			

		}

	}

