package com.bridgelabz;

public class BinarySearch<T extends Comparable<T>> {

	/**
	 * This method search the word from list of words
	 * 
	 * @param arr of String
	 * @param x   the key to be found
	 * @return
	 */
	public int binarySearch(T[] arr, T x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = x.compareTo(arr[m]);
			if (res == 0)
				return m;
			if (res > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}
}
