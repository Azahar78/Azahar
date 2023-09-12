package com.array;

import java.util.Arrays;

public class ArraySorting {

	  public static void  main(String[] args) {
		
		  int[] arr= {8,2,4,9,0,1,7,3};
		  
		 // int[] arr= {1,1,0,1,0,0,1,0};
		  
		  int temp=0;
		  
		  System.out.println(Arrays.toString(arr));
		  System.out.println();
		  
		  // program for ascending and descending 
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  for(int j=i+1; j<arr.length;j++) {
				  // For Ascending 
				  if(arr[i]>arr[j]) {
					  
					  // For desceding arr[i]<arr[j] 
					  
					  temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				  }
				  
				 
			  }
		  }
		  
		  System.out.println(Arrays.toString(arr));
		  
		  // program to find pair of element whose sum is equal to 8
		  
		   int[] array  = {3,5,1,6,2,7,9};
		   
		   int sum=8;
		   
		  
		  
            for(int i=0;i<array.length;i++) {
			  
			  for(int j=i+1; j<array.length;j++) {
				  // For Ascending 
				  if(array[i]+array[j]==sum) {
					  
					 System.out.println(array[i]+" + "+array[j]+" =  "+sum);
				  }
				  
				
			  }
		  }
            System.out.println("=================================================");
            // program to find non repeated element from array
            
            int[] num= {4,2,1,4,5,1,7};
            
            for(int i=0;i<num.length;i++) {
            	
            	int count=0;
            	
            	for(int j=0;j<num.length;j++) {
            		
            		
            		if(num[i]==num[j] && i!=j) {
            			count++;
            			
            		}
            	}
            	
            	if(count==0) {
            		System.out.print(num[i]+" ");
            			
            	}
            	
              }
	}
	
}
