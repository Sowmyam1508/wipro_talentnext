package java_fundamentals;
//import java.util.Scanner;
//public class Question4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a<0) {
//			System.out.println("Negative");
//		}else if(a>0) {
//			System.out.println("Positive");
//		}else {
//			System.out.println("Zero");
//		}
//	}
//}


import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
//		if(a>0 || b>0) {
//			System.out.println("enter non negative values.");
//			
//		}
		int lastdigit1 = a%10;
		int lastdigit2 = b%10;
		if (lastdigit1 == lastdigit2){
			System.out.print(true);
		}
		else {
			System.out.println(false);
		}
	}
	}