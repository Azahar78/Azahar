package com.controlstatement;

import java.io.IOException;

public class DemoElseIf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//BufferedReader reader 
		//          = new BufferedReader(new InputStreamReader(System.in));
	
		
		/*for(int i=1;i<=5;i++) {
			
			System.out.println("==========================");
			System.out.println("Outter Loop => "+i);
			System.out.println("==========================");
			for(int j=1;j<=5;j++) {
				System.out.println("inner Loop => "+j);
			}
			
		}*/
		
		/*  Patter 
		 * *
		 * *
		 * * *
		 * * * *
		 * * * * *
		*/
		
		/*
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		System.out.println("==================================================");
	
		/*
		     *
		   * *
		  * * *
		* * * *
	  * * * * *
		
	*/	
		  for(int i=1;i<=5;i++) {
				
	        	 for(int k=5-i;k>=1;k--) {
	        		 System.out.print(" ");
	        	 }
	        	 
	        	 
				for(int j=1;j<=i;j++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			}
		
		
		
		
		System.out.println("==================================================");
	/*	
	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * 
    */
		
		
         for(int i=1;i<=5;i++) {
			
        	 for(int k=5-i;k>=1;k--) {
        		 System.out.print(" ");
        	 }
        	 
        	 
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
}
