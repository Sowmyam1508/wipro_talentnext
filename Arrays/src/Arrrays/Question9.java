package Arrrays;
import java.util.*;
import java.util.Arrays;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int []result = new int[n];
		int index =0;
		for(int i =0;i<n;i++) {
			if(arr[i] != 10) {
				result[index++] = arr[i];
			}
		}
		System.out.print(Arrays.toString(result) + " ");
		sc.close();

	}

}