package com.array;

public class ArrayDemo {

	public static void main(String...args) {
		
		/*
		int[] arr = new int [5];
		
		arr[0]=12;
		arr[1]=27;
		arr[2]=37;
		arr[3]=47;
		arr[4]=57;
		
		*/
		
		
		
		int[] arr= {12,27,37,47,57};
		
		// To print Reverse Array
	
	
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int ar : arr) {
			System.out.print(ar+" ");
		}
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
	}
}
