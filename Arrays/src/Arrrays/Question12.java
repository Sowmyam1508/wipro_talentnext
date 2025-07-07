package Arrrays;

import java.util.*;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];

		for (int i = 0; i < 3; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] result = new int[2];
		result[0] = arr1[1];
		result[1] = arr2[1];
		System.out.println(Arrays.toString(result));
		sc.close();

	}

}