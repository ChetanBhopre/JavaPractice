package JAVA;

public class minWithCondition {

	public static void main(String[] args) {
		/*
		  12 2 3
		   12 3 5
		    11 6 11
		 */

//		find Min No
//		identify column of min
//		find Max column in min num
//		

		int[][] b = { { 12, 2, 4 }, { 12, 3, 5 }, { 11, 6, 11 } };

		int min = b[0][0];
		int mincolumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > b[i][j]) {
					min = b[i][j];// -------------------------------identified the min no

					mincolumn = j;// -------------------------------identified the min no column
				}
			}
		}

		int k = 0;
		int max = b[0][mincolumn];
		while (k < 3) {
			if (max < b[k][mincolumn]) {
				max = b[k][mincolumn];
			}
			k++;
		}

		System.out.println("minimun no :-"+min);

		System.out.println("Maximum no :-"+max);
		
		System.out.println(mincolumn);

	}

}
