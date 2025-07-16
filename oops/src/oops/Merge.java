package oops;
import java.util.StringJoiner;
public class Merge {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringJoiner s1 = new StringJoiner("-");
			s1.add("sowmya");
			s1.add("nani");
			//System.out.println("s1: " +s1);
			StringJoiner s2 = new StringJoiner("-");
			s2.add("puttaparthi");
			s2.add("hyderabad");
			//System.out.println();
			s1.merge(s2);
			s2.merge(s1);
			System.out.println(s1);
			
			System.out.println(s2);

		}

	}
