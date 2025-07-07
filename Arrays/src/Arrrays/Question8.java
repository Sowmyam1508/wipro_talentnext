package Arrrays;

import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int y= sc.nextInt();
		int sum = 0;
		boolean skip = false;

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				skip = true;
				continue;
			}
			if (skip) {
				if (arr[i] == y) {
					skip = false;
				}
				continue;
			}
			sum += arr[i];
		}

		System.out.println("Sum: " + sum);
	}
}
