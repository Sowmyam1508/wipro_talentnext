package Arrrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int []arr2=new int[n];
		int uniquecount =0;
		for(int i=0;i<n;i++) {
		boolean isduplicate = false;
		for(int j=0;j<uniquecount;j++) {
			if(arr[i]==arr2[j]) {
				isduplicate=true;
				break;
			}
		}
		if(!isduplicate) {
			arr2[uniquecount]=arr[i];
			uniquecount++;
		}

	}
		for(int i=0; i<uniquecount; i++) {
			System.out.print(arr2[i]);
			if(i<uniquecount -1) {
				System.out.print(",");
			}
		}
	}

}
