package JAVA;

import java.util.TreeSet;

public class demo {

	public static void main(String[] args) {
		// soaterd
		// max
		// min

		int[] value = { 10, 1, 15, 20, 6 };
		int temp = 0;
		int max = value[0];
		int min = value[0];

		TreeSet ls = new TreeSet();
		for (int i = 0; i < value.length; i++) {
			ls.add(value[i]);
		}
		System.out.println(ls);

		for (int i = 0; i < value.length; i++) {
			for (int j = i + 1; j < value.length; j++) {

				if (value[i] > value[j]) {

					temp = value[i];
					value[i] = value[j];

					value[j] = temp;

				}
				if (max < value[i]) {
					max = value[i];
				}

				if (min > value[i]) {
					min = value[i];
				}

			}

			System.out.println("sorted :" + value[i]);
		}

		System.out.println("Max value :" + max);
		System.out.println("Min value :" + min);
	}

}
