package com.array;

import java.util.Arrays;

public class ArrayQue {

	public static void main(String... args) {
 
		// 1. find min and Max elements in Array
        
		
		int[] arr = { 23, 54, -1, 800, 4, 20, 80 };

		// int[] arr = {23,54,1,8,0,4,20};
		
		// with pre- defined method  sort 

		for (int ar : arr) {
			System.out.print(" Array before Sorting := " + ar);
		}

		Arrays.sort(arr);

		for (int ar : arr) {
			System.out.print(" Array after Sorting := " + ar);
		}

		System.out.println(" Minimum number := " + arr[0]);
		System.out.println(" Maximum number := " + arr[arr.length - 1]);

		// without pre- defined method  sort 
		
		int min = arr[0];
		int max = arr[0];

		for (int ar : arr) {

			if (ar > max) {
				max = ar;
			}
			if (ar < min) {
				min = ar;
			}

		}
		System.out.println("Max num " + max);
		System.out.println("Min num " + min);

		// 2. java program to reverse array

		

		System.out.println(Arrays.toString(arr));
		System.out.println();

		// Actual reversing Array

		// Method 1 by Using another array

		int temp1[] = new int[arr.length];

		int count = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			temp1[count] = arr[i];
			count++;
		}

		System.out.println(" temp1 :" + Arrays.toString(temp1));

		// Method 2 by Using temp Variable
		
		int[] arr1 = { 23, 54, 1, 76, 4, 20, 80 };

		int temp = 0;

		for (int i = 0; i < arr1.length / 2; i++) {

			temp = arr1[i];
			arr1[i] = arr1[arr1.length - 1 - i];
			arr1[arr1.length - 1 - i] = temp;

		}

		System.out.println("arr1 := " + Arrays.toString(arr1));

	}

}
