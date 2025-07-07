package Arrrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 1; i < n; i++) {
			if (arr[i] != smallest) {
				secondSmallest = arr[i];
				break;
			}
		}
		int largest = arr[n - 1];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != largest) {
				secondLargest = arr[i];
				break;
			}
		}

		System.out.println(smallest + ", " + secondSmallest);
		System.out.println(secondLargest + ", " + largest);
	}
}
