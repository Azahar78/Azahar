package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Size ");
		
		int size =Integer.parseInt(sc.nextLine());
		
		int[] arr= new int[size];
		
		System.out.println(" Enter '"+size+"' times");
		
		for(int i =0;i<arr.length;i++) {
			
			
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println(Arrays.toString(arr));
		
		String s1="hello";
		//String s2="hello";
		
		String s2=new String("hello");
		
		int a =20;
		
		
		s2.concat("hii");
		
		System.out.println(String.valueOf(a));
		
		System.out.println(s2);
		
		
		if (s1==s2) {
			System.out.println("Same"+s1.hashCode() +"  "+s2.hashCode());
		} else {

			System.out.println("Not Same"+s1.hashCode() +"  "+s2.hashCode());
		}
	}
}
