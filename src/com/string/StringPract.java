package com.string;

import java.util.Arrays;

public class StringPract {

	public static void main(String[] args) {
	
		// To Sort String array in alphabate order
		
		String s="dacfb";
		
		char[] array = s.toCharArray();
		char temp=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		
		
	}
}
