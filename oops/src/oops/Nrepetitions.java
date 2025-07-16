package oops;
import java.util.Scanner;
public class Nrepetitions {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
					Scanner sc = new Scanner(System.in);
					String s = sc.nextLine();
					int n = sc.nextInt();
					String lastN = s.length() >= n ? s.substring(s.length()- n):s;
					StringBuilder result = new StringBuilder();
					for(int i =0;i<n;i++) {
						result.append(lastN);
					}
					System.out.println(result.toString());
					sc.close();
					
				}

			}