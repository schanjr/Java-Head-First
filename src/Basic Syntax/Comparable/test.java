package tutorial61;

import java.util.Collections;
import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		int[] numsArray = {3, 4, 61, 6, 1, 34, 4, 7, 3};

		int index = 0;
		for (int num : numsArray) {
			int dex1 = index;
			int dex2 = dex1 + 1;

			System.out.println("First number: " + numsArray[dex1]
					+ " Second number: " + numsArray[dex2]);
			System.out.println(compare(numsArray[dex1], numsArray[dex2]));
			index = dex2;
		}
	}
	public static int compare(Integer o1, Integer o2) {
		return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0; //really awesome new way of implementing something like if statements. 
	}
}
