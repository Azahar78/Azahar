package com.string;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		
		
		String str = "Azahar don Khan ok ";
		String str1 = "Azahar Khatik ok done ";
		
		String[] split = str.split(" ");
		String[] split1 = str1.split(" ");
		
		String repeat="";
		
		for(String st :split) {
			
			
			
			for(String st1:split1) {
				
				if(st.equals(st1)) {
					System.out.println(st1);
					repeat+=st1;
					
				}
			}
		}
		
		System.out.println(repeat);
	}
}
