/**
 * Purpose:To find permutation of string
 * @author Official_vk
 * @version 1.0
 * @since 25/07/2021
 * 
 */

package com.bridgelabz;

//Java program for implementation of Insertion Sort
public class InsertionSort {

	/* Function to sort array using insertion sort */
	static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	// Driver method
	public static void main(String a[]) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		/* print array of size n */
		System.out.println("Before Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		insertionSort(arr1);// sorting array using insertion sort
		/* print array of size n */
		System.out.println("After Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
