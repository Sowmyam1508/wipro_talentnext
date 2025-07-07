package Arrrays;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 9) {
			System.out.println("Please enter 9 integer numbers.");
			return;
		}
		int[][] array = new int[3][3];
		int index = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = Integer.parseInt(args[index++]);
			}
		}
		int max = array[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("The matrix 3 x 3: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The biggest number in 3 * 3 matrix is: " + max);
	}

}
