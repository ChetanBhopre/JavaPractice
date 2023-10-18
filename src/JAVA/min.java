package JAVA;

public class min {

	public static void main(String[] args) {
		int[][] b = { { 1, 2, 4 }, { 2, 3, 5 }, { 0, 6, 11 } };

		int min = b[0][0];
		

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				if(b[i][j]<min) {
					min=b[i][j];
				}

			}
		}
		System.out.println(min);

	}

}
