package JAVA;

public class sortingArray {

	public static void main(String[] args) {

		// sort as like 012345
		// step: compare 1 value with next and grater value shift to right side uaing
		// 3rd temp veriable
		// outer for (i) with inner for look (j=i+1)

		int[] a = { 1, 2, 0, 1, 3, 0, 11, 2, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}

	}

}
