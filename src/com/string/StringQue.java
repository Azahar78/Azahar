package com.string;

import java.util.Arrays;

public class StringQue {

	public static void main(String[] args) {

		//1. count total number of occurance of given character of string

		String s = "javaaav";
		
		char ch ='a';
		
		char[] cs = s.toCharArray();
		
		int count=0;
		
		/*
		for(int i =0;i<cs.length;i++) {
			
			if(cs[i]==ch) {
				count++;
			}
		}
		*/
		for(int i =s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(" a ouccure times  "+count);
		System.out.println("==========================================================");
		
		//2. resverse given String
		
		String s1 = "Java is Best";
		String rev="";
		//StringBuffer sb = new StringBuffer(s1);
		//System.out.println(sb.reverse());
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			rev+=s1.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println("==========================================================");

		//3. Check given String Is Palidrom or not madam,liril
		
		String s2 = "liril";
	
		StringBuffer sb = new StringBuffer(s2).reverse();
		
		if(s2.equals(sb.toString())) {
			
			System.out.println("Given String Is Palidrom");
		}
		else {
			System.out.println("Given String Is not Palidrom");
		}
		
		System.out.println(s2+" ==> "+sb);
		
		System.out.println("==========================================================");
		
		//4. Check given Strig anagrams Or not
		
		String sa1="bokk";
		String sa2="kobk";
		char[] cs1  =  sa1.toCharArray();
		char[] cs2 = sa2.toCharArray();
		
		
		
		
		Arrays.sort(cs2);
		Arrays.sort(cs1);
		/*
		 * if(sa1.length()!=sa2.length()) {
		 * 
		 * 
		 * }
		 */
		String isAnagram=(Arrays.equals(cs1,cs2))?"Given String Is Anagram":"Given String Is not Anagram";
	
	    System.out.println(isAnagram);
		
	    System.out.println("==========================================================");
		
	    // 5. Swap two String without using 3rd Variable
	    
	    String str1="javascript";
	    String str2="java";
	    
	    str1=str1.concat(str2);
	    
	    str2 = str1.substring(0,str1.length()-str2.length());
	    
	    str1 = str1.substring(str2.length());
	    
	    System.out.println("String 1"+str1 +" :: "+" String 2 "+str2);
	    
	    System.out.println("========================================================");
	    
	    //6. remove vowels from string
	    
	    String string ="hello,Alizabaith good eveing";
	    
	    String newstr=string.replaceAll("[aeiouAEIOU]","");
	    
	    System.out.println(newstr);
	    
	    System.out.println("========================================================");
	    
	    //7. reverse each word in given string 
	    
	    String revstr ="hello,Alizabaith good eveing";
	    
	    String[] strings = revstr.split(" ");
	    
	    for(int i=0;i<strings.length;i++) {
	    	
	    	String x = strings[i];
	    	
	    	StringBuffer sbb = new StringBuffer(x).reverse();
	    	
	    	System.out.print(sbb+" ");
	    	
	    	
	    }
	    
	    
        System.out.println("========================================================");
	    
	    //8. count no of word in given string 
	    
        String cntstr ="hello Alizabaith good eveing is are";
        
        // \\s 
        
        String[] ar = cntstr.trim().split("\\s+");
	    
	    System.out.println(ar.length);
	}
}
