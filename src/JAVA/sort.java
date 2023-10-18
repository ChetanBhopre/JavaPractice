package JAVA;

public class sort {

	public static void main(String[] args) {
		int[] a = { 1, 22, 3, 12, 0, 5, 6 };

		int temp = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			System.out.print(a[i]);
		}

	}

}
