package Arrrays;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);

	}

}
